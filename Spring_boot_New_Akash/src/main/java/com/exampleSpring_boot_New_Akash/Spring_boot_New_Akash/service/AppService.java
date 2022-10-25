package com.exampleSpring_boot_New_Akash.Spring_boot_New_Akash.service;

import com.exampleSpring_boot_New_Akash.Spring_boot_New_Akash.reposistry.AppRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService {
    @Autowired
    AppRepositry repo;
    public String appFlow(){
        return repo.appFlow();
    }
    public String appStart(){
        return repo.appStart();

    }
    public String appStop(){
        return repo.appStop();
    }
}

