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
@WebServlet("/UpdateData")
public class UpdateData extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fname=request.getParameter("firstName");
		String lname=request.getParameter("lastName");
		String add=request.getParameter("address");
		String city=request.getParameter("city");
		String state=request.getParameter("state");
		String country=request.getParameter("country");
		String zip=request.getParameter("zip");
		String phone=request.getParameter("phone");
		
//		Party pt = new Party(fname, lname, add, city, zip, state, country, phone);
		
//		int PartyId = (new Dao()).getPartyId(pt);
		HttpSession session = request.getSession();
		int id = (int) session.getAttribute("id");
		session.removeAttribute("id");
		Party pt = new Party(id, fname, lname, add, city, zip, state, country, phone);
		
		Crud.updateParty(pt);
		RequestDispatcher rd=request.getRequestDispatcher("/Display");
		rd.forward(request, response);
		
		
		
		
		
	}

}
