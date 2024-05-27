package com.maharjan.amit.web.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
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

    @RequestMapping("/extraHome")
    public String extraHome(HttpServletRequest request){
        String name = request.getParameter("name");
        HttpSession session = request.getSession();
        session.setAttribute("name", name);
        return "homePage";
    }
}
