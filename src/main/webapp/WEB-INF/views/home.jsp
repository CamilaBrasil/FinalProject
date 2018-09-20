<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link href="https://bootswatch.com/4/united/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<!-- <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css"> -->
<link rel="icon" 
      type="image/png" 
      href="/images/favicon.png">
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
				<li class="nav-item"><a class="nav-link" href="/home"><img alt="tintech" src="/images/IMG_1877.png" height="50" width="150"></a>
				</li>
				<li class="nav-item"><a class="nav-link"
					href="/findJobs">Find Jobs</a></li>
				<li class="nav-item"><a class="nav-link" href="/favorites">Saved Jobs</a>
				</li>
			
				<li class="nav-item"><a class="nav-link" href="/logout">Log Out</a></li>
			</ul>
		</div>
	</nav>

	<div class="jumbotron">
		<h3 class="display-3">Hello ${user.firstname} ${user.lastname}!</h3>
		<br>
		

		<img alt="tintech" src="/images/IMG_1877.png" height="300" width="700">	
		
		<hr class="my-4">
		
		
	</div>
</body>
</html>