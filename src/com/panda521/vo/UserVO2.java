package com.panda521.vo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jack on 2018/11/7.
 */
@Configuration
public class UserVO2 {
    private String name;
    private Integer age;

    @Bean(value = "getUser2")
    public UserVO2 getUser2(){
        return new UserVO2();
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}