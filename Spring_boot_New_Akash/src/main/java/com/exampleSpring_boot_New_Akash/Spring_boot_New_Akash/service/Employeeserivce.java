package com.exampleSpring_boot_New_Akash.Spring_boot_New_Akash.service;

import com.exampleSpring_boot_New_Akash.Spring_boot_New_Akash.Model.Employee;
import com.exampleSpring_boot_New_Akash.Spring_boot_New_Akash.reposistry.EmployeeReposistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Employeeserivce {
    @Autowired
    EmployeeReposistry reposistry;
    public String add(Employee employee){
       reposistry.save(employee);
        return "Successfullya added to db";
    }
    public List<Employee> getallstudent(){
       return reposistry.findAll();//get all the data Select *from
    }
    public String update(Long id,String name){
        //find out the record
        Employee employee=  reposistry.getById(id);//fetech data from the db
        //2 //save in the database also na
        employee.setName(name);

        reposistry.save(employee);
        return "Successfully update the name"+name;
    }
    public String updateage(Long id,int age){
        Employee employee=reposistry.getById(id);
        employee.setAge(age);
        reposistry.save(employee);
        return "Succesfully update the age: "+age;
    }
    public String delete(Long id){
        reposistry.deleteById(id);
        return "Successfully delete data";
    }
}
