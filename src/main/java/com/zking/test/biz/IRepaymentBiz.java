package com.zking.test.biz;

import com.zking.test.model.Customer;
import com.zking.test.model.CustomerM;
import com.zking.test.model.Repayment;
import com.zking.test.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IRepaymentBiz {
    int deleteByPrimaryKey(Long repaymentId);

    int insert(Repayment record);

    int insertSelective(Repayment record);

    Repayment selectByPrimaryKey(Long repaymentId);

    int updateByPrimaryKeySelective(Repayment record);

    int updateByPrimaryKey(Repayment record);

    List<CustomerM> bindRepayment(Customer customer,PageBean pageBean);

    List<CustomerM> bindRepayment1(Customer customer,PageBean pageBean);

    List<CustomerM> bindRepayment2(Customer customer,PageBean pageBean);

    int update(Repayment repayment);
}
