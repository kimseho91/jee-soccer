package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;
import com.soccer.web.domanis.PlayerBean;
import com.soccer.web.serviceimpl.PlayerServiceImpl;

public class CreateCommand extends Command{
	public CreateCommand(HttpServletRequest request) {
		System.out.println("CreateCommand 들어옴");
		setRequest(request);
		setAction(action);
		setDomain(domain);
		super.execute();
		this.execute();
	}
	@Override
	public void execute() {
		PlayerBean param = new PlayerBean();
		System.out.println(String.format("request 값 출력 %s, %s, %s, %s"
				,request.getParameter("playerId")
				,request.getParameter("solar")
				,request.getParameter("action")
				,request.getParameter("page")));
		param.setPlayerId(request.getParameter("playerId"));
		param.setSolar(request.getParameter("solar"));
		if(PlayerServiceImpl.getInstance().Join(param)) {
			System.out.println("회원가입 성공 !!");
		}else {
			System.out.println("회원가입 실패 !!!!");
		}
	}
}
