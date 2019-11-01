package com.zking.test.biz.impl;

import com.zking.test.biz.IAdminBiz;
import com.zking.test.mapper.AdminMapper;
import com.zking.test.mapper.PermissionMapper;
import com.zking.test.mapper.RoleMapper;
import com.zking.test.model.Admin;
import com.zking.test.model.Permission;
import com.zking.test.model.Role;
import com.zking.test.shiro.PasswordHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("adminBiz")
public class AdminBizImpl implements IAdminBiz {
    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public int doRegister(Admin admin) {
        //md5+盐
        String salt = PasswordHelper.createSalt();
        String credentials = PasswordHelper.createCredentials(admin.getAdminPassword(), salt);

        admin.setAdminSalt(salt);
        admin.setAdminPassword(credentials);
        return adminMapper.insert(admin);
    }

    @Override
    public Admin loadByAdminname(Admin admin) {
        return adminMapper.selectByAdminname(admin.getAdminName());
    }

    @Override
    public String doLogin(Admin admin) {
        String message = null;
        Admin a = adminMapper.selectByAdminname(admin.getAdminName());
        if (null == a || !PasswordHelper.checkCredentials(admin.getAdminPassword(), a.getAdminSalt(), a.getAdminPassword())) {
            message = "帐号或密码错误";
        } else if (new Integer(1).equals(a.getAdminLocked())) {
            message = "帐号已锁定，请与管理员联系";
        }
        return message;
    }

    @Override
    public Set<String> listPermissionsByUserName(Admin admin) {
        return new HashSet<String>(adminMapper.listPermissionsByUserName(admin));
    }

    @Override
    public Set<String> listRolesByUserName(Admin user) {
        return new HashSet<String>(adminMapper.listRolesByUserName(user));
    }

    @Override
    public int updatePassword(Admin admin) {
        //md5+盐
        String salt = PasswordHelper.createSalt();
        String credentials = PasswordHelper.createCredentials(admin.getAdminPassword(), salt);


        Admin u = new Admin();
        u.setAdminName(admin.getAdminName());
        u.setAdminPassword(credentials);
        u.setAdminSalt(salt);

        return adminMapper.updateByPrimaryKeySelective(u);
    }

    @Override
    public int doResetPassword(Admin admin) {
        //md5+盐
        String salt = PasswordHelper.createSalt();
        String credentials = PasswordHelper.createCredentials(Admin.DEFAULT_PASSWORD, salt);


        Admin u = new Admin();
        u.setAdminName(admin.getAdminName());
        u.setAdminPassword(credentials);
        u.setAdminSalt(salt);

        return adminMapper.updateByPrimaryKeySelective(u);
    }
}
