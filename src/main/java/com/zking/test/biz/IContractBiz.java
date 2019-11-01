package com.zking.test.biz;

import com.zking.test.model.Contract;
import com.zking.test.model.ContractManagement;
import com.zking.test.model.Customer;
import com.zking.test.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface IContractBiz {
    int deleteByPrimaryKey(Long contractId);

    int insert(Contract record);

    int insertSelective(Contract record);

    Contract selectByPrimaryKey(Long contractId);

    int updateByPrimaryKeySelective(Contract record);

    int updateByPrimaryKey(Contract record);

    List<ContractManagement> selectByContractManagement(Customer customer, PageBean pageBean);
}
