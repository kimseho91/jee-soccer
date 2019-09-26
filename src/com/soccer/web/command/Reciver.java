package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

public class Reciver {
	public static Command cmd = new Command();
	public static void init(HttpServletRequest request) {
		cmd = Commander.direct(request);
	}
}
