package com.infe.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;


public class LoginAction {
	private String username;
	private String password;

	public String execute() {
		return "success";
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
