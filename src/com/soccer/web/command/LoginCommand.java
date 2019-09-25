package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

public class LoginCommand extends Command{
	public LoginCommand(HttpServletRequest request) {
		setRequest(request);
		setAction(request.getParameter("action"));
		setPage(request.getParameter("page"));
		execute();
		System.out.println("");
	}
}
