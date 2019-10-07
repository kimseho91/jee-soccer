package com.soccer.web.dao;

import java.util.List;
import com.soccer.web.domanis.PlayerBean;

public interface PlayerDAO {
	public boolean insertPlayer(PlayerBean param);
	//로그인
	public PlayerBean selectByPlayerIdSolar(PlayerBean param);
	public List<String> selectPositions();
	//포지션
	public List<PlayerBean> selectTeamidPosition(PlayerBean param);
	public List<PlayerBean> selectTeamidHeightName(PlayerBean param);
	
}
