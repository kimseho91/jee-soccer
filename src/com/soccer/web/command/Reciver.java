package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

public class Reciver {
	public static Command cmd = new Command();
	public static void init(HttpServletRequest request) {
		System.out.println("2. 리시버 들어옴");
		System.out.println(String.format("request 값 : %s, %s, %s, %s",
				request.getParameter("playerId"),
				request.getParameter("solar"),
				request.getParameter("action"),
				request.getParameter("page")));
		cmd = Commander.direct(request);
	}
}
