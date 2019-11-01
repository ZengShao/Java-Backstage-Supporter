package com.zking.test.biz.impl;

import com.zking.test.biz.IPermissionBiz;
import com.zking.test.mapper.AdminMapper;
import com.zking.test.mapper.PermissionMapper;
import com.zking.test.model.Admin;
import com.zking.test.model.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("permissionBiz")
public class PermissionBizImpl implements IPermissionBiz {

    @Autowired
    private PermissionMapper permissionMapper;


    @Override
    public int add(Permission permission) {
        return permissionMapper.insert(permission);
    }

    @Override
    public int del(Permission permission) {
        return permissionMapper.deleteByPrimaryKey(permission.getLevel());
    }

    @Override
    public List<Permission> selectByPermissions(Integer permissionId) {
        return permissionMapper.selectByPermissions(permissionId);
    }

    @Override
    public List<Permission> selectByPermission(Long adminId) {
        List<Permission> sysNodes = permissionMapper.selectByPermission(adminId);
        System.out.println(sysNodes);
        for ( Permission pp :sysNodes) {
            String ds=pp.getPermissionId()+"";

            List<Permission>  ssa= permissionMapper.selectByPermissions(Integer.parseInt(ds));
            pp.setChildren(ssa);
        }
        return sysNodes;
    }

}
