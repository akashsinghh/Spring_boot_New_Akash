package com.exampleSpring_boot_New_Akash.Spring_boot_New_Akash.controller;

import com.exampleSpring_boot_New_Akash.Spring_boot_New_Akash.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class appFLow {
    @Autowired
    AppService service;
    @PostMapping("/app_flow")
    public String appFlow(){
        return service.appFlow();
    }
    @GetMapping("/Start_app")
    public String appStart(){
        return service.appStart();
    }
    @GetMapping("/Stop_app")
    public String appStop(){
        return service.appStop();
    }
}
