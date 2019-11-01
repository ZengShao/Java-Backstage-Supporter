package com.zking.test.mapper;

import com.zking.test.model.Admin;
import com.zking.test.model.Permission;
import com.zking.test.model.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.List;
@Repository
public interface AdminMapper {
    int deleteByPrimaryKey(Long adminId);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Long adminId);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    Admin selectByAdminname(String username);

    List<String> listPermissionsByUserName(Admin admin);//查询指定用户拥有的权限

    List<String> listRolesByUserName(Admin admin);//查询指定用户拥有的角色


}