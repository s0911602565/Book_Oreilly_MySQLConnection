package com.example.bookoreilly.controller;

import com.example.bookoreilly.entity.Z1;
import com.example.bookoreilly.service.MyRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Q1")
public class Q1 {
    private final MyRepository m;
    public Q1(MyRepository m){
        this.m = m;
    }
    /*
    127.0.0.1:8080/Q1/getMessage1
    * */

    @RequestMapping("getMessage1")
    String getMessage1(){
        Z1 z = new Z1();
        z.setName("Demo");
        m.save(z);
        return "hello john";
    }
}
