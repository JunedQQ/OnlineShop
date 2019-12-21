package com.onlineshop.dao;

import com.onlineshop.pojo.UserInfo;

import org.springframework.stereotype.Repository;

/**
 * @author JunedQQ
 * @create 2019/12/19
 * @since 1.0.0
 */
@Repository("userInfoDao")
public interface UserInfoDao {

    UserInfo findUserInfoByUserId(int userId);
}