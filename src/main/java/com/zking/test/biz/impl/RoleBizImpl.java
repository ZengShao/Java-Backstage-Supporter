package com.zking.test.biz.impl;

import com.zking.test.biz.IRoleBiz;
import com.zking.test.mapper.RoleMapper;
import com.zking.test.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleBizImpl implements IRoleBiz {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public int add(Role role) {
        return roleMapper.insert(role);
    }

    @Override
    public int del(Role role) {
        return roleMapper.delete(role);
    }

    @Override
    public int doGrantRoleToUser(Role role) {
        return roleMapper.doGrantRoleToUser(role);
    }

    @Override
    public int doRevokeRoleFromUser(Role role) {
        return roleMapper.doRevokeRoleFromUser(role);
    }

    @Override
    public Role load(String admin1) {
        return roleMapper.load(admin1);
    }

    @Override
    public int doGrantPermissionToRole(Role role) {
        return roleMapper.doGrantPermissionToRole(role);
    }

    @Override
    public int doRevokePermissionFromRole(Role role) {
        return roleMapper.doRevokePermissionFromRole(role);
    }

    @Override
    public List<Role> selectByRoleDesc(Role role) {
        return roleMapper.selectByRoleDesc(role);
    }
}
