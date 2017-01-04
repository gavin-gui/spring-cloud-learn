package com.gui.controller;

import com.gui.model.User;
import com.gui.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by gui on 2017/1/2.
 */
@Controller
public class IndexController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    String index(Model model){
        model.addAttribute("msg","Hello,spring-boot!");
        User user = userService.queryUser("zhangsan");
        model.addAttribute("user",user);
        return "index";
    }


}
