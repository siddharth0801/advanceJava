<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
        <head>
        	<script>
		function validateForm() {
  		let fn = document.forms["registerForm"]["firstName"].value;
  		let ln = document.forms["registerForm"]["lastName"].value;
  		
  		if (fn == "") {
    		alert("Empty First Name");
    		return false;
  			}
  		if (ln == "") {
    		alert("Empty Last Name");
    		return false;
  			}
		}
			</script>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            

            <!-- <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css"> -->
            <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">

            <!-- <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
            <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script> -->
            <link rel="stylesheet" href="home.css">
            <title>Registration Form</title>
        </head>
<body>

    <div id="register">
        <h3 class="text-center text-white pt-5">Registration Form</h3>
        <div class="container">
            <div id="register-row" class="row justify-content-center align-items-center">
                <div id="register-column" class="col-md-6">
                    <div id="register-box" class="col-md-12">
                        <form name="registerForm" id="register-form" class="form" action="Register" onsubmit="return validateForm()" method="POST">
                            <div class="form-group">
                                <label for="firstName" class="text-info">First Name</label><br>
                                <input type="text" name="firstName" id="firstName" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="lastName" class="text-info">Last Name:</label><br>
                                <input type="text" name="lastName" id="lastName" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="address" class="text-info">Address:</label><br>
                                <input type="text" name="address" id="address" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="city" class="text-info">City:</label><br>
                                <input type="text" name="city" id="city" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="state" class="text-info">State:</label><br>
                                <input type="text" name="state" id="state" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="country" class="text-info">Country:</label><br>
                                <input type="text" name="country" id="country" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="zip" class="text-info">Zip:</label><br>
                                <input type="text" name="zip" id="zip" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="phone" class="text-info">Phone:</label><br>
                                <input type="text" name="phone" id="phone" class="form-control">
                            </div>
                            <hr>
                            <div class="form-group">
                                <label for="uname" class="text-info">Username:</label><br>
                                <input type="text" name="uname" id="uname" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label for="passw" class="text-info">Password:</label><br>
                                <input type="password" name="passw" id="passw" class="form-control" required>
                            </div>
                            <div class="form-group">
                            <br><br>
                                <input type="submit" name="submit" class="btn btn-info btn-md" value="Register">
                                <a href="login.jsp"><button type="button" class="btn btn-warning">Login</button></a>
                            </div>
                            
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

</body>
</html>
