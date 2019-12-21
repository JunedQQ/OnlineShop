package com.onlineshop.dao;

import com.onlineshop.pojo.Address;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author JunedQQ
 * @create 2019/12/19
 * @since 1.0.0
 */
@Repository("addressDao")
public interface AddressDao {

    /**
     * 根据用户id来查询收货地址
     * @param userId
     * @return
     */
    List<Address> findAddressByUserId(int userId);


    /**
     * 根据地址id获取地址实体
     * @param id
     * @return
     */
    Address findAddressById(int id);
}