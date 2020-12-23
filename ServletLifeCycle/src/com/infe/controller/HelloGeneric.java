package com.infe.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class HelloGeneric
 */
@WebServlet("/genericServletCheck")
public class HelloGeneric extsends GenericServlet {
	
	public void init()
	{
		System.out.println("init() of GenericServlet called during serlvet starting....");
	}	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		out.println("Hi Gopal I am GenericServlet");
		System.out.println("Service called...");
	}
	public void destroy() 
	
	{
		System.out.println("Serlvet has been destroyed!!!");
	}
}
