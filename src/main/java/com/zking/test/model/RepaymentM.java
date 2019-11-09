package com.zking.test.model;

import java.util.Date;

public class RepaymentM {
    private Long repaymentId;

    private Long customerId;

    private Long applyId;

    private Date repaymentTime;

    private String repaymentMoney;

    private String residueMoney;

    private Long adminId;

    private Integer residueState;



    private String customerName;

    private Long customerTel;

    private String customerPassword;

    private String customerSalt;

    private Integer customerLevel;

    private String customerIdNumber;

    private String customerAddress;

    private String customerBank;

    private Date customerTime;

    private String customerBorrowMoney;

    private Integer customerPeriods;

    private String customerStatus;

    private String customerCardPhoto;

    private String customerBankPhoto;

    public RepaymentM(Long repaymentId, Long customerId, Long applyId, Date repaymentTime, String repaymentMoney, String residueMoney, Long adminId, Integer residueState, String customerName, Long customerTel, String customerPassword, String customerSalt, Integer customerLevel, String customerIdNumber, String customerAddress, String customerBank, Date customerTime, String customerBorrowMoney, Integer customerPeriods, String customerStatus, String customerCardPhoto, String customerBankPhoto) {
        this.repaymentId = repaymentId;
        this.customerId = customerId;
        this.applyId = applyId;
        this.repaymentTime = repaymentTime;
        this.repaymentMoney = repaymentMoney;
        this.residueMoney = residueMoney;
        this.adminId = adminId;
        this.residueState = residueState;
        this.customerName = customerName;
        this.customerTel = customerTel;
        this.customerPassword = customerPassword;
        this.customerSalt = customerSalt;
        this.customerLevel = customerLevel;
        this.customerIdNumber = customerIdNumber;
        this.customerAddress = customerAddress;
        this.customerBank = customerBank;
        this.customerTime = customerTime;
        this.customerBorrowMoney = customerBorrowMoney;
        this.customerPeriods = customerPeriods;
        this.customerStatus = customerStatus;
        this.customerCardPhoto = customerCardPhoto;
        this.customerBankPhoto = customerBankPhoto;
    }

    public RepaymentM() {
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

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(Long customerTel) {
        this.customerTel = customerTel;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public String getCustomerSalt() {
        return customerSalt;
    }

    public void setCustomerSalt(String customerSalt) {
        this.customerSalt = customerSalt;
    }

    public Integer getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(Integer customerLevel) {
        this.customerLevel = customerLevel;
    }

    public String getCustomerIdNumber() {
        return customerIdNumber;
    }

    public void setCustomerIdNumber(String customerIdNumber) {
        this.customerIdNumber = customerIdNumber;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerBank() {
        return customerBank;
    }

    public void setCustomerBank(String customerBank) {
        this.customerBank = customerBank;
    }

    public Date getCustomerTime() {
        return customerTime;
    }

    public void setCustomerTime(Date customerTime) {
        this.customerTime = customerTime;
    }

    public String getCustomerBorrowMoney() {
        return customerBorrowMoney;
    }

    public void setCustomerBorrowMoney(String customerBorrowMoney) {
        this.customerBorrowMoney = customerBorrowMoney;
    }

    public Integer getCustomerPeriods() {
        return customerPeriods;
    }

    public void setCustomerPeriods(Integer customerPeriods) {
        this.customerPeriods = customerPeriods;
    }

    public String getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(String customerStatus) {
        this.customerStatus = customerStatus;
    }

    public String getCustomerCardPhoto() {
        return customerCardPhoto;
    }

    public void setCustomerCardPhoto(String customerCardPhoto) {
        this.customerCardPhoto = customerCardPhoto;
    }

    public String getCustomerBankPhoto() {
        return customerBankPhoto;
    }

    public void setCustomerBankPhoto(String customerBankPhoto) {
        this.customerBankPhoto = customerBankPhoto;
    }
}
