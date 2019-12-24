package com.onlineshop.dao;

import com.onlineshop.pojo.User;
import com.onlineshop.pojo.UserInfo;

import org.springframework.stereotype.Repository;

/**
 * @author JunedQQ
 * @create 2019/12/19
 * @since 1.0.0
 */
@Repository("userInfoDao")
public interface UserInfoDao {

    /**
     * 根据UserId来查询用户信息
     * @param userId
     * @return
     */
    UserInfo findUserInfoByUserId(int userId);

    /**
     * 为用户添加用户信息
     * @param userId
     * @return
     */
    int addUserInfoOnUserId(User user);
}