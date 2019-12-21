package com.onlineshop.test;

import com.onlineshop.dao.UserDao;
import com.onlineshop.pojo.User;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author JunedQQ
 * @create 2019/12/19
 * @since 1.0.0
 */
public class UserDaoTest {

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao)applicationContext.getBean("userDao");
        User user = userDao.findUserByUserName("jzx1697749396");
        System.out.println(user);
    }

    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao)applicationContext.getBean("userDao");
    }
}