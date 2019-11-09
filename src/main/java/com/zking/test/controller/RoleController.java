package com.zking.test.controller;

import com.zking.test.biz.IRoleBiz;
import com.zking.test.model.Role;
import com.zking.test.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Role")
public class RoleController {
    @Autowired
    private IRoleBiz roleBiz;

    @ModelAttribute
    public void init(Model model) {
        System.out.println("init");
        Role role = new Role();
        model.addAttribute("role", role);
    }

    @RequestMapping("/selectByRole")
    public @ResponseBody JsonData selectByRole(Model model,Role role) {
        JsonData jsonData = new JsonData();
        List<Role> objects = roleBiz.selectByRoleDesc(role);
        jsonData.setResult(objects);
        return jsonData;
    }
}
