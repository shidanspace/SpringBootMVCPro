package com.shi.studyboot.controller;

import com.shi.studyboot.ResStat;
import com.shi.studyboot.entity.Account;
import com.shi.studyboot.service.AccountService;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @Autowired
    AccountService accountService;

    @RequestMapping("/list")
    public String list() {

        return "list";

    }

    /**
     * get 展示页面
     *
     * @return
     */
    @GetMapping("/register")
    public String register() {

        System.out.println("--get--");
        return "register";

    }

    /**
     * get 搜集数据
     *
     * @return
     */

    @PostMapping("/register")
    public String registerP(HttpServletRequest request, Account account) {

        String loginName = request.getParameter("loginName");
        System.out.println("loginName:" + loginName);

        System.out.println("account:" + account);

        System.out.println("--post--");


        ResStat stat = accountService.save(account);
        /***
         * set res
         */
        request.setAttribute("stat", stat);

        System.out.println("stat:"+stat);
        System.out.println("stat:"+ToStringBuilder.reflectionToString(stat));




        return "register";

    }


    @RequestMapping("/login")
    public String login() {

        return "login";

    }
}
