package com.zking.test.mapper;

import com.zking.test.model.Permission;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PermissionMapper {
    int deleteByPrimaryKey(Integer permissionId);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Long permissionId);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

     List<Permission> selectByPermissions(Integer permissionId);

    List<Permission> selectByPermission(Long AdminId);
}