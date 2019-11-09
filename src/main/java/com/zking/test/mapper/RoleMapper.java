package com.zking.test.mapper;

import com.zking.test.model.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {
    int delete(Role role);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    int doGrantRoleToUser(Role role);//给用户分配角色
    int doRevokeRoleFromUser(Role role);//从用户收回角色
    int doGrantPermissionToRole(Role role);//给角色分配权限
    int doRevokePermissionFromRole(Role role);//从角色收回权限

    List<Role> selectByRoleDesc(Role role);

    Role load(String adminName);
}