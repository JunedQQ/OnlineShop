package com.onlineshop.dao;

import com.onlineshop.pojo.User;

import org.springframework.stereotype.Repository;

/**
 * @author JunedQQ
 * @create 2019/12/19
 * @since 1.0.0
 */
@Repository("userDao")
public interface UserDao {

    /**
     * 根据用户名来查找用户信息
     * @param userName 用户名
     * @return
     */
    User findUserByUserName(String userName);

    /**
     * 根据用户名来查找用户登录信息
     * @param userName
     * @return
     */
    User findUserByUserNameToLogin(String userName);

    /**
     * 添加用户
     * @param user 添加用户实体类
     * @return
     */
    int addUser(User user);

    /**
     * 更新用户密码信息
     * @param user 用户信息
     * @return
     */
    int updateUserPassWord(User user);


}