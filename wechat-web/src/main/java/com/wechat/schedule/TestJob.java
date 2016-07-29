package com.wechat.schedule;

import org.apache.log4j.Logger;

import com.wechat.schedule.job.BaseJob;

public class TestJob extends BaseJob {

	private static final Logger logger = Logger.getLogger(TestJob.class);

	public void test(){
		logger.info(">>>>>>>>>>>>>>>>>>aaaaaaaaaaaaaaa");
	}
}
