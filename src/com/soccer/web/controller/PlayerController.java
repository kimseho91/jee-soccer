package com.soccer.web.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.soccer.web.domanis.PlayerBean;
import com.soccer.web.service.PlayerService;
import com.soccer.web.serviceimpl.PlayerServiceImpl;

@WebServlet("/player.do")
public class PlayerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void service(HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("컨트롤러1");
		PlayerBean player = null;
        String action = request.getParameter("action");
        switch(action) {
        case "move" :
        	break;
        case"find2" :
            request.setAttribute("positions", 
            		PlayerServiceImpl.getInstance().findPositions());
			System.out.println("파인드2");
			break;
		case "find4":
			player = new PlayerBean();
			player.setTeamId(request.getParameter("teamId"));
			player.setPosition(request.getParameter("position"));
			request.setAttribute("player", 
					PlayerServiceImpl.getInstance().findByTeamidPosition(player));
			System.out.println("파인드4");
			break;
		case "find5":
			player = new PlayerBean();
			player.setPlayerName(request.getParameter("playerName"));
			player.setTeamId(request.getParameter("teamId"));
			player.setHeight(request.getParameter("height"));
			request.setAttribute("player", 
					PlayerServiceImpl.getInstance().findByTeamidHeightName(player));
			System.out.println("파인드5");
			break;
		}
        String page = request.getParameter("page");
		RequestDispatcher rd = request
				.getRequestDispatcher(String.format("WEB-INF/views/%s.jsp", 
						page));
		rd.forward(request, response);
	}
}