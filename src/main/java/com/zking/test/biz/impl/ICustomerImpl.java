package com.zking.test.biz.impl;

import com.zking.test.biz.ICustomer;
import com.zking.test.model.Customer;
import org.springframework.stereotype.Service;

@Service("CustomerImplBiz")
public class ICustomerImpl implements ICustomer {
    @Override
    public int deleteByPrimaryKey(Long customerId) {
        return 0;
    }

    @Override
    public int insert(Customer record) {
        return 0;
    }

    @Override
    public int insertSelective(Customer record) {
        return 0;
    }

    @Override
    public Customer selectByPrimaryKey(Long customerId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Customer record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Customer record) {
        return 0;
    }
}
