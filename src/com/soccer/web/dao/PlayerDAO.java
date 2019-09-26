package com.soccer.web.dao;

import java.util.List;
import com.soccer.web.domanis.PlayerBean;

public interface PlayerDAO {
	public PlayerBean selectByPlayerIdSolar(PlayerBean param);
	public List<String> selectPositions();
	public List<PlayerBean> selectTeamidPosition(PlayerBean param);
	public List<PlayerBean> selectTeamidHeightName(PlayerBean param);
	//테스트
	public List<PlayerBean> selectByMany(PlayerBean parma);
}
