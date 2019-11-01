package com.zking.test.biz;

import com.zking.test.model.Permission;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IPermissionBiz {
    int add(Permission permission);
    int del(Permission permission);


    @Transactional(readOnly = true)
    List<Permission> selectByPermissions(Integer permissionId);

    @Transactional(readOnly = true)
    List<Permission> selectByPermission(Long AdminId);
}
