package com.infe.action;

import com.info.service.EmployeeService;

public class LoginAction 
{
	private String username;
	private String password;
	
	public String execute()
	{        
		if(username.equalsIgnoreCase("Abhay")&&password.equalsIgnoreCase("abhay123"))
			return "success";
		else
			return "failure";
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
