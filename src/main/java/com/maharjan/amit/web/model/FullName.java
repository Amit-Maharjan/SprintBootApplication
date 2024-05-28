package com.maharjan.amit.web.model;

import org.springframework.stereotype.Component;

@Component
public class FullName {
    String firstName;
    String middleName;
    String lastName;

    public FullName() {
        System.out.println("Creating Full Name");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void display() {
        System.out.println("Displaying Full Name");
    }
}
