package com.zking.test.model;

import java.io.Serializable;

public class Role implements Serializable{
    private Long roleId;

    private String roleName;

    private String roleDesc;

    private String roleLocked;

    //parameters
    private Long userId;
    private Long permissionId;

    public Role(Long roleId, String roleName, String roleDesc, String roleLocked) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleDesc = roleDesc;
        this.roleLocked = roleLocked;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    public Role() {
        super();
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public String getRoleLocked() {
        return roleLocked;
    }

    public void setRoleLocked(String roleLocked) {
        this.roleLocked = roleLocked;
    }
}