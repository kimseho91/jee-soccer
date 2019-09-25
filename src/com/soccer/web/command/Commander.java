package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;
import com.soccer.web.enums.Action;

public class Commander {
	public static Command direct(HttpServletRequest request) {
		Command o = null;
		System.out.println("커멘더 도착");
		switch (Action.valueOf(request.getParameter("action").
				toUpperCase())) {
		case SERACH :
			o = new SerachCommand();
			break;
		case MOVE :
			o = new MoveCommand(request); 
			System.out.println("커맨더 스위치 무브 도착");
			break;
		case LOGIN:
			o = new LoginCommand(request);
			break;
		default:
			break;
		}
		return o;
	}
}
