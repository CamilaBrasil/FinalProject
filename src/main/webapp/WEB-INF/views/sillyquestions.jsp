<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://bootswatch.com/4/united/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
			<li class="nav-item"><a class="nav-link" href="/home">home</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/job_results">Find Jobs</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/favorites">Matches</a>
				</li>
				
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="text" placeholder="Search">
				<button class="btn btn-info my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav>

	<div style="padding: 5%">
		${email}
		<h2>Welcome, ${user.firstname }! Quiz time!!</h2>
		${test}
		<form class="form-horizontal" action="/submitquiz" method="POST">
			<legend>Favorite Disney Character</legend>
			<div class="form-group">
				<div class="custom-control custom-radio">
					<input type="radio" id="customRadio1" name="quest1"
						class="custom-control-input" value="leader" checked=""> <label
						class="custom-control-label" for="customRadio1">Jack
						Skellington</label>
				</div>
				<div class="custom-control custom-radio">
					<input type="radio" id="customRadio2" name="quest1"
						class="custom-control-input" value="energetic"> <label
						class="custom-control-label" for="customRadio2">Donald
						Duck</label>
				</div>
				<div class="custom-control custom-radio">
					<input type="radio" id="customRadio3" name="quest1"
						class="custom-control-input" value="people skills"> <label
						class="custom-control-label" for="customRadio3">Mickey
						Mouse</label>
				</div>
				<div class="custom-control custom-radio">
					<input type="radio" id="customRadio4" name="quest1"
						class="custom-control-input" value="focus"> <label
						class="custom-control-label" for="customRadio4">Young
						Simba</label>
				</div>
				<div class="custom-control custom-radio">
					<input type="radio" id="customRadio5" name="quest1"
						class="custom-control-input" value="organized"> <label
						class="custom-control-label" for="customRadio5">Belle</label>
				</div>
				<div class="custom-control custom-radio">
					<input type="radio" id="customRadio6" name="quest1"
						class="custom-control-input" value="team player"> <label
						class="custom-control-label" for="customRadio6">Snow White</label>
				</div>
			</div>


			<legend>Favorite Pizza Topping</legend>
			<div class="form-group">
				<div class="custom-control custom-radio">
					<input type="radio" id="customRadio7" name="quest2"
						class="custom-control-input" value="project management" checked="">
					<label class="custom-control-label" for="customRadio7">Pepperoni</label>
				</div>
				<div class="custom-control custom-radio">
					<input type="radio" id="customRadio8" name="quest2"
						class="custom-control-input" value="conflict resolution">
					<label class="custom-control-label" for="customRadio8">Bacon</label>
				</div>
				<div class="custom-control custom-radio">
					<input type="radio" id="customRadio9" name="quest2"
						class="custom-control-input" value="troubleshooting"> <label
						class="custom-control-label" for="customRadio9">Mushrooms</label>
				</div>
				<div class="custom-control custom-radio">
					<input type="radio" id="customRadio10" name="quest2"
						class="custom-control-input" value="polite"> <label
						class="custom-control-label" for="customRadio10">Anchovies</label>
				</div>
				<div class="custom-control custom-radio">
					<input type="radio" id="customRadio11" name="quest2"
						class="custom-control-input" value="teach smart"> <label
						class="custom-control-label" for="customRadio11">Pineapple</label>
				</div>
				<div class="custom-control custom-radio">
					<input type="radio" id="customRadio12" name="quest2"
						class="custom-control-input" value="pressure"> <label
						class="custom-control-label" for="customRadio12">Green
						Peppers</label>
				</div>
			</div>


			<legend>Pick A location</legend>
			<div class="form-group">
				<div class="custom-control custom-radio">
					<input type="radio" id="customRadio13" name="quest3"
						class="custom-control-input" value="reliable" checked="">
					<label class="custom-control-label" for="customRadio13">The
						Beach</label>
				</div>
				<div class="custom-control custom-radio">
					<input type="radio" id="customRadio14" name="quest3"
						class="custom-control-input" value="adaptability"> <label
						class="custom-control-label" for="customRadio14">Mountains</label>
				</div>
				<div class="custom-control custom-radio">
					<input type="radio" id="customRadio15" name="quest3"
						class="custom-control-input" value="problem solving"> <label
						class="custom-control-label" for="customRadio15">Forest</label>
				</div>
				<div class="custom-control custom-radio">
					<input type="radio" id="customRadio16" name="quest3"
						class="custom-control-input" value="creativity"> <label
						class="custom-control-label" for="customRadio16">Farm</label>
				</div>
				<div class="custom-control custom-radio">
					<input type="radio" id="customRadio17" name="quest3"
						class="custom-control-input" value="work ethic"> <label
						class="custom-control-label" for="customRadio17">Desert</label>
				</div>
				<div class="custom-control custom-radio">
					<input type="radio" id="customRadio18" name="quest3"
						class="custom-control-input" value="interpersonal skills">
					<label class="custom-control-label" for="customRadio18">City</label>
				</div>
			</div>

			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>

</body>
</html>