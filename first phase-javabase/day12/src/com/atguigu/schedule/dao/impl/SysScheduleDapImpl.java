package com.atguigu.schedule.dao.impl;

import com.atguigu.schedule.dao.BaseDao;
import com.atguigu.schedule.dao.SysScheduleDao;
import com.atguigu.schedule.pojo.SysSchedule;

import java.util.List;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/12 11:27
 * @Version 1.0
 */
public class SysScheduleDapImpl extends BaseDao implements SysScheduleDao {
    @Override
    public int addSchedule(SysSchedule schedule) {
        String sql = "insert into sys_schedule values(DEFAULT,?,?,?);";
        int rows = baseUpdate(sql, schedule.getUid(), schedule.getTitle(), schedule.getCompleted());
        return rows;
    }

    @Override
    public List<SysSchedule> findAll() {
        String sql = "select * from sys_schedule;";
        List<SysSchedule> sysScheduleList = baseQuery(SysSchedule.class, sql);
        return sysScheduleList;
    }

}
