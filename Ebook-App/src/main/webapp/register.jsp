<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EBook:Register</title>
<%@include file="all_Component/allCss.jsp" %>
</head>
<body style="background-color:#f0f1f2;">
 <%@include file="all_Component/navbar.jsp" %>
 	
 	 <br><br>
 	 <div class="container p-2">
		 <div class="row">
			 <div class="col-md-4 offset-md-4">
 				<div class="card">
					 <div class ="card-body">
					
					 	<h4 class="text-center">Registration</h4>
					 	<form action="register" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Name</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required="required" placeholder="Enter Full Name" name="fname">
    
  </div>
    <div class="form-group">
    <label for="exampleInputEmail1">Email Address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required="required" placeholder="Enter email" name="email">
    
  </div>
    <div class="form-group">
    <label for="exampleInputEmail1">Phone Number</label>
    <input type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required="required" placeholder="Enter Your mobile number" name="phno">
    
  </div>
  
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" required="required" placeholder="Password" name="password">
  </div>
  
    <div class="form-check">
    <input type="checkbox" class="form-check-input" 
    name="check" id="exampleCheck1" >
    <label class="form-check-label" for="exampleCheck1">Agree Terms & Conditions</label>
  </div>
 
  <br>
  <div class="text-center">
  <button type="submit" class="btn btn-primary">Submit</button>
  <br><br>
  <p>Already have an account, <a href="login.jsp"> LogIn</a></p>
  </div>
</form>
					 </div>
				 </div>
 			</div>
 		</div>
	 </div>
	
</body>
</html>