package com.zking.test.model;

import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Date;
@Repository
public class Admin implements Serializable {

    public static final String DEFAULT_PASSWORD = "888888";

    private Long adminId;

    private String adminName;

    private String adminPassword;

    private String adminSalt;

    private Integer adminLocked;

    private Date createDatetime;

    public Admin(Long adminId, String adminName, String adminPassword, String adminSalt, Integer adminLocked, Date createDatetime) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminPassword = adminPassword;
        this.adminSalt = adminSalt;
        this.adminLocked = adminLocked;
        this.createDatetime = createDatetime;
    }

    public Admin() {
        super();
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdminSalt() {
        return adminSalt;
    }

    public void setAdminSalt(String adminSalt) {
        this.adminSalt = adminSalt;
    }

    public Integer getAdminLocked() {
        return adminLocked;
    }

    public void setAdminLocked(Integer adminLocked) {
        this.adminLocked = adminLocked;
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + adminId +
                ", username='" + adminName + '\'' +
                ", password='" + adminPassword + '\'' +
                ", salt='" + adminSalt + '\'' +
                ", locked=" + adminLocked +
                ", createDatetime=" + createDatetime +
                '}';
    }
}