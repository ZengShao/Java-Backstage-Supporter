package com.zking.test.biz;

import com.zking.test.model.Customer;
import com.zking.test.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ICustomer {
    int deleteByPrimaryKey(Long customerId);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Long customerId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    List<Customer> selectByCustomer(Customer customer,PageBean pageBean);

    int updateByCustomerStatus(Customer customer);
}
