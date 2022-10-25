package com.exampleSpring_boot_New_Akash.Spring_boot_New_Akash.controller;

import com.exampleSpring_boot_New_Akash.Spring_boot_New_Akash.Model.Bottle;
import com.exampleSpring_boot_New_Akash.Spring_boot_New_Akash.service.BottleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BottleDbcontroller {
    @Autowired
    BottleService bottleService;
    @PostMapping("/addbott")
    public String addmobile(@RequestBody Bottle bottle){
        return bottleService.add(bottle);
    }
    @PostMapping("/findname")
    public String findname(@RequestParam  String brandname){
        return bottleService.name(brandname);
    }
}
