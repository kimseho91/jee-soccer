package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.domanis.PlayerBean;
import com.soccer.web.serviceimpl.PlayerServiceImpl;

public class LoginCommand extends Command{
	public LoginCommand(HttpServletRequest request) {
		setRequest(request);
		setDomain(request.getServletPath()
				.substring(1,request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		execute();
	}
	@Override
	public void execute() {
		String playerId = request.getParameter("playerId");
		String solar = request.getParameter("solar");
		PlayerBean player = new PlayerBean();
		player.setPlayerId(playerId);
		player.setSolar(solar);
		player = PlayerServiceImpl.getInstance().login(player);
		System.out.println("로그인 커맨드 : "
		+PlayerServiceImpl.getInstance().login(player));
		setPage((player!=null)?request.getParameter("page"):("login"));
		super.execute();
	}
}
