package com.wechat.service.schedule;

import java.util.List;

import com.wechat.model.schedule.Schedule;
import com.wechat.service.BaseService;

public interface ScheduleService extends BaseService<Schedule> {

	public List<Schedule> selectByJobStatus(Integer jobStatus);

	public int run(Schedule schedule);

	public int executing(Schedule schedule);

	public int pause(Schedule schedule);

	public int stop(Schedule schedule);

	public int exception(Schedule schedule);
}
