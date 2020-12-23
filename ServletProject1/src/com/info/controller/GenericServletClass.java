package com.info.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class GenericServletClass
 */
@WebServlet("/genericservlet")
public class GenericServletClass extends GenericServlet implements Servlet {
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("Hello I am GenericServlet");
	}

}
