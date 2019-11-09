package com.zking.test.biz;

import com.zking.test.model.Customer;
import com.zking.test.model.CustomerM;
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

    List<CustomerM> bindCustomer(Customer customer, PageBean pageBean);
    List<CustomerM> bindCustomer1(Customer customer, PageBean pageBean);
    List<CustomerM> bindCustomer2(Customer customer, PageBean pageBean);
    List<CustomerM> bindCustomer3(Customer customer, PageBean pageBean);
    List<CustomerM> bindCustomer4(Customer customer, PageBean pageBean);
}
