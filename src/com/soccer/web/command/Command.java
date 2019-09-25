package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.pool.Constants;

import lombok.Data;

@Data
public class Command implements Order{
	protected HttpServletRequest request;
	protected String action, domain, page, view;
	
	@Override
	public void execute() {
		setPage();
		this.view = String.format(Constants.PATH, page);
		System.out.println("커맨드 도착");
	}

	public void setPage() {
		page = request.getParameter("page");
	}
	
}
