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
				<li class="nav-item"><a class="nav-link" href="/">Home</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="register">Register</a>
				</li>
			
			</ul>
		
		</div>
	</nav>

	<div style="padding: 5%">
	
	<h3>${title }</h3>
		<form class="form-horizontal" action="/submitlogin" method="POST">
			<fieldset>
				<div id="legend">
					<legend class="">Login</legend>
				</div>
				<div class="control-group">
					<label class="control-label" for="email">Email</label>
					<div class="controls">
						<input type="text" id="username" name="email" placeholder="email"
							class="input-xlarge">
					</div>
				</div>
				<div class="control-group">
					<!-- Password-->
					<label class="control-label" for="password">Password</label>
					<div class="controls">
						<input type="password" id="password" name="password"
							placeholder="password" class="input-xlarge">
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<button class="btn btn-info">Login</button>
					</div>
				</div>
			</fieldset>
		</form>
	</div>

</body>
</html>