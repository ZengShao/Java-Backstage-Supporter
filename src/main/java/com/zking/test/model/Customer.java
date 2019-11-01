package com.zking.test.model;

import java.util.Date;

public class Customer {
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

    private String customerBorrowMoney;

    private Integer customerPeriods;


    public Customer(Long customerId, String customerName, Long customerTel, String customerPassword, String customerSalt, Integer customerLevel, String customerIdNumber, String customerAddress, String customerBank, Date customerTime, String customerBorrowMoney, Integer customerPeriods) {
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
        this.customerBorrowMoney = customerBorrowMoney;
        this.customerPeriods = customerPeriods;
    }

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

    public Customer() {
        super();
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
}