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
		this.view = String.format(Constants.SINGLE_PATH, page);
	}

}
