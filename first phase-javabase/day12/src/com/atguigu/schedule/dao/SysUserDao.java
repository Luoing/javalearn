package com.atguigu.schedule.dao;

import com.atguigu.schedule.pojo.SysUser;

import java.util.List;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/12 10:54
 * @Version 1.0
 */
public interface SysUserDao {
    int addUser(SysUserDao sysUserDao);
    List<SysUser> findAll();

    int addSysUser(SysUser sysUser);

    SysUser findByUsername(String username);
}
