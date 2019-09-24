package com.soccer.web.serviceimpl;

import com.soccer.web.service.ScheduleService;

public class ScheduleServiceImpl implements ScheduleService{
	private static ScheduleServiceImpl instance = new ScheduleServiceImpl();

	public static ScheduleServiceImpl getInstance() {
		return instance;
	}
	
	private ScheduleServiceImpl() {
	}
}
