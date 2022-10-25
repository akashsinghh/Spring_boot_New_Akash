package com.exampleSpring_boot_New_Akash.Spring_boot_New_Akash.controller;

import com.exampleSpring_boot_New_Akash.Spring_boot_New_Akash.Model.Doctor;
import com.exampleSpring_boot_New_Akash.Spring_boot_New_Akash.service.DoctorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Doctorcontroller {
    @Autowired
    DoctorServices services;
    @PostMapping("/dr_data")
    public String adddr(@RequestBody Doctor doctor){
       return services.addemp(doctor);
    }
    @GetMapping("/Getdr")
    public List<Doctor> getdr(){
        return  services.getdr();
    }
    @PutMapping("/update_name")
    public String Updatedr(@RequestParam Long id,@RequestParam String name){
        return services.updatename(id,name);
    }
    @PutMapping("/Update_dept")
    public String updatedept(@RequestParam Long id,@RequestParam String dept){
        return services.updatedept(id,dept);
    }
    @DeleteMapping("/deletedata")
    public String deletdata(@RequestParam Long id){
        return services.deletedata(id);
    }
    @GetMapping("/findByName")
    public Doctor findByName(@RequestParam String name){
        return  services.findByName(name);
    }
    @GetMapping("/findBydept")
    public Doctor findByDept(@RequestParam String dept){
        return  services.findByName(dept);
    }
}
