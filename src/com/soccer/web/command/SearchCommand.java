package com.soccer.web.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.domanis.PlayerBean;
import com.soccer.web.serviceimpl.PlayerServiceImpl;

public class SearchCommand extends Command {

	public SearchCommand(HttpServletRequest request) {
		System.out.println("SearchCommand 도착");
		super.setRequest(request);
		setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		execute();
	}

	@Override
	public void execute() {
		PlayerBean param = new PlayerBean();
		switch (request.getParameter("page")) {
		case "2_positions":
			request.setAttribute("positions", PlayerServiceImpl.getInstance().findPositions());
			System.out.println("포지션:" + request.getParameter("positions"));
			break;
		case "4_find_by_teamid_position":

			param.setTeamId(request.getParameter("teamId"));
			param.setPosition(request.getParameter("position"));
			List<PlayerBean> p = new ArrayList<>();
			List<String> playerName = new ArrayList<>();
			p = PlayerServiceImpl.getInstance().findByTeamidPosition(param);
			for (int i = 0; i < p.size(); i++) {
				playerName.add(p.get(i).getPlayerName());
			}
			System.out.println(playerName);
			System.out.println(request.getParameter("teamId"));
			System.out.println(request.getParameter("position"));
			request.setAttribute("teamId", request.getParameter("teamId"));
			request.setAttribute("position", request.getParameter("position"));
			request.setAttribute("playerName", playerName);
			break;
		case "5_find_by_teamid_height_name":
			playerName = new ArrayList<>();
			param.setTeamId(request.getParameter("teamId"));
			param.setHeight(request.getParameter("height"));
			param.setPlayerName(request.getParameter("playerName"));
			p = PlayerServiceImpl.getInstance().findByTeamidHeightName(param);
			for (int i = 0; i < p.size(); i++) {
				playerName.add(p.get(i).getPlayerName());
			}
			request.setAttribute("teamId", request.getParameter("teamId"));
			request.setAttribute("height", request.getParameter("height"));
			request.setAttribute("playerName", playerName);
			break;
		}
		super.execute();
	}
}
