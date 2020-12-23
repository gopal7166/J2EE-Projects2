package com.sumit.tags;
import java.io.IOException;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.SimpleTagSupport;


public class CustomTag extends SimpleTagSupport 
{
	private String name = "";
	private String desig = "";
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	
	@Override
	public void doTag() throws JspException, IOException 
	{
		JspContext jspContext = getJspContext();
		JspWriter out = jspContext.getOut();
		
		out.println("<h2>Good Morning, Mr. "+name+". Have a good day!!! <br> Your Desig is: "+desig+"</h2>");
	}	
}
