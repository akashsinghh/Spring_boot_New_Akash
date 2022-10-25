package com.exampleSpring_boot_New_Akash.Spring_boot_New_Akash.service;

import com.exampleSpring_boot_New_Akash.Spring_boot_New_Akash.Model.Doctor;
import com.exampleSpring_boot_New_Akash.Spring_boot_New_Akash.reposistry.Doctorreposistry;
import com.exampleSpring_boot_New_Akash.Spring_boot_New_Akash.reposistry.EmployeeReposistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServices {
    //add
    @Autowired
    Doctorreposistry reposistry;

    public String addemp(Doctor doctor){
        reposistry.save(doctor);

        return "successfully added data :";
    }
    //get
    public List<Doctor> getdr(){
        return reposistry.findAll();// get all the data from the select

    }
    //update name
    public String updatename(Long id,String name){
        Doctor doctor=reposistry.getById(id);
        doctor.setName(name);
        reposistry.save(doctor);
        return  "Sucessfully update ur dr.name";
    }
    public String updatedept(Long id,String dept){
        Doctor doctor=reposistry.getById(id);
        doctor.setDept(dept);
        reposistry.save(doctor);
        return "Successfully update ur dept";
    }
    public String deletedata(Long id){
        reposistry.deleteById(id);
        return "Successfully deleted:";
    }
    public Doctor findByName(String name){
        return reposistry.findByName(name);
    }
    public Doctor findByDept(String dept){
        return reposistry.findByDept(dept);
    }
}
