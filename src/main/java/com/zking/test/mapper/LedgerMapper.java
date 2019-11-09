package com.zking.test.mapper;

import com.zking.test.model.Customer;
import com.zking.test.model.CustomerM;
import com.zking.test.model.Ledger;

import java.util.List;

public interface LedgerMapper {
    int deleteByPrimaryKey(Long ledgerId);

    int insert(Ledger record);

    int insertSelective(Ledger record);

    Ledger selectByPrimaryKey(Long ledgerId);

    int updateByPrimaryKeySelective(Ledger record);

    int updateByPrimaryKey(Ledger record);

}