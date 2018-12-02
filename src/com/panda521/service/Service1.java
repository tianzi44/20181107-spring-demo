package com.panda521.service;

import org.springframework.stereotype.Service;

/**
 * Created by jack on 2018/12/2.
 */
@Service
public class Service1 {
    public String h1(){
        return "jack 你好啊";
    }

    public String aopT1(){
        System.out.println("西瓜仔");
        return "我吃西瓜";
    }
}