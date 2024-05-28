package com.maharjan.amit.web;

import com.maharjan.amit.web.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SprintBootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SprintBootApplication.class, args);
        Student student = context.getBean(Student.class);
        student.display();
    }

}
