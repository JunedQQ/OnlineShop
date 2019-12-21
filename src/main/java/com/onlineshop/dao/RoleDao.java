package com.onlineshop.dao;

import com.onlineshop.pojo.Role;

import org.springframework.stereotype.Repository;

/**
 * @author JunedQQ
 * @create 2019/12/19
 * @since 1.0.0
 */
@Repository("roleDao")
public interface RoleDao {

    /**
     * 通过id来查询角色
     * @param id
     * @return
     */
    Role findRoleById(int id);
}