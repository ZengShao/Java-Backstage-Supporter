package com.zking.test.controller;


import com.zking.test.biz.IContractBiz;
import com.zking.test.model.Admin;
import com.zking.test.model.Contract;
import com.zking.test.model.ContractManagement;
import com.zking.test.model.Customer;
import com.zking.test.util.JsonData;
import com.zking.test.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Contract")
public class ContractController {

    @Autowired
    IContractBiz iContractBiz;

    @RequestMapping("/ContractManagement")
    public @ResponseBody JsonData login(Model model, Contract contract,PageBean pageBean,Customer customer) {
        JsonData jsonData = new JsonData();

        if(null == customer.getCustomerName()){
            customer.setCustomerName("");
        }
        if (null != customer.getCustomerName()){
            customer.setCustomerName(customer.getCustomerName());
            System.out.println(customer.getCustomerName());
        }





        List<ContractManagement> objects = iContractBiz.selectByContractManagement(customer,pageBean);

        jsonData.setRows(pageBean.getRows());
        jsonData.setTotal(pageBean.getTotal());
        jsonData.setPage(pageBean.getPage());
        jsonData.setResult(objects);

        return jsonData;
    }
}
