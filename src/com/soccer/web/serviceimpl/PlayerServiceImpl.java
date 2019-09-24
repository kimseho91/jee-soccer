package com.soccer.web.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.soccer.web.dao.PlayerDAO;
import com.soccer.web.daoimpl.PlayerDAOImpl;
import com.soccer.web.domanis.PlayerBean;
import com.soccer.web.service.PlayerService;

public class PlayerServiceImpl implements PlayerService{
	private static PlayerServiceImpl instance = new PlayerServiceImpl();
	
	public static PlayerServiceImpl getInstance() {
		return instance;
	}
	
	private PlayerServiceImpl() {
	}
	@Override
	public List<String> findPositions() {
		System.out.println("서비스 도착");
		return PlayerDAOImpl.getInstance().selectPositions();
	}
	
	@Override
	public List<PlayerBean> findByTeamidPosition(PlayerBean param) {
		System.out.println("서비스 도착2");
		return PlayerDAOImpl.getInstance().selectTeamidPosition(param);
	}
	
	@Override
	public List<PlayerBean> findByTeamidHeightName(PlayerBean param) {
		System.out.println("서비스 도착3");
		return PlayerDAOImpl.getInstance().selectTeamidHeightName(param);
	}

}