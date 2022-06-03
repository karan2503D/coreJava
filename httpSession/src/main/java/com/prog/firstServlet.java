package com.prog;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/firstservlet")
public class firstServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("nm");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print("<h1>name="+name+"</h1>");
		HttpSession session = req.getSession();
		session.setAttribute("name", name);
		out.print("<a href='secondservlet'>second servlet</a>");
	}
	
}
