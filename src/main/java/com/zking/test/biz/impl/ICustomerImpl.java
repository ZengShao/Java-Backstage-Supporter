package com.zking.test.biz.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.test.biz.ICustomer;
import com.zking.test.mapper.CustomerMapper;
import com.zking.test.model.ContractManagement;
import com.zking.test.model.Customer;
import com.zking.test.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CustomerBiz")
public class ICustomerImpl implements ICustomer {

    @Autowired
    CustomerMapper customerMapper;

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

    @Override
    public List<Customer> selectByCustomer(Customer customer, PageBean pageBean) {
        if (null != pageBean && pageBean.isPagination()){
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }
        List<Customer> objects = customerMapper.selectByCustomer(customer);
        if (null != pageBean && pageBean.isPagination()){
            PageInfo pageInfo = new PageInfo(objects);
            pageBean.setTotal(pageInfo.getTotal()+"");
        }
        return objects;
    }

    @Override
    public int updateByCustomerStatus(Customer customer) {
        return customerMapper.updateByCustomerStatus(customer);
    }
}
