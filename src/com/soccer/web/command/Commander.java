package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;
import com.soccer.web.enums.Action;

public class Commander {
	public static Command direct(HttpServletRequest request) {
		System.out.println("3. 커맨더 들어옴");
		System.out.println(String.format("request 값 : %s, %s, %s, %s",
				request.getParameter("playerId"),
				request.getParameter("solar"),
				request.getParameter("action"),
				request.getParameter("page")));
		Command cmd = null;
		switch (Action.valueOf(request.getParameter("action").
				toUpperCase())) {
		case SERACH :
			cmd = new SerachCommand();
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
