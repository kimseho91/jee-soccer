package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sender {
	public static void forward(HttpServletRequest request, 
			HttpServletResponse response) {
		System.out.println("센더 포워드 도착");
		try {
			System.out.println("도착지 : " + Reciver.cmd.getView());
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
