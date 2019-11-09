package com.zking.test.controller;

import com.zking.test.biz.IRepaymentBiz;
import com.zking.test.model.Apply;
import com.zking.test.model.Customer;
import com.zking.test.model.CustomerM;
import com.zking.test.model.Repayment;
import com.zking.test.util.JsonData;
import com.zking.test.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Repayment")
public class RepaymentController {


    @Autowired
    IRepaymentBiz iRepaymentBiz;

    @RequestMapping("/repayment")
    public @ResponseBody
    JsonData bind4(Model model, PageBean pageBean, Customer customer) {
        JsonData jsonData = new JsonData();
        if(null == customer.getCustomerName()){
            customer.setCustomerName("");
        }
        if (null != customer.getCustomerName()){
            customer.setCustomerName(customer.getCustomerName());
            System.out.println(customer.getCustomerName());
        }
        List<CustomerM> objects = iRepaymentBiz.bindRepayment(customer,pageBean);
        jsonData.setRows(pageBean.getRows());
        jsonData.setTotal(pageBean.getTotal());
        jsonData.setPage(pageBean.getPage());
        jsonData.setResult(objects);
        return jsonData;
    }

    @RequestMapping("/repayment1")
    public @ResponseBody
    JsonData bind1(Model model, PageBean pageBean, Customer customer) {
        JsonData jsonData = new JsonData();
        if(null == customer.getCustomerName()){
            customer.setCustomerName("");
        }
        if (null != customer.getCustomerName()){
            customer.setCustomerName(customer.getCustomerName());
            System.out.println(customer.getCustomerName());
        }
        List<CustomerM> objects = iRepaymentBiz.bindRepayment1(customer,pageBean);
        jsonData.setRows(pageBean.getRows());
        jsonData.setTotal(pageBean.getTotal());
        jsonData.setPage(pageBean.getPage());
        jsonData.setResult(objects);
        return jsonData;
    }

    @RequestMapping("/repayment2")
    public @ResponseBody
    JsonData bind2(Model model, PageBean pageBean, Customer customer) {
        JsonData jsonData = new JsonData();
        if(null == customer.getCustomerName()){
            customer.setCustomerName("");
        }
        if (null != customer.getCustomerName()){
            customer.setCustomerName(customer.getCustomerName());
            System.out.println(customer.getCustomerName());
        }
        List<CustomerM> objects = iRepaymentBiz.bindRepayment2(customer,pageBean);
        jsonData.setRows(pageBean.getRows());
        jsonData.setTotal(pageBean.getTotal());
        jsonData.setPage(pageBean.getPage());
        jsonData.setResult(objects);
        return jsonData;
    }

    @RequestMapping("/Update")
    public @ResponseBody JsonData update(Model model, Repayment repayment, BindingResult bindingResult) {
        JsonData jsonData = new JsonData();
        if(bindingResult.hasErrors()){
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            Map<String,String> errors=new HashMap<String,String>();
            for(FieldError e:fieldErrors){
                String field = e.getField();
                String message = e.getDefaultMessage();
                errors.put(field,message);
            }
            jsonData.setCode(-1);
            jsonData.put("errors",errors);
            System.out.println(jsonData);
        }else{
            int i = iRepaymentBiz.update(repayment);
            jsonData.setCode(i);
        }
        return jsonData;
    }
}
