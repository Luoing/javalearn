package com.atguigu.schedule.test;

import com.atguigu.schedule.dao.BaseDao;
import com.atguigu.schedule.pojo.SysUser;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/12 13:51
 * @Version 1.0
 */
public class BaseDaoTest {

    private static BaseDao baseDao;

    @BeforeClass
    public static void initBaseDao(){
        baseDao = new BaseDao();
    }
    @Test
    public void baseQueryObjectTest(){
        //查询用户数量
        String sql = "select count(1) from sys_user;";
        Long count = baseDao.baseQueryObject(Long.class, sql);
        System.out.println(count);
    }
    
    @Test
    public void baseQueryTest(){
        String sql = "select uid,username,user_pwd userPwd from sys_user;";
        List<SysUser> sysUserList = baseDao.baseQuery(SysUser.class, sql);
        sysUserList.forEach(System.out::println);
    }
    @Test
    public void baseUpdateTest(){
        String sql = "insert into sys_schedule value(DEFAULT,?,?,?);";
        int rows = baseDao.baseUpdate(sql, 1, "学习java", 0);
        System.out.println(rows);
    }
}
