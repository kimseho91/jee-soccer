package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

public class Reciver {
	public static Command cmd = new Command();
	public static void init(HttpServletRequest request) {
		System.out.println("리시버");
		cmd = Commander.direct(request);
		System.out.println("리시버 리퀘스트"+request);
	}
}
