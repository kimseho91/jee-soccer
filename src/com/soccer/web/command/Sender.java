package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sender {
	public static void forward(HttpServletRequest request, 
			HttpServletResponse response) {
		try {
			System.out.println("10. 샌더 들어옴");
			System.out.println(String.format("request 값 : %s, %s, %s, %s",
					request.getParameter("playerId"),
					request.getParameter("solar"),
					request.getParameter("action"),
					request.getParameter("page")));
			request
			.getRequestDispatcher(Reciver.cmd.getView())
			.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void redirect(HttpServletRequest request, 
			HttpServletResponse response) {
		try {
			response
			.sendRedirect("");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
