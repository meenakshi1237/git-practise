package com.amn.gitpractise;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Practise {
    @GetMapping("/message")
    public String getMessage(){
        return "git practise";
    }

    @GetMapping("/secondMessage")
    public String getSecondMesage(@RequestParam String message){
        return message;
    }
}
