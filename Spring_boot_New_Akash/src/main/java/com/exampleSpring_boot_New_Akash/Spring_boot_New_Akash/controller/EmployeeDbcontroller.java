package com.exampleSpring_boot_New_Akash.Spring_boot_New_Akash.controller;

import com.exampleSpring_boot_New_Akash.Spring_boot_New_Akash.Model.Employee;
import com.exampleSpring_boot_New_Akash.Spring_boot_New_Akash.service.Employeeserivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeDbcontroller {
    @Autowired
    Employeeserivce service;
    @PostMapping("/Add_emp")
    public String addemp(@RequestBody Employee employee)    {
        return service.add(employee);
    }
    //READ METHOD
    @GetMapping("/GetEmp")
    public List<Employee> getemparray(){
        return service.getallstudent();

    }
    //Update
    @PutMapping("/Update")
    public String update(@RequestParam Long id,@RequestParam String name){
        return service.update(id,name);

    }
    @PutMapping("/Updateage")
    public String updateage(@RequestParam Long id,@RequestParam int age){
        return service.updateage(id,age);

    }
    @DeleteMapping("/Deleteid")
    public String delete(@RequestParam Long id){
       return service.delete(id);
    }

}
