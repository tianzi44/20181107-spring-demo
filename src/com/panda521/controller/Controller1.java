package com.panda521.controller;

import com.panda521.service.Service1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by jack on 2018/12/2.
 */
@Controller
public class Controller1 {
    @Autowired
    private Service1 service1;

    public String h1(){
        return service1.h1();
    }
}