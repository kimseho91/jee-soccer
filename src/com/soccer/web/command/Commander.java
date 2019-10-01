package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;
import com.soccer.web.enums.Action;

public class Commander {
	public static Command direct(HttpServletRequest request) {
		Command cmd = null;
		System.out.println("커맨더");
		switch (Action.valueOf(request.getParameter("action").
				toUpperCase())) {
		case CREATE :
			cmd = new CreateCommand(request);
			System.out.println("커멘더 스위치 탐");
			break;
		case SERACH :
			cmd = new SearchCommand(request);
			break;
		case UPDATE :
			break;
		case DELETE :
			break;
		case MOVE :
			cmd = new MoveCommand(request); 
			break;
		case LOGIN :
			cmd = new LoginCommand(request);
			break;
		default:
			break;
		}
		return cmd;
	}
}
