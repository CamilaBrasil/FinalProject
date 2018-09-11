<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://bootswatch.com/4/united/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
		<a class="navbar-brand" href="/index">Home</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarColor01" aria-controls="navbarColor01"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarColor01">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link" href="/">Find Jobs</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/favorites">Matches</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/about">About</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/contact">Contact</a>
				</li>
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="text" placeholder="Search">
				<button class="btn btn-info my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav>

	<div style="padding: 5%">
		<form>
			<fieldset>
				<legend>Welcome, ${firstname }! Quiz time!!</legend>
				<div class="form-group">
					<div class="custom-control custom-radio">
						<input type="radio" id="customRadio1" name="customRadio"
							class="custom-control-input" checked=""> <label
							class="custom-control-label" for="customRadio1">Toggle
							this custom radio</label>
					</div>
					<div class="custom-control custom-radio">
						<input type="radio" id="customRadio2" name="customRadio"
							class="custom-control-input"> <label
							class="custom-control-label" for="customRadio2">Or toggle
							this other custom radio</label>
					</div>
					<div class="custom-control custom-radio">
						<input type="radio" id="customRadio3" name="customRadio"
							class="custom-control-input" disabled=""> <label
							class="custom-control-label" for="customRadio3">Disabled
							custom radio</label>
					</div>
				</div>
				<div class="form-group">
					<div class="custom-control custom-checkbox">
						<input type="checkbox" class="custom-control-input"
							id="customCheck1" checked=""> <label
							class="custom-control-label" for="customCheck1">Check
							this custom checkbox</label>
					</div>
					<div class="custom-control custom-checkbox">
						<input type="checkbox" class="custom-control-input"
							id="customCheck2" disabled=""> <label
							class="custom-control-label" for="customCheck2">Disabled
							custom checkbox</label>
					</div>
				</div>
				<div class="form-group">
					<select class="custom-select">
						<option selected="">Open this select menu</option>
						<option value="1">One</option>
						<option value="2">Two</option>
						<option value="3">Three</option>
					</select>
				</div>
			</fieldset>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</body>
</html>