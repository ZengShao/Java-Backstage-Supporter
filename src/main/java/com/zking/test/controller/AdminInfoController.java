package com.zking.test.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/adminInfo")
public class AdminInfoController {


    @RequiresPermissions("system:admin:updatePassword")
    @RequestMapping("/updatePassword")
    public String updatePassword(Model model) {
        model.addAttribute("msg", "admin updatePassword");
        return "msg";
    }


    @RequiresPermissions("system:admin:doResetPassword")
    @RequestMapping("/doResetPassword")
    public String doResetPassword(Model model) {
        model.addAttribute("msg", "admin doResetPassword");
        return "msg";
    }

}
