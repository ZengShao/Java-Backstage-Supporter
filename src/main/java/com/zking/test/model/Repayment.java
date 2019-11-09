package com.zking.test.model;

import java.util.Date;

public class Repayment {
    private Long repaymentId;

    private Long customerId;

    private Long applyId;

    private Date repaymentTime;

    private String repaymentMoney;

    private String residueMoney;

    private Long adminId;

    private Integer residueState;

    public Repayment(Long repaymentId, Long customerId, Long applyId, Date repaymentTime, String repaymentMoney, String residueMoney, Long adminId, Integer residueState) {
        this.repaymentId = repaymentId;
        this.customerId = customerId;
        this.applyId = applyId;
        this.repaymentTime = repaymentTime;
        this.repaymentMoney = repaymentMoney;
        this.residueMoney = residueMoney;
        this.adminId = adminId;
        this.residueState = residueState;
    }

    public Repayment() {
        super();
    }

    public Long getRepaymentId() {
        return repaymentId;
    }

    public void setRepaymentId(Long repaymentId) {
        this.repaymentId = repaymentId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getApplyId() {
        return applyId;
    }

    public void setApplyId(Long applyId) {
        this.applyId = applyId;
    }

    public Date getRepaymentTime() {
        return repaymentTime;
    }

    public void setRepaymentTime(Date repaymentTime) {
        this.repaymentTime = repaymentTime;
    }

    public String getRepaymentMoney() {
        return repaymentMoney;
    }

    public void setRepaymentMoney(String repaymentMoney) {
        this.repaymentMoney = repaymentMoney;
    }

    public String getResidueMoney() {
        return residueMoney;
    }

    public void setResidueMoney(String residueMoney) {
        this.residueMoney = residueMoney;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public Integer getResidueState() {
        return residueState;
    }

    public void setResidueState(Integer residueState) {
        this.residueState = residueState;
    }
}