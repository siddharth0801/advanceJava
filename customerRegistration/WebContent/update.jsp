<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            

            <!-- <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css"> -->
            <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">

            <!-- <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
            <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script> -->
            <link rel="stylesheet" href="update.css">
            <title>Edit Details</title>
        </head>
<body>

    <div id="update">
        <h3 class="text-center text-white pt-5">Update From</h3>
        <div class="container">
            <div id="update-row" class="row justify-content-center align-items-center">
                <div id="update-column" class="col-md-6">
                    <div id="update-box" class="col-md-12">
                        <form id="update-form" class="form" action="UpdateData" method="POST">
                            <div class="form-group">
                                <label for="firstName" class="text-info">First Name:</label><br>
                                <input type="text" name="firstName" class="form-control" value=${Party.firstName}>
                            </div>
                            <div class="form-group">
                                <label for="lastName" class="text-info">Last Name:</label><br>
                                <input type="text" name="lastName" value=${Party.lastname} class="form-control" >
                            </div>
                            <div class="form-group">
                                <label for="address" class="text-info">Address:</label><br>
                                <input type="text" name="address" value=${Party.address} class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="city" class="text-info">City:</label><br>
                                <input type="text" name="city" value=${Party.city} class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="state" class="text-info">State:</label><br>
                                <input type="text" name="state" value=${Party.state} class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="country" class="text-info">Country:</label><br>
                                <input type="text" name="country" value=${Party.country} class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="zip" class="text-info">Zip:</label><br>
                                <input type="text" name="zip" value=${Party.zip} class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="phone" class="text-info">Phone:</label><br>
                                <input type="text" name="phone" value=${Party.phone} class="form-control">
                            </div>
                            <div class="form-group">
                                <input type="submit" name="submit" class="btn btn-dark btn-md" value="Update">
                                
                            </div>
                            
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

</body>
</html>
