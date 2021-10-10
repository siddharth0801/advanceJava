package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.db.Crud;
import com.login.dao.Dao;


@WebServlet("/Login")
public class Login extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname=request.getParameter("username");
		String passw=request.getParameter("password");
		
		Dao dao = new Dao();
		System.out.println("Made Object");
		
		
		if(dao.check(uname, passw)) 
		{
			System.out.println("Checked....");
			HttpSession session= request.getSession();
			session.setAttribute("userName", uname);
			session.setAttribute("password", passw);
			response.sendRedirect("welcome.jsp");
		}
		else {
			
			response.sendRedirect("login.jsp");
		}
	}

}
