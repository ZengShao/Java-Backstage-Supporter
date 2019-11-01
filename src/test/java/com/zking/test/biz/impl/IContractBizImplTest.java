package com.zking.test.biz.impl;

import com.zking.test.biz.IContractBiz;
import com.zking.test.model.ContractManagement;
import com.zking.test.model.Customer;
import com.zking.test.util.PageBean;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class IContractBizImplTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void selectByContractManagement() throws Exception {

        Customer customer = new Customer();

        PageBean pageBean = new PageBean();

        IContractBiz iContractBiz = new IContractBizImpl();
        List<ContractManagement> objects = iContractBiz.selectByContractManagement(customer, null);
        for (ContractManagement c:objects
             ) {
            System.out.println(c);
        }
    }

}