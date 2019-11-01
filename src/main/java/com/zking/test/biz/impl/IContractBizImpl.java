package com.zking.test.biz.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.test.biz.IContractBiz;
import com.zking.test.mapper.ContractMapper;
import com.zking.test.mapper.CustomerMapper;
import com.zking.test.model.Contract;
import com.zking.test.model.ContractManagement;
import com.zking.test.model.Customer;
import com.zking.test.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("ContractBiz")
public class IContractBizImpl implements IContractBiz {

    @Autowired
    ContractMapper contractMapper;

    @Override
    public int deleteByPrimaryKey(Long contractId) {
        return 0;
    }

    @Override
    public int insert(Contract record) {
        return 0;
    }

    @Override
    public int insertSelective(Contract record) {
        return 0;
    }

    @Override
    public Contract selectByPrimaryKey(Long contractId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Contract record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Contract record) {
        return 0;
    }

    @Override
    public List<ContractManagement> selectByContractManagement(Customer customer, PageBean pageBean) {
        if (null == pageBean&&!pageBean.isPagination()){
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }
        List<ContractManagement> objects = contractMapper.selectByContractManagement(customer);
        if (null == pageBean && !pageBean.isPagination()){
            PageInfo pageInfo = new PageInfo(objects);
            pageBean.setTotal(pageInfo.getTotal()+"");
        }
        return objects;
    }
}
