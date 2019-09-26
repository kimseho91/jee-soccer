package com.soccer.web.service;

import java.util.List;

import com.soccer.web.domanis.PlayerBean;

public interface PlayerService {
	public PlayerBean login(PlayerBean param);
	public List<String> findPositions();
	public List<PlayerBean> findByTeamidPosition(PlayerBean param);
	public List<PlayerBean> findByTeamidHeightName(PlayerBean param);
}
