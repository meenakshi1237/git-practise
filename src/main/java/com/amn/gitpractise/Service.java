package com.amn.gitpractise;


@org.springframework.stereotype.Service
public class Service {

    public String getMesage(){
        return "firstMessage";
    }

    public String firstMessage(){
        return "secondMessage";
    }

    public String thirdMessage(){
        return "thirdMessage";
    }

}
