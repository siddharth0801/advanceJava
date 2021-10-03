package com.hotwax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class helloWorld extends HttpServlet
{

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException 
	{
		
		PrintWriter out = res.getWriter();
		
		out.println("<html><body>");
		out.println("<h1>Hello World from Servlet!</h1>");
		out.println("</body></html>");
	}
	
}
