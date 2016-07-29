package com.wechat.schedule.listener;

import org.quartz.SchedulerException;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.wechat.schedule.manager.JobManager;

@Component
public class JobManageStartupListener implements ApplicationListener<ContextRefreshedEvent> {


	@Override
	public void onApplicationEvent(ContextRefreshedEvent paramE) {
		try {
			JobManager jobManager=paramE.getApplicationContext().getBean(JobManager.class);
			jobManager.init();
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
	}

}
