package com.infe.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/servletCheck")
public class HelloServlet implements Servlet {

    public HelloServlet() {
        // TODO Auto-generated constructor stub
    }
	public void init(ServletConfig config) throws ServletException 
	{
		System.out.println("init() method called during serlvet starting....");
	}
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Request has been processed..");
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		out.println("Hi Abhay I am Servlet");
		destroy();
	}
	public void destroy() 
	{
		System.out.println("Serlvet has been destroyed!!!");
	}
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null; 
	}


}
