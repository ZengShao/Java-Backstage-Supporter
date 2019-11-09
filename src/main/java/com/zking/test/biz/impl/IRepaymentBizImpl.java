package com.zking.test.biz.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.test.biz.IRepaymentBiz;
import com.zking.test.mapper.RepaymentMapper;
import com.zking.test.model.Apply;
import com.zking.test.model.Customer;
import com.zking.test.model.CustomerM;
import com.zking.test.model.Repayment;
import com.zking.test.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("RepaymentBiz")
public class IRepaymentBizImpl implements IRepaymentBiz {

    @Autowired
    RepaymentMapper repaymentMapper;

    @Override
    public int deleteByPrimaryKey(Long repaymentId) {
        return 0;
    }

    @Override
    public int insert(Repayment record) {
        return 0;
    }

    @Override
    public int insertSelective(Repayment record) {
        return 0;
    }

    @Override
    public Repayment selectByPrimaryKey(Long repaymentId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Repayment record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Repayment record) {
        return 0;
    }

    @Override
    public List<CustomerM> bindRepayment(Customer customer, PageBean pageBean) {
        if (null != pageBean && pageBean.isPagination()){
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }
        List<CustomerM> objects = repaymentMapper.bindRepayment(customer);
        if (null != pageBean && pageBean.isPagination()){
            PageInfo pageInfo = new PageInfo(objects);
            pageBean.setTotal(pageInfo.getTotal()+"");
        }
        return objects;
    }

    @Override
    public List<CustomerM> bindRepayment1(Customer customer, PageBean pageBean) {
        if (null != pageBean && pageBean.isPagination()){
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }
        List<CustomerM> objects = repaymentMapper.bindRepayment1(customer);
        if (null != pageBean && pageBean.isPagination()){
            PageInfo pageInfo = new PageInfo(objects);
            pageBean.setTotal(pageInfo.getTotal()+"");
        }
        return objects;
    }

    @Override
    public List<CustomerM> bindRepayment2(Customer customer, PageBean pageBean) {
        if (null != pageBean && pageBean.isPagination()){
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }
        List<CustomerM> objects = repaymentMapper.bindRepayment2(customer);
        if (null != pageBean && pageBean.isPagination()){
            PageInfo pageInfo = new PageInfo(objects);
            pageBean.setTotal(pageInfo.getTotal()+"");
        }
        return objects;
    }

    @Override
    public int update(Repayment repayment) {
        Repayment repayment1 = new Repayment();
        repayment.setRepaymentId(repayment.getRepaymentId());
        if(repayment.getResidueState()==0){
            repayment.setResidueState(2);
        }
       else if(repayment.getResidueState()==2){
            repayment.setResidueState(1);
        }
        return repaymentMapper.update(repayment);
    }
}
