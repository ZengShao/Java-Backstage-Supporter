package com.zking.test.controller;

import com.zking.test.biz.ICustomer;
import com.zking.test.model.Customer;
import com.zking.test.model.CustomerM;
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

    @RequestMapping("/bind")
    public @ResponseBody JsonData bind(Model model,PageBean pageBean, Customer customer) {
        JsonData jsonData = new JsonData();
        if(null == customer.getCustomerName()){
            customer.setCustomerName("");
        }
        if (null != customer.getCustomerName()){
            customer.setCustomerName(customer.getCustomerName());
            System.out.println(customer.getCustomerName());
        }
        List<CustomerM> objects = iCustomer.bindCustomer(customer,pageBean);
        jsonData.setRows(pageBean.getRows());
        jsonData.setTotal(pageBean.getTotal());
        jsonData.setPage(pageBean.getPage());
        jsonData.setResult(objects);
        return jsonData;
    }

    @RequestMapping("/bind1")
    public @ResponseBody JsonData bind1(Model model,PageBean pageBean, Customer customer) {
        JsonData jsonData = new JsonData();
        if(null == customer.getCustomerName()){
            customer.setCustomerName("");
        }
        if (null != customer.getCustomerName()){
            customer.setCustomerName(customer.getCustomerName());
            System.out.println(customer.getCustomerName());
        }
        List<CustomerM> objects = iCustomer.bindCustomer1(customer,pageBean);
        jsonData.setRows(pageBean.getRows());
        jsonData.setTotal(pageBean.getTotal());
        jsonData.setPage(pageBean.getPage());
        jsonData.setResult(objects);
        return jsonData;
    }

    @RequestMapping("/bind2")
    public @ResponseBody JsonData bind2(Model model,PageBean pageBean, Customer customer) {
        JsonData jsonData = new JsonData();
        if(null == customer.getCustomerName()){
            customer.setCustomerName("");
        }
        if (null != customer.getCustomerName()){
            customer.setCustomerName(customer.getCustomerName());
            System.out.println(customer.getCustomerName());
        }
        List<CustomerM> objects = iCustomer.bindCustomer2(customer,pageBean);
        jsonData.setRows(pageBean.getRows());
        jsonData.setTotal(pageBean.getTotal());
        jsonData.setPage(pageBean.getPage());
        jsonData.setResult(objects);
        return jsonData;
    }

    @RequestMapping("/bind3")
    public @ResponseBody JsonData bind3(Model model,PageBean pageBean, Customer customer) {
        JsonData jsonData = new JsonData();
        if(null == customer.getCustomerName()){
            customer.setCustomerName("");
        }
        if (null != customer.getCustomerName()){
            customer.setCustomerName(customer.getCustomerName());
            System.out.println(customer.getCustomerName());
        }
        List<CustomerM> objects = iCustomer.bindCustomer3(customer,pageBean);
        jsonData.setRows(pageBean.getRows());
        jsonData.setTotal(pageBean.getTotal());
        jsonData.setPage(pageBean.getPage());
        jsonData.setResult(objects);
        return jsonData;
    }

    @RequestMapping("/bind4")
    public @ResponseBody JsonData bind4(Model model,PageBean pageBean, Customer customer) {
        JsonData jsonData = new JsonData();
        if(null == customer.getCustomerName()){
            customer.setCustomerName("");
        }
        if (null != customer.getCustomerName()){
            customer.setCustomerName(customer.getCustomerName());
            System.out.println(customer.getCustomerName());
        }
        List<CustomerM> objects = iCustomer.bindCustomer4(customer,pageBean);
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
