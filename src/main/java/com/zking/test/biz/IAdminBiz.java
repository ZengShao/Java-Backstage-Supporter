package com.zking.test.biz;

import com.zking.test.model.Admin;
import com.zking.test.model.Permission;
import com.zking.test.model.Role;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;
@Transactional
public interface IAdminBiz {

    int doRegister(Admin admin);//用户注册

    String doLogin(Admin admin);//用户登陆

    int updatePassword(Admin admin);//所有人都可以修改自己的密码

    int doResetPassword(Admin admin);//管理员可以重置所有人的密码，密码默认值为888888

    //权限关键接口
    Admin loadByAdminname(Admin admin);//根据用户名查询用户

    Set<String> listPermissionsByUserName(Admin admin);//查询指定用户拥有的权限

    Set<String> listRolesByUserName(Admin admin);//查询指定用户拥有的角色
}

