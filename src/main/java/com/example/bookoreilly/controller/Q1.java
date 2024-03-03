package com.example.bookoreilly.controller;

import com.example.bookoreilly.entity.Z1;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.bookoreilly.service.MyDBJpa;

import java.util.List;

@RestController
@RequestMapping("Q1")
@Component
public class Q1 {

    @Setter(onMethod_ =@Autowired)
    private MyDBJpa n;


    /* 127.0.0.1:8080/Q1/getMessage2 * */
    @RequestMapping("getMessage2")
    ResponseEntity<Z1> getMessage2() {

        List<Z1> z2 = n.findAllData();
        Z1 z = new Z1();

        if (z2 != null && z2.isEmpty()) {
            List<Z1> list = n.findAllData();
            for (Z1 obj : list) {
                System.out.println("查詢 name:" +obj.getName());
                z = obj;
            }
        return new ResponseEntity<Z1>(z , HttpStatus.OK);

        } else {
            System.out.println("新增Z1一筆");
            z.setName("johnlee");
            z.setId(1);
            n.save(z);
            return new ResponseEntity<Z1>(z , HttpStatus.CREATED);
        }
    }

}
