package com.panda521;

import com.panda521.vo.UserVO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chenjunfei
 * @date 2018-12-22
 */
public class SpringDemoApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserVO userVO =(UserVO)applicationContext.getBean("user");
        System.out.println(userVO);
        

    }
}
