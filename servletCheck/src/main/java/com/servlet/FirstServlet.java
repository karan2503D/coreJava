package com.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/first")
public class FirstServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int first = Integer.parseInt(req.getParameter("first"));
		int second = Integer.parseInt(req.getParameter("second"));
		int sum = first+second;
		
		req.setAttribute("sum", sum);
		RequestDispatcher rd;
		rd=req.getRequestDispatcher("/second");
		rd.forward(req, resp);
	}
	
}
