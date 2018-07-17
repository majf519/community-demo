package com.recon.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author daniel.xue
 * @create 2018/7/17
 **/
@Controller
public class IndexController {

    @GetMapping("social-assistance/apply")
    public String getAocialAssistance(){
        return "index";
    }
}
