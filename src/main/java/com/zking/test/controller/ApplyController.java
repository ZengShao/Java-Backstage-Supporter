package com.zking.test.controller;

import com.zking.test.biz.IApplyBiz;
import com.zking.test.model.Apply;
import com.zking.test.util.JsonData;
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
@RequestMapping("/apply")
public class ApplyController {
    @Autowired
    private IApplyBiz applyBiz;

    @RequestMapping("/Update")
    public @ResponseBody JsonData update(Model model, Apply apply,BindingResult bindingResult) {
        JsonData jsonData = new JsonData();
        System.out.println("1111111111111111111");
        System.out.println(apply.getApplyId());
        if(bindingResult.hasErrors()){
            System.out.println("修改验证不通过");
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
            System.out.println("验证通过，修改");
            System.out.println(apply.getApplyId());
            System.out.println(apply.getState());
            int i = applyBiz.update(apply);
            jsonData.setCode(i);
        }
        return jsonData;
    }

    @RequestMapping("/zhip")
    public @ResponseBody JsonData upda(Model model, Apply apply,BindingResult bindingResult){
        JsonData jsonData = new JsonData();
        System.out.println("1111111111111111111");
        System.out.println(apply.getApplyId());
        System.out.println(apply.getAdmId());
        System.out.println(apply.getState());
        if(bindingResult.hasErrors()){
            System.out.println("修改验证不通过");
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
            System.out.println("验证通过，修改");
            System.out.println(apply.getApplyId());
            System.out.println(apply.getState());
            int i = applyBiz.updateById(apply);
            jsonData.setCode(i);
        }
        return jsonData;
    }
    @RequestMapping("/Update1")
    public @ResponseBody JsonData update1(Model model, Apply apply,BindingResult bindingResult) {
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
            int i = applyBiz.update1(apply);
            jsonData.setCode(i);
        }
        return jsonData;
    }
}
