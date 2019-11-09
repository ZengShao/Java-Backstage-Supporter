package com.zking.test.model;

import java.util.Date;

public class Apply {
    private Long applyId;

    private Long customerId;

    private Long productId;

    private Long adminId;

    private Date applyTime;

    private Date approveTime;

    private Integer admId;

    private String interest;

    private String perMoney;

    private Integer state;

    public Apply(Long applyId, Long customerId, Long productId, Long adminId, Date applyTime, Date approveTime, Integer admId, String interest, String perMoney, Integer state) {
        this.applyId = applyId;
        this.customerId = customerId;
        this.productId = productId;
        this.adminId = adminId;
        this.applyTime = applyTime;
        this.approveTime = approveTime;
        this.admId = admId;
        this.interest = interest;
        this.perMoney = perMoney;
        this.state = state;
    }

    public Apply() {
        super();
    }

    public Long getApplyId() {
        return applyId;
    }

    public void setApplyId(Long applyId) {
        this.applyId = applyId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Date getApproveTime() {
        return approveTime;
    }

    public void setApproveTime(Date approveTime) {
        this.approveTime = approveTime;
    }

    public Integer getAdmId() {
        return admId;
    }

    public void setAdmId(Integer admId) {
        this.admId = admId;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getPerMoney() {
        return perMoney;
    }

    public void setPerMoney(String perMoney) {
        this.perMoney = perMoney;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}