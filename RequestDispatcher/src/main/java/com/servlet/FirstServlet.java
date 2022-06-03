package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class FirstServlet extends HttpServlet {

	@Override
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String em = req.getParameter("em");
		String password = req.getParameter("password");
		PrintWriter out = resp.getWriter();
		
		RequestDispatcher rd;
		if("abc@gmail.com".equals(em) && "abc".equals(password)) {
			rd=req.getRequestDispatcher("/servlet2");
			rd.forward(req, resp);
//			resp.sendRedirect("servlet2");
		}else {
			out.print("Invalid Input");
			rd=req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
		}
	}	
}
