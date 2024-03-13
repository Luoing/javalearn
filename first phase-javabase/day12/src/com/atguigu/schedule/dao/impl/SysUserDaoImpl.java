package com.atguigu.schedule.dao.impl;

import com.atguigu.schedule.dao.BaseDao;
import com.atguigu.schedule.dao.SysUserDao;
import com.atguigu.schedule.pojo.SysUser;

import java.util.List;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/12 11:09
 * @Version 1.0
 */
public class SysUserDaoImpl extends BaseDao implements SysUserDao {

    @Override
    public int addUser(SysUserDao sysUserDao) {
        String sql = "insert into sys_user values(DEFAULT,?,?);";
        int rows = baseUpdate(sql, "wangwu", "123456");
        return rows;
    }

    @Override
    public List<SysUser> findAll() {
        String sql = "select * from sys_user;";
        List<SysUser> sysUserList = baseQuery(SysUserDao.class, sql);
        return sysUserList;
    }

    @Override
    public int addSysUser(SysUser sysUser) {
        String sql = "insert into sys_user values(DEFAULT,?,?);";
        int rows = baseUpdate(sql,sysUser.getUsername(),sysUser.getUserPwd());
        return rows;
    }

    @Override
    public SysUser findByUsername(String username) {
        String sql = "select uid,username,user_pwd userPwd from sys_user where username = ?;";
        List<SysUser> sysUserList = baseQuery(SysUser.class, sql, username);

        return sysUserList!=null && sysUserList.size() >0 ?sysUserList.get(0) : null;
    }
}
