package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

public class MoveCommand extends Command{
	public MoveCommand(HttpServletRequest request) {
		System.out.println("4. 무브커맨드 들어옴");
		System.out.println(String.format("request 값 : %s, %s, %s, %s",
				request.getParameter("playerId"),
				request.getParameter("solar"),
				request.getParameter("action"),
				request.getParameter("page")));
		setRequest(request);
		//setDomain(request.getServletPath()
			//	.substring(1,request.getServletPath().indexOf(",")));
		setAction(request.getParameter("action"));
		execute();
	}
	@Override
	public void execute() {
		setPage(request.getParameter("page"));
		super.execute();
//		request.setAttribute("page",request.getParameter("page"));
	}
}
