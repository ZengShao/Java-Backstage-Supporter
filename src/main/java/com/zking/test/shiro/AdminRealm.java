package com.zking.test.shiro;

import com.zking.test.biz.IAdminBiz;
import com.zking.test.model.Admin;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import java.util.Set;

/**
 * 自定义Realm
 */
public class AdminRealm extends AuthorizingRealm {

    private static final Integer LOCKED = new Integer(1);

    //用户对应的角色信息与权限信息都保存在数据库中，通过IUserBiz获取数据
    private IAdminBiz adminBiz;

    public AdminRealm() {
    }

    public AdminRealm(CacheManager cacheManager) {
        super(cacheManager);
    }

    public AdminRealm(CredentialsMatcher matcher) {
        super(matcher);
    }

    public AdminRealm(CacheManager cacheManager, CredentialsMatcher matcher) {
        super(cacheManager, matcher);
    }

    public void setAdminBiz(IAdminBiz adminBiz) {
        this.adminBiz = adminBiz;
    }

    /**
     * 返回一个唯一的Realm名字
     *
     * @return
     */
    @Override
    public String getName() {
        return "AdminRealm";//WeixinRealm,QqRealm,WeixinQqRealm
    }

    /**
     * 判断此Realm是否支持此Token
     *
     * @param token
     * @return
     */
    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof AdminToken;//仅支持UsernamePasswordToken类型的Token
    }

    /**
     * 提供用户信息返回授权信息
     *
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //查询用户已授予的角色及权限
        String adminName = (String) principalCollection.getPrimaryPrincipal();
        Admin admin = new Admin();
        admin.setAdminName(adminName);
        Set<String> permissions = adminBiz.listPermissionsByUserName(admin);
        Set<String> roles = adminBiz.listRolesByUserName(admin);

        //返回授权信息
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.setRoles(roles);//
        authorizationInfo.setStringPermissions(permissions);
        return authorizationInfo;
    }

    /**
     * 提供用户信息返回认证信息(此时未进行密码比较)
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //查询用户已授予的角色及权限
        String adminName = (String) authenticationToken.getPrincipal();
        Admin admin = new Admin();
        admin.setAdminName(adminName);
        Admin u = adminBiz.loadByAdminname(admin);

        if (null == u) {
            throw new UnknownAccountException();//帐号不存在
        }
        if (LOCKED.equals(u.getAdminLocked())) {
            throw new LockedAccountException(); //帐号已锁定
        }

        //交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配，如果觉得人家的不好可以在此判断或自定义实现
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                u.getAdminName(),
                u.getAdminPassword(),
                ByteSource.Util.bytes(u.getAdminSalt()),
                getName()
        );
        return authenticationInfo;
    }
}
