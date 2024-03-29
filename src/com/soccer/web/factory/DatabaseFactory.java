package com.soccer.web.factory;

import com.soccer.web.enums.DB;

public class DatabaseFactory {
	public static Database createDatebase(String vendor) {
		Database db = null;
		switch (DB.valueOf(vendor)) {
		case ORACLE: 
			db = new Oracle(); 
			break;
		case MARIADB: 
			db = new Maria(); 
			break;

		}
		return db;
	}
}
