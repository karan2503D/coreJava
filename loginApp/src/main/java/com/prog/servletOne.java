package com.prog;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servletone")
public class servletOne extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("nm");
		String password = req.getParameter("pass");
		
		Cookie ck = new Cookie("nm",name);
		Cookie ck1 = new Cookie("pass",password);
		
		resp.addCookie(ck);
		resp.addCookie(ck1);
		resp.sendRedirect("prod");
		
		resp.setContentType("text/html");
		
	}
	
}
