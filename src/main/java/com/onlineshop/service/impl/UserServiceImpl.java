package com.onlineshop.service.impl;

import com.onlineshop.dao.UserDao;
import com.onlineshop.dao.UserInfoDao;
import com.onlineshop.exception.UserDaoException;
import com.onlineshop.pojo.User;
import com.onlineshop.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author JunedQQ
 * @create 2019/12/22
 * @since 1.0.0
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    @Autowired
    @Qualifier("userInfoDao")
    private UserInfoDao userInfoDao;

    @Override
    public User findUserByUserName(String userName) {
        return userDao.findUserByUserName(userName);
    }

    @Override
    public User findUserByUserNameToLogin(String userName) {
        return userDao.findUserByUserNameToLogin(userName);
    }

    @Override
    public User findUserById(int userId) {
        return userDao.findUserById(userId);
    }

    @Override
    public boolean judgeUserIsExist(String userName) {
        User user = userDao.judgeUserIsExist(userName);
        if (user == null){
            return false;
        }
        return true;
    }


    @Override
    public boolean addUser(User user) {
        int result = userDao.addUser(user);
        int infoResult = userInfoDao.addUserInfoOnUserId(user);
        if (result <1 || infoResult<1){
            throw new UserDaoException();
        }else {
            return true;
        }
    }

    @Override
    public int updateUserPassWord(User user) {
        return userDao.updateUserPassWord(user);
    }

    @Override
    public int updateUserInfo(User user) {
        return userInfoDao.updateUserInfo(user);
    }
}