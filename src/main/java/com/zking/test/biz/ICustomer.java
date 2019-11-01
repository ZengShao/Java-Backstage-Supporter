package com.zking.test.biz;

import com.zking.test.model.Customer;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ICustomer {
    int deleteByPrimaryKey(Long customerId);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Long customerId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}
