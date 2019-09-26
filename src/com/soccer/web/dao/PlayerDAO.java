package com.soccer.web.dao;

import java.util.List;

import com.soccer.web.domanis.PlayerBean;

public interface PlayerDAO {
	public boolean login(PlayerBean param);
	public List<String> selectPositions();
	public List<PlayerBean> selectTeamidPosition(PlayerBean param);
	public List<PlayerBean> selectTeamidHeightName(PlayerBean param);

}
