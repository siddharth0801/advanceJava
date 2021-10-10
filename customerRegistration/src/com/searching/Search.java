package com.searching;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.dao.Dao;
import com.user.Party;

/**
 * Servlet implementation class Search
 */

@WebServlet("/Search")
public class Search extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			HttpSession session = request.getSession();
			if(session.getAttribute("userName")==null)
			{
				response.sendRedirect("login.jsp");
			}
			else 
			{
				String fname=request.getParameter("fname");
				String lname=request.getParameter("lname");
				Dao d = new Dao();
				ArrayList<Party> al = d.getList(fname, lname);
				RequestDispatcher dispatcher = request.getRequestDispatcher("listparty.jsp");
				request.setAttribute("alist", al);
				dispatcher.forward(request, response);

			}
	}

}
