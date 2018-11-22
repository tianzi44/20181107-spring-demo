package com.panda521.test;

import com.panda521.UserVO;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jack on 2018/11/7.
 */

public class SpringTest {
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

}