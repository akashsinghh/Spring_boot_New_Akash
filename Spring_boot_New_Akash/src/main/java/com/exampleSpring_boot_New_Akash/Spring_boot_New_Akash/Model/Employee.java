package com.exampleSpring_boot_New_Akash.Spring_boot_New_Akash.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {


    @Id
    @GeneratedValue
    Long empid;
    String name;
    int age;
    //default constructor
    public Employee() {
    }

    public Employee(String name, Long empid, int age) {
        this.name = name;
        this.empid = empid;
        this.age = age;
    }

    //getter and setter
    public String getName() {
        return name;
    }


    public Long getEmpid() {
        return empid;
    }

    public void setEmpid(Long empid) {
        this.empid = empid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
