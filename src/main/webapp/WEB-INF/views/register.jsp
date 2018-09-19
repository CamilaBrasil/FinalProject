<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register form</title>
<link href="https://bootswatch.com/4/united/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link rel="icon" 
      type="image/png" 
      href="/images/favicon.png">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
		<a class="navbar-brand" href="/"><img alt="tintech" src="/images/IMG_1877.png" height="50" width="150"></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarColor01" aria-controls="navbarColor01"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarColor01">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link" href="/login">Login</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="register">Register</a>
				</li>
				
			</ul>
			
		</div>
	</nav>




	<div style="padding: 5%">
		<h2>${title }</h2>
		<form class="form-horizontal" action="/submit" method="POST">
			<fieldset>
				<div id="legend">
					<legend class="">Register</legend>
				</div>
				<div class="control-group">
					<label class="control-label">First Name</label>
					<div class="controls">
						<input type="text" id="firstname" name="firstname"
							placeholder="First Name" class="input-xlarge">
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="lastname">Last Name</label>
					<div class="controls">
						<input type="text" id="lastname" name="lastname"
							placeholder="Last Name" class="input-xlarge">
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="email">E-mail</label>
					<div class="controls">
						<input type="email" id="email" name="email" placeholder="email"
							class="input-xlarge" required>
					</div>
				</div>

				<div class="control-group">
					<label class="control-label" for="zipcode">Zipcode</label>
					<div class="controls">
						<input type="text" id="zipcode" name="zipcode"
							placeholder="zipcode" class="input-xlarge">
					</div>
				</div>

				<div class="control-group">
					<label class="control-label" for="password">Password</label>
					<div class="controls">
						<input type="password" id="password" name="password"
							placeholder="password" class="input-xlarge" required>
					</div>
				</div>

				<div class="control-group">
					<label class="control-label" for="password_confirm">Password
						(Confirm)</label>
					<div class="controls">
						<input type="password" id="password_confirm"
							name="password_confirm" placeholder="password"
							class="input-xlarge" required>
					</div>
				</div>

				<div class="control-group">
					<div class="controls">
						<input type="submit" class="btn btn-info" value="Register">
					</div>
				</div>
			</fieldset>
		</form>
	</div>

</body>
</html>