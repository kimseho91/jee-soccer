package com.soccer.web.domanis;

import java.io.Serializable;

import lombok.Data;

@Data
public class PlayerBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private String playerId,playerName,ePlayerName,nickname,joinYYYY,position,nation,birthDate,solar,teamId,backNo,height,weight;
}
