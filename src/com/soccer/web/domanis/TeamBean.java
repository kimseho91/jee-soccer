package com.soccer.web.domanis;

import java.io.Serializable;

import lombok.Data;

@Data
public class TeamBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private String teamId, regionName, teamName, eTeamName, origYYYY, zipCode1, zipCode2, address, ddd, tel, fax,
	homepage, owner, stadiumId;

}
