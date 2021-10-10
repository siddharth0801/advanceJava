<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
			<script>
		function validateForm() {
  		let u = document.forms["loginForm"]["username"].value;
  		let p = document.forms["loginForm"]["password"].value;
  		if (u == "") {
    		alert("Empty Username");
    		return false;
  			}
  		if (p == "") {
    		alert("Empty Password");
    		return false;
  			}
		}
			</script>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
           
            <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">

            <link rel="stylesheet" href="index.css">
            <title>Login Page</title>
</head>
<body>
		
		<div id="login">
        <h3 class="text-center text-white pt-5">Login Form</h3>
        <div class="container">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-md-6">
                    <div id="login-box" class="col-md-12">
                        <form name="loginForm" id="login-form" class="form" action="Login" onsubmit="return validateForm()" method="POST">
                            <div class="form-group">
                                <label for="username" class="text-info">Username</label><br>
                                <input type="text" name="username" id="username" class="form-control" >
                            </div>
                            <div class="form-group">
                                <label for="password" class="text-info">Password</label><br>
                                <input type="password" name="password" id="password" class="form-control" >
                            </div>
                            <div class="form-group">
                            <br><br>
                                <input type="submit" name="submit" class="btn btn-info btn-md" value="Login">
                                <a href="register.jsp"><button type="button" class="btn btn-warning">Register</button></a>
                            </div>
                            
                            
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

</body>
</html>