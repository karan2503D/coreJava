package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

// Use GenericServlet because do not need to override all 5 methods of servlets only.

public class secondApplication extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		
		System.out.println("Generic Servlet");
		arg1.setContentType("text/html");
		PrintWriter out=arg1.getWriter();
		out.print("Date");
		
		
	}

}
