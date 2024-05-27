package com.maharjan.amit.web.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping("/extraHome1")
    public String extraHome1(String name, HttpSession session){
        session.setAttribute("name", name);
        return "homePage";
    }

    @RequestMapping("/extraHome2")
    public String extraHome2(@RequestParam("name") String username, HttpSession session){
        session.setAttribute("name", username);
        return "homePage";
    }

    @RequestMapping("/extraHome3")
    public ModelAndView extraHome3(@RequestParam("name") String username){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", username);
        mv.setViewName("homePage");
        return mv;
    }
}
