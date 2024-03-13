package com.atguigu.schedule.dao;

import com.atguigu.schedule.pojo.SysSchedule;

import java.util.List;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/12 10:58
 * @Version 1.0
 */
public interface SysScheduleDao {
    /**
     * 向数据库中增加一条日程记录
     * @param schedule 日程记录以sysschedule实体类对象形式入参
     * @return 返回影响数据库记录的行数，行数为0说明增加失败，行数大于0说明增加成功
     */
    int addSchedule(SysSchedule schedule);
    /**
     * 查询所有用户信息
     * @return 以list集合返回
     */
    List<SysSchedule> findAll();
}
