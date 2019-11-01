package com.zking.test.mapper;

import com.zking.test.model.Contract;
import com.zking.test.model.ContractManagement;
import com.zking.test.model.Customer;

import java.util.List;


public interface ContractMapper {
    int deleteByPrimaryKey(Long contractId);

    int insert(Contract record);

    int insertSelective(Contract record);

    Contract selectByPrimaryKey(Long contractId);

    int updateByPrimaryKeySelective(Contract record);

    int updateByPrimaryKey(Contract record);

    List<ContractManagement> selectByContractManagement(Customer customer);
}