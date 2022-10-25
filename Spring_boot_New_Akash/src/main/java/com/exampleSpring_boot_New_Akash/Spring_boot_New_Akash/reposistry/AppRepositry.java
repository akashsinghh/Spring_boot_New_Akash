package com.exampleSpring_boot_New_Akash.Spring_boot_New_Akash.reposistry;

import org.springframework.stereotype.Repository;

@Repository
public class AppRepositry {
    public String appFlow(){
        return "Hey this Akash here : ";
    }
    public  String appStart(){
        return "hey application is started";
    }
    public String appStop(){
        return "Hey application is Stop";
    }
}
