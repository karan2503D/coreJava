package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String course = req.getParameter("course"); 
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>" + name + "</h1>");
		out.println("<h1>" + email + "</h1>");
		out.println("<h1>" + password + "</h1>");
		out.println("<h1>" + course + "</h1>");
	}
	
}
