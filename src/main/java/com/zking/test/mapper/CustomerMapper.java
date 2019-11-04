package com.zking.test.mapper;

import com.zking.test.model.ContractManagement;
import com.zking.test.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomerMapper {
    int deleteByPrimaryKey(Long customerId);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Long customerId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    List<Customer> selectByCustomer(Customer customer);

    int updateByCustomerStatus(Customer customer);

}