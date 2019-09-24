package com.soccer.web.daoimpl;

import com.soccer.web.dao.StadiumDAO;

public class StadiumDAOImpl implements StadiumDAO{
	private static StadiumDAOImpl instance = new StadiumDAOImpl();

	public static StadiumDAOImpl getInstance() {
		return instance;
	}
	
	private StadiumDAOImpl() {
	}
}
