package com.atguigu.schedule.test;

import com.atguigu.schedule.dao.BaseDao;
import com.atguigu.schedule.dao.SysScheduleDao;
import com.atguigu.schedule.dao.impl.SysScheduleDapImpl;
import com.atguigu.schedule.pojo.SysSchedule;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/12 16:32
 * @Version 1.0
 */
public class SysScheduleDaoTest {
    private static SysScheduleDao scheduleDao;

    @BeforeClass
    public static void initSyscheduleDao(){
        scheduleDao = new SysScheduleDapImpl();
    }

    @Test
    public void AddScheduleTest(){
        int rows = scheduleDao.addSchedule(new SysSchedule(null, 2, "学习数据库", 1));
        System.out.println(rows);
    }
    
    @Test
    public void FindAlltest(){
        List<SysSchedule> sysScheduleList = scheduleDao.findAll();
        sysScheduleList.forEach(System.out::println);

    }
}
