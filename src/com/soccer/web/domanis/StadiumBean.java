package com.soccer.web.domanis;

import java.io.Serializable;

import lombok.Data;

@Data
public class StadiumBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private String stadiumId,stadiumName,hometeamId,address,ddd,tel,seatCount;
}
