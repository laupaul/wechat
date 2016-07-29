package com.wechat.persistence.schedule;

import java.util.List;

import com.wechat.model.schedule.Schedule;

public interface ScheduleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Schedule record);

    int insertSelective(Schedule record);

    Schedule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Schedule record);

    int updateByPrimaryKey(Schedule record);

	List<Schedule> selectByJobStatus(Integer jobStatus);
}