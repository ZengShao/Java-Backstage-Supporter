package com.zking.test.mapper;

import com.zking.test.model.Apply;
import com.zking.test.model.Customer;
import com.zking.test.model.CustomerM;
import com.zking.test.model.Repayment;
import com.zking.test.util.PageBean;

import java.util.List;

public interface RepaymentMapper {
    int deleteByPrimaryKey(Long repaymentId);

    int insert(Repayment record);

    int insertSelective(Repayment record);

    Repayment selectByPrimaryKey(Long repaymentId);

    int updateByPrimaryKeySelective(Repayment record);

    int updateByPrimaryKey(Repayment record);

    List<CustomerM> bindRepayment(Customer customer);

    List<CustomerM> bindRepayment1(Customer customer);

    List<CustomerM> bindRepayment2(Customer customer);

    int update(Repayment repayment);
}