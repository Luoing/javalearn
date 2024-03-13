package com.atguigu.schedule.service;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/12 17:15
 * @Version 1.0
 */

import com.atguigu.schedule.pojo.SysUser;

/**
 * 该接口定义类sys_user的核心业务
 */
public interface SysUserService {

    int regist(SysUser sysUser);

    SysUser findByUsername(String username);
}
