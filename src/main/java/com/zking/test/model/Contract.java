package com.zking.test.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
    private Long contractId;

    private Long adminId;

    private Long customerId;

    private Long contractContent;

    private Date contractTime;

    private List<ContractManagement> contractManagementList;

    public Contract(Long contractId, Long adminId, Long customerId, Long contractContent, Date contractTime) {
        this.contractId = contractId;
        this.adminId = adminId;
        this.customerId = customerId;
        this.contractContent = contractContent;
        this.contractTime = contractTime;
    }

    public Contract() {
        super();
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
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
}