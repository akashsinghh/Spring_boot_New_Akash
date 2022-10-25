package com.exampleSpring_boot_New_Akash.Spring_boot_New_Akash.service;

import com.exampleSpring_boot_New_Akash.Spring_boot_New_Akash.Model.Bottle;
import com.exampleSpring_boot_New_Akash.Spring_boot_New_Akash.reposistry.BottleReposistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class BottleService {
    @Autowired
    BottleReposistry reposistry;
    public String add(Bottle bottle){
        reposistry.save(bottle);
        return "Successfully added";
    }
    public String name(String brandname){
        reposistry.findByBrandname(brandname);
        return "Successfully findbyname";

    }
}
