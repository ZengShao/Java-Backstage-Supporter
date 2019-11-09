package com.zking.test.model;

import java.util.Date;

public class CustomerM {
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

    public CustomerM(Long applyId, Long customerId, Long productId, Long adminId, Date applyTime, Date approveTime, Integer admId, String interest, String perMoney, Integer state, String customerName, Long customerTel, String customerPassword, String customerSalt, Integer customerLevel, String customerIdNumber, String customerAddress, String customerBank, Date customerTime, String customerBorrowMoney, Integer customerPeriods, String customerStatus, String customerCardPhoto, String customerBankPhoto) {
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

    public CustomerM() {
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
