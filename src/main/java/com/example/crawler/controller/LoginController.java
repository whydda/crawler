package com.example.crawler.controller;

import com.example.crawler.service.UserService;
import com.example.crawler.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by whydda on 2017-11-07.
 * File Ko Name :
 */
@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String loginPage(ModelMap modelMap){
        modelMap.addAttribute("content", "Hello World.");
        return "index";
    }

    @RequestMapping("/save")
    public String saveUser(ModelMap modelMap){
        UserVo userVo = new UserVo();
        userVo.setId("whydda");
        userVo.setPasswd("1234");
        userService.saveUser(userVo);

        modelMap.addAttribute("content", "Save World.");
        return "index";
    }
}
