package com.soccer.web.service;

import java.util.List;

import com.soccer.web.domanis.PlayerBean;

public interface PlayerService {
	/** 02 포지션 종류(중복제거,없으면 빈공간)
	 */
	public List<String> findPositions();
	public List<PlayerBean> findByTeamidPosition(PlayerBean param);
	public List<PlayerBean> findByTeamidHeightName(PlayerBean param);
}
