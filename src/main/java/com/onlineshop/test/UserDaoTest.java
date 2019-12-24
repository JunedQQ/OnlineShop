package com.onlineshop.test;

import com.onlineshop.dao.UserDao;
import com.onlineshop.pojo.User;
import com.onlineshop.utils.MD5;

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
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDao userDao = (UserDao)applicationContext.getBean("userDao");
//        User user = userDao.findUserByUserName("jzx1697749396");
//        System.out.println(user);
        System.out.println(MD5.getMD5x100("2192981830"));
    }

    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao)applicationContext.getBean("userDao");
    }
}