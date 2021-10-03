<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList,com.user.Party" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">

<title>User List</title>
</head>
<body>
	<%
		response.setHeader("Cache-Control", "No-cache, no-store, must-revalidate");
		if(session.getAttribute("userName")==null){
			response.sendRedirect("login.jsp");
		}
		
	%>
	

	<%! ArrayList<Party> alist; %>

	<div class="container">
	<h1 class="display-3">Party List</h1>
	<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">PartyId</th>
      <th scope="col">First Name</th>
      <th scope="col">Last Name</th>
      <th scope="col">Address</th>
      <th scope="col">City</th>
<th scope="col">Zip</th>
<th scope="col">State</th>
<th scope="col">Country</th>
<th scope="col">Phone</th>
<th scope="col">Actions</th>
    </tr>
  </thead>
<%
	
		alist = (ArrayList<Party>)request.getAttribute("alist");
	
		if(alist != null && !alist.isEmpty()) {

			for(int i=0;i<alist.size();i++) {		
		
		%>
  <tbody>
    <tr>
      <th scope="row"><%=alist.get(i).getPartyId() %></td>
			<td><%=alist.get(i).getFirstName() %></td>
			<td><%=alist.get(i).getLastname() %></td>
			<td><%=alist.get(i).getAddress() %></td>
			<td><%=alist.get(i).getCity() %></td>
			<td><%=alist.get(i).getZip() %></td>
			<td><%=alist.get(i).getState() %></td>
			<td><%=alist.get(i).getCountry() %></td>
			<td><%=alist.get(i).getPhone() %></td>
			<td>
    		<form action="Delete" method="post">
        	<input type="submit" name="delete_user" value="Delete" />
        	<input type="hidden" name="user" value="<%=alist.get(i).getPartyId() %>" />
    		</form>
    		<form action="Update" method="post">
        	<input type="submit" name="update_user" value="Update" />
        	<input type="hidden" name="user" value="<%=alist.get(i).getPartyId() %>" />
    		</form>
			</td>
    </tr>
<%
			}
		
		} else {
	%>

		<tr>

			<td colspan="9" align="center">No Records Available!!</td>

		</tr>

		<%
		}
	%>
  </tbody>
</table>

	<br>
	<br>
	<a href="welcome.jsp">Back to Home..</a>
	</div>
</body>
</html>