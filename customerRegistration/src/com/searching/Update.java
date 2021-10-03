package com.searching;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.db.Crud;
import com.login.dao.Dao;
import com.user.Party;

/**
 * Servlet implementation class Update
 */
@WebServlet("/Update")
public class Update extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("user"));
		Party existingPt= Dao.selectUser(id);
		request.setAttribute("Party",existingPt);
		
		HttpSession session = request.getSession();
		session.setAttribute("id", id);
		RequestDispatcher rd=request.getRequestDispatcher("update.jsp");
		rd.forward(request, response);
		
	}

}
