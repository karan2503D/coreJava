package com.prog;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/checklogin")
public class checkLogin extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("nm");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		Cookie ck = new Cookie("nm",name);
		resp.addCookie(ck);
		
		out.print(name);
		out.print("<br> <a href='checklogintwo'>Second</a>");
	}
	
}
