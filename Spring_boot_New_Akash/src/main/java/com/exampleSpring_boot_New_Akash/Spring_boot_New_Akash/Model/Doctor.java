package com.exampleSpring_boot_New_Akash.Spring_boot_New_Akash.Model;

import javax.persistence.*;

@Entity
public class Doctor {
    @Id
    @GeneratedValue
    Long id;// primary key of Table 1,2,3,4......


    String name;
    String dept;
    int salary;

    public Doctor() {
    }

    public Doctor(Long id, String name, String dept, int salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
