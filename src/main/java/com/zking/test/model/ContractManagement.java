package com.zking.test.model;

import java.util.Date;

public class ContractManagement {
    private Long adminId;

    private String adminName;

    private String adminPassword;

    private String adminSalt;

    private Integer adminLocked;

    private Date createDatetime;

    private Long customerId;

    private String customerName;

    private Long customerTel;

    private String customerPassword;

    private String customerSalt;

    private Integer customerLevel;

    private String customerIdNumber;

    private String customerAddress;

    private String customerBank;

    private Date customerTime;

    private Long dictId;

    private String dictType;

    private String dictItem;

    private String dictValue;

    private Integer dictIsEditable;

    private Long contractId;

    private Long contractContent;

    private Date contractTime;

    private String customerBorrowMoney;

    private Integer customerPeriods;

    public Integer getCustomerPeriods() {
        return customerPeriods;
    }

    public void setCustomerPeriods(Integer customerPeriods) {
        this.customerPeriods = customerPeriods;
    }

    public String getCustomerBorrowMoney() {
        return customerBorrowMoney;
    }

    public void setCustomerBorrowMoney(String customerBorrowMoney) {
        this.customerBorrowMoney = customerBorrowMoney;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public Long getContractContent() {
        return contractContent;
    }

    public void setContractContent(Long contractContent) {
        this.contractContent = contractContent;
    }

    public Date getContractTime() {
        return contractTime;
    }

    public void setContractTime(Date contractTime) {
        this.contractTime = contractTime;
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

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
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

    public Long getDictId() {
        return dictId;
    }

    public void setDictId(Long dictId) {
        this.dictId = dictId;
    }

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType;
    }

    public String getDictItem() {
        return dictItem;
    }

    public void setDictItem(String dictItem) {
        this.dictItem = dictItem;
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    public Integer getDictIsEditable() {
        return dictIsEditable;
    }

    public void setDictIsEditable(Integer dictIsEditable) {
        this.dictIsEditable = dictIsEditable;
    }

    public ContractManagement() {
    }

    public ContractManagement(Long adminId, String adminName, String adminPassword, String adminSalt, Integer adminLocked, Date createDatetime, Long customerId, String customerName, Long customerTel, String customerPassword, String customerSalt, Integer customerLevel, String customerIdNumber, String customerAddress, String customerBank, Date customerTime, Long dictId, String dictType, String dictItem, String dictValue, Integer dictIsEditable, Long contractId, Long contractContent, Date contractTime, String customerBorrowMoney, Integer customerPeriods) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminPassword = adminPassword;
        this.adminSalt = adminSalt;
        this.adminLocked = adminLocked;
        this.createDatetime = createDatetime;
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerTel = customerTel;
        this.customerPassword = customerPassword;
        this.customerSalt = customerSalt;
        this.customerLevel = customerLevel;
        this.customerIdNumber = customerIdNumber;
        this.customerAddress = customerAddress;
        this.customerBank = customerBank;
        this.customerTime = customerTime;
        this.dictId = dictId;
        this.dictType = dictType;
        this.dictItem = dictItem;
        this.dictValue = dictValue;
        this.dictIsEditable = dictIsEditable;
        this.contractId = contractId;
        this.contractContent = contractContent;
        this.contractTime = contractTime;
        this.customerBorrowMoney = customerBorrowMoney;
        this.customerPeriods = customerPeriods;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
