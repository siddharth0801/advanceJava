package com.register;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.Crud;
import com.login.dao.Dao;
import com.user.Party;
import com.user.UserLogin;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fname=request.getParameter("firstName");
		String lname=request.getParameter("lastName");
		String add=request.getParameter("address");
		String city=request.getParameter("city");
		String state=request.getParameter("state");
		String country=request.getParameter("country");
		String zip=request.getParameter("zip");
		String phone=request.getParameter("phone");
		
		if(fname.isEmpty()||lname.isEmpty()) {
			response.sendRedirect("error.jsp");
		}
		else {
			Party pt = new Party(fname, lname, add, city, zip, state, country, phone);
			
			
			
			boolean ans = Crud.insert(pt);
			if(ans) {
				String uname=request.getParameter("uname");
				String passw=request.getParameter("passw");
				
				Dao ld = new Dao();
				int partyId = ld.getPartyId(pt);
				UserLogin ul = new UserLogin(uname, passw, partyId);
				Crud.insertUserLogin(ul);
				
				response.sendRedirect("login.jsp");
			}
			else {
				System.out.println("Something went wrong..");
			}
		}
		
		
		
	}

}
