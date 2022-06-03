package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/second")
public class SecondServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int first = Integer.parseInt(req.getParameter("first"));
		int second = Integer.parseInt(req.getParameter("second"));
		int mul = first*second;
		
		int sum =(int)req.getAttribute("sum");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("Mul"+ " " +mul + " Sum " + " " + sum);
	}

}
