package com.panda521;

import com.panda521.service.Service1;
import com.panda521.vo.UserVO;
import com.panda521.vo.UserVO2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by jack on 2018/11/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class SpringDemoTest {
    @Before
    public void init() {
        System.out.println("做做准备工作");
    }

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserVO userVO = applicationContext.getBean("user", UserVO.class);
        Assert.assertTrue(userVO != null);
        userVO.setName("貂蝉");
        userVO.setAge(18);
        System.out.println(userVO);
    }

    @Test
    public void test2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserVO2 userVO2 = applicationContext.getBean("getUser2", UserVO2.class);
        Assert.assertTrue(userVO2 != null);
        userVO2.setName("貂蝉");
        userVO2.setAge(18);
        System.out.println(userVO2);
    }

    @Autowired
    private Service1 service1;

    @Test
    public void test3() {
        String h1 = service1.h1();
        Assert.assertTrue(!h1.isEmpty());
        System.out.println(h1);
    }

}