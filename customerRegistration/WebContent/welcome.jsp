<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
<link rel="stylesheet" href="welcome.css">
<title>Home</title>
</head>
<body>
		<%
		response.setHeader("Cache-Control", "No-cache, no-store, must-revalidate");
		
		if(session.getAttribute("userName")==null){
			response.sendRedirect("login.jsp");
		}
		
		%>
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Party App</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
    <div class="navbar-nav">
      
      <form action="Logout">
		<input type="submit" class="btn btn-outline-danger my-2 my-sm-0" value="Logout">
		</form>
    </div>
  </div>
</nav>
		<div class="container">
  		<h1 class="display-4">Welcome User:${userName }</h1>
  		
		<div id="search">
		<form action="Search" method="POST">
			<div class="input-group">
  			<div class="input-group-prepend">
    		<span class="input-group-text">First & Last Name Search</span>
  			</div>
  			<input type="text" name="fname" aria-label="First name" class="form-control">
  			<input type="text" name="lname" aria-label="Last name" class="form-control">
  			<input type="submit" class="btn btn-primary" value="Search">
			</div>
		</form>
		</div>
		<div id="displayall">
		<form action="Display" method="post">
		<input type="submit" class="btn btn-outline-success btn-lg btn-block" value="Display all User's">
		</form>
		</div>
		
		</div>
		
		
</body>
</html>