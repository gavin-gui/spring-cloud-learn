package com.gui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by gui on 2017/1/2.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    String index(Model model){
        model.addAttribute("msg","Hello,spring-boot!");
        return "index";
    }


}
