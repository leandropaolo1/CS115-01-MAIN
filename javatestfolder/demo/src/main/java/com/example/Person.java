package com.example;
import java.time.LocalDate;



public class Person {

    private String name;
    private LocalDate dob;
    private String gender;
    private String phone;


    public Person(String name, LocalDate dob, String gender, String phone) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.phone = phone;
    }

    public Person() {
        this.name = "";
        this.dob = LocalDate.of(1900, 1, 1);
        this.gender = "";
        this.phone = "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = LocalDate.parse(dob);
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }
}
