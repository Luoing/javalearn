package com.atguigu.schedule.service.impl;

import com.atguigu.schedule.dao.SysUserDao;
import com.atguigu.schedule.dao.impl.SysUserDaoImpl;
import com.atguigu.schedule.pojo.SysUser;
import com.atguigu.schedule.service.SysUserService;
import com.atguigu.schedule.util.MD5Util;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/12 17:25
 * @Version 1.0
 */
public class SysUserServiceImpl implements SysUserService {
    private SysUserDao userDao = new SysUserDaoImpl();
    @Override
    public int regist(SysUser sysUser) {
        //将用户的明文密码转为加密
//        String userPwd = sysUser.getUserPwd();
//        String encrypt = MD5Util.encrypt(userPwd);
        sysUser.setUserPwd(MD5Util.encrypt(sysUser.getUserPwd()));
        //调用DAO层的方法 将sysuser信息存入数据库
        int rows = userDao.addSysUser(sysUser);

        return rows;
    }

    @Override
    public SysUser findByUsername(String username) {
        SysUser sysUser = userDao.findByUsername(username);
        return sysUser;
    }
}
