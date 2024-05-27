package com.maharjan.amit.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home() {
        return "homePage";
    }

    // No Web Page needed, just return the data
    @RequestMapping("/secure")
    @ResponseBody
    public String secure(){
        return "securePage";
    }
}
