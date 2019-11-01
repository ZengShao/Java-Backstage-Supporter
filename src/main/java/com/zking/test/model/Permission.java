package com.zking.test.model;

import java.util.ArrayList;
import java.util.List;

public class Permission {
    private Long permissionId;

    private String permissionName;

    private Integer level;

    private Integer permissionParentId;

    private Integer available;

    private String permission;

    private  String icon;

    private String url;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private List<Permission> children = new ArrayList<Permission>();

    public Permission(Long permissionId, String permissionName, Integer level, Integer permissionParentId, Integer available, String permission, String icon, String url) {
        this.permissionId = permissionId;
        this.permissionName = permissionName;
        this.level = level;
        this.permissionParentId = permissionParentId;
        this.available = available;
        this.permission = permission;
        this.icon = icon;
        this.url = url;
    }

    public Permission() {
        super();
    }


    public Integer getPermissionParentId() {
        return permissionParentId;
    }

    public List<Permission> getChildren() {
        return children;
    }

    public void setChildren(List<Permission> children) {
        this.children = children;
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}