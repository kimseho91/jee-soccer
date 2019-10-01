package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

public class JoinCommand extends Command {
	public JoinCommand(HttpServletRequest request) {
		setRequest(request);
		setDomain(request.getServletPath()
				.substring(1,request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		execute();
	}
}
