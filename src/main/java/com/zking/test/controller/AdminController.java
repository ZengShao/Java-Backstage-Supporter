package com.zking.test.controller;

import com.zking.test.biz.IAdminBiz;
import com.zking.test.biz.IPermissionBiz;
import com.zking.test.biz.IRoleBiz;
import com.zking.test.model.Admin;
import com.zking.test.model.Permission;
import com.zking.test.model.Role;
import com.zking.test.shiro.AdminToken;
import com.zking.test.util.JsonData;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.awt.print.Book;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private IAdminBiz iAdminBiz;

    @Autowired
    private IRoleBiz iRoleBiz;

    @Autowired
    private IPermissionBiz iPermissionBiz;

    @ModelAttribute
    public void init(Model model) {
        System.out.println("init");
        Admin admin = new Admin();
        model.addAttribute("admin", admin);
    }

    @RequestMapping("/index.shtml")
    public String toLogin(Model model) {
        System.out.println("toLogin");
        return "login";
    }

    @RequestMapping("/login")
    public @ResponseBody JsonData login(Model model, Admin admin) {

        JsonData jsonData = new JsonData();
        System.out.println(admin);
        AdminToken token = new AdminToken(admin.getAdminName(), admin.getAdminPassword());
        Subject subject = SecurityUtils.getSubject();
        String message = null;
        try {
            subject.login(token);
        } catch (UnknownAccountException e) {// 捕获未知用户名异常
            message = "帐号错误";
        } catch (LockedAccountException e) {// 捕获错误登录过多的异常
            message = "帐号已锁定，请与管理员联系";
        } catch (IncorrectCredentialsException e) {// 捕获密码错误异常
            message = "密码错误";
        } catch (ExcessiveAttemptsException e) {// 捕获错误登录过多的异常
            message = "多次登录尝试失败，请60秒后再试";
        }

        if (null == message) {//JWT
            Session session = subject.getSession();//此session为org.apache.shiro.session.Session
            session.setAttribute("admin", admin);//登陆成功后要保存shiro的会话中，已备之后使用
            jsonData.setCode(0);
            jsonData.put("message","登录成功");
            return jsonData;
        } else {
            model.addAttribute("message", message);
            jsonData.setCode(1);
            jsonData.setMessage(message);
            return jsonData;
        }
    }


    @RequestMapping("/unauthorized")
    public String unauthorized(HttpServletRequest request) {
        String reqType = request.getHeader("reqType");
        if("axios".equals(reqType)){

        }
        return "unauthorized";
    }

    @RequestMapping("/abc")
    public String abc() {
        return "unauthorized";
    }
    @RequestMapping("/xyz")
    @ResponseBody
    public Map xyz() {
        return null;
    }

    @RequestMapping("/logout")
    public String logout() {
        return "login";
    }

    @RequestMapping("/load/{roleId}")
    public String load(@PathVariable Integer roleId ){
        System.out.println("load:"+roleId);
        return null;
    }

    @RequestMapping("/tree")
    public @ResponseBody JsonData Permission(Model model, Admin admin) {

         admin = iAdminBiz.loadByAdminname(admin);
        List<Permission> permissions = iPermissionBiz.selectByPermission(admin.getAdminId());
        JsonData jsonData = new JsonData();
//        jsonData.put("message",permissions);
        jsonData.setResult(permissions);
        return jsonData;
    }

    @RequestMapping("/cg")
    @ResponseBody
    public JsonData cg(String out_trade_no, String total_amount, String trade_no){
        JsonData jsonData = new JsonData();
        System.out.println(out_trade_no);
        System.out.println(total_amount);
        System.out.println(trade_no);
        Map<String,String> map=new HashMap<>();
        map.put("out_trade_no",out_trade_no);
        map.put("total_amount",total_amount);
        map.put("trade_no",trade_no);
        jsonData.setResult(map);
        return jsonData;
    }

}
