package com.shi.studyboot.controller;

import com.shi.studyboot.entity.Account;
import com.shi.studyboot.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {



    @RequestMapping("/")
    public String index() {

        return "index";

    }

    @RequestMapping("index")
    public String index1() {
        return "/index";
    }
}
