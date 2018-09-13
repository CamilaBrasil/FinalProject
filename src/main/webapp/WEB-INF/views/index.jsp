<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login/Index page</title>
<link href="https://bootswatch.com/4/united/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<!-- <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css"> -->
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
		<a class="navbar-brand" href="/index"></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarColor01" aria-controls="navbarColor01"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarColor01">
			<ul class="navbar-nav mr-auto">
				<!-- <li class="nav-item"><a class="nav-link" href="/login">Login</a>
				</li>-->
				<!--  <li class="nav-item"><a class="nav-link" href="register">Register</a>
				</li> -->
				<li class="nav-item"><a class="nav-link" href="/about">About</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/contact">Contact</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/login">Log Out</a>
				</li>
			</ul>
			
		</div>
	</nav>
	
	<h1>Welcome, ${user.firstname} ${user.lastname}</h1> 
	 <h3>Email: ${user.email}</h3>
	 <h3>Zipcode: ${user.zipcode}</h3>
</body>
</html>