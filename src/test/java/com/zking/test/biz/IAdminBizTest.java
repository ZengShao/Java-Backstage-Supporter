package com.zking.test.biz;

import com.zking.test.model.Admin;
import com.zking.test.model.Permission;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;

public class IAdminBizTest extends BaseTestCase {

    @Autowired
    private IAdminBiz adminBiz;

    private Admin admin;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        admin = new Admin();
    }

    @Test
    public void loadByUsername() throws Exception {
        admin.setAdminName("zs");
        Admin u = adminBiz.loadByAdminname(this.admin);
        System.out.println(u);

    }

    @Test
    public void doLogin() throws Exception {
        admin.setAdminName("zj");
        admin.setAdminPassword("888888");
        String message = adminBiz.doLogin(admin);
        System.out.println(message);
    }

    @Test
    public void doRegister() throws Exception {
        //user.setUsername("zs");
        admin.setAdminName("zj");
        admin.setAdminLocked(0);
        admin.setAdminPassword("888888");
        int rowCount = adminBiz.doRegister(admin);
        System.out.println(rowCount);
        System.out.println(admin.getAdminId());
    }

    @Test
    public void listPermissionsByUserName() throws Exception {
        admin.setAdminName("ls");

        Set<String> permissions = adminBiz.listPermissionsByUserName(admin);
        System.out.println(permissions);
    }


    @Test
    public void updatePassword() throws Exception {
        admin.setAdminName("admin");
        admin.setAdminPassword("123456");

        int rowCount = adminBiz.updatePassword(admin);
        System.out.println(rowCount);
    }

    @Test
    public void doResetPassword() throws Exception {
        admin.setAdminName("zs");
        admin.setAdminPassword("123456");

        int rowCount = adminBiz.doResetPassword(admin);
        System.out.println(rowCount);
    }
}