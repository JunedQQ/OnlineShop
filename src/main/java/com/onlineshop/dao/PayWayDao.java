package com.onlineshop.dao;

import com.onlineshop.pojo.PayWay;

import org.springframework.stereotype.Repository;

/**
 * @author JunedQQ
 * @create 2019/12/20
 * @since 1.0.0
 */
@Repository("payWayDao")
public interface PayWayDao {

    /**
     * 根据id查询付款方式
     * @param id
     * @return
     */
    PayWay findPayWayById(int id);
}