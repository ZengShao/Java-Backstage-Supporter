package com.zking.test.controller;

import com.zking.test.biz.ICustomer;
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
@RequestMapping("/Customer")
public class CustomerController {

    @Autowired
    ICustomer iCustomer;

    @RequestMapping("/customer")
    public @ResponseBody JsonData login(Model model,PageBean pageBean, Customer customer) {
        JsonData jsonData = new JsonData();

        if(null == customer.getCustomerName()){
            customer.setCustomerName("");
        }
        if (null != customer.getCustomerName()){
            customer.setCustomerName(customer.getCustomerName());
            System.out.println(customer.getCustomerName());
        }

        List<Customer> objects = iCustomer.selectByCustomer(customer,pageBean);

        jsonData.setRows(pageBean.getRows());
        jsonData.setTotal(pageBean.getTotal());
        jsonData.setPage(pageBean.getPage());
        jsonData.setResult(objects);

        return jsonData;
    }

    @RequestMapping("/SetCustomerStatus")
    public @ResponseBody JsonData login(Model model,Customer customer) {
        JsonData jsonData = new JsonData();

        int i = iCustomer.updateByCustomerStatus(customer);

        jsonData.setCode(i);
        return jsonData;
    }
}
