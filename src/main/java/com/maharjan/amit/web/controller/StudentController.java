package com.maharjan.amit.web.controller;

import com.maharjan.amit.web.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
    @Autowired
    Student student;

    @RequestMapping("/student/execute")
    @ResponseBody
    public String execute(){
        System.out.println("Executing student");
        student.display();
        return "SUCCESS";
    }
}
