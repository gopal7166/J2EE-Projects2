package com.infe.action;

public class UserAction 
{
	String username;
	public String execute()
	{		
		username = "Paul";
		System.out.println("The username is : "+username);
		return "success";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}	
}
