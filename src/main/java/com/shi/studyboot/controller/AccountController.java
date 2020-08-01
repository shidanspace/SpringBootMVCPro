package com.shi.studyboot.controller;

import com.shi.studyboot.entity.Account;
import com.shi.studyboot.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;


    @RequestMapping("/login")
    public String login() {

        return "account/login";

    }
    @RequestMapping("validataAccount")
    @ResponseBody
    public String validataAccount(String loginName,String password,HttpServletRequest request) {

        System.out.println("loginName:" + loginName);
        System.out.println("password:" + password);

        // 1. 直接返回是否登录成功的结果
        // 2. 返回 Account对象，对象是空的 ，在controller里做业务逻辑
        // 在公司里 统一写法


        //让service返回对象，如果登录成功 把用户的对象
        Account account = accountService.findAccountByLoginNameAndPassWord(loginName, password);

        if (account == null) {
            return "登录失败";
        }else {
            // 登录成功
            // 写到Session里
            // 在不同的controller 或者前端页面上 都能使用
            // 当前登录用户的Account对象

            request.getSession().setAttribute("account", account);
            return "success";
        }
    }



}
