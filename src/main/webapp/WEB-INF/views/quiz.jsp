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
		<h2>Welcome, ${user.firstname }! Quiz time!!</h2>


		<form class="form-horizontal" action="/submitquiz" method="POST">
			<fieldset>

<!-- YEARS_EXP -->
				<legend>Years of experience</legend>
				<div class="form-group">
					<div class="custom-control custom-radio">
						<input type="radio" id="customRadio1" name="yearsExp"
							class="custom-control-input" value="0" checked=""> <label
							class="custom-control-label" for="customRadio1">0 years</label>
					</div>
					<div class="custom-control custom-radio">
						<input type="radio" id="customRadio2" name="yearsExp"
							class="custom-control-input" value="1"> <label
							class="custom-control-label" for="customRadio2">>= 1</label>
					</div>
					<div class="custom-control custom-radio">
						<input type="radio" id="customRadio3" name="yearsExp"
							class="custom-control-input" value="2"> <label
							class="custom-control-label" for="customRadio3">>= 2</label>
					</div>
					<div class="custom-control custom-radio">
						<input type="radio" id="customRadio4" name="yearsExp"
							class="custom-control-input" value="3"> <label
							class="custom-control-label" for="customRadio4">>= 3</label>
					</div>
					<div class="custom-control custom-radio">
						<input type="radio" id="customRadio5" name="yearsExp"
							class="custom-control-input" value="4"> <label
							class="custom-control-label" for="customRadio5">>= 4</label>
					</div>
					<div class="custom-control custom-radio">
						<input type="radio" id="customRadio6" name="yearsExp"
							class="custom-control-input" value="A lot"> <label
							class="custom-control-label" for="customRadio6">Many many
							years</label>
					</div>
				</div>
<!-- EDUCATION -->
				<legend>Education Level</legend>
				<div class="form-group">
					<div class="custom-control custom-radio">
						<input type="radio" id="customRadio7" name="education"
							class="custom-control-input" value="High school"  checked=""> <label
							class="custom-control-label" for="customRadio7">High
							school</label>
					</div>
					<div class="custom-control custom-radio">
						<input type="radio" id="customRadio8" name="education"
							class="custom-control-input" value="Some college no degree">
						<label class="custom-control-label" for="customRadio8">Some
							college, no degree</label>
					</div>
					<div class="custom-control custom-radio">
						<input type="radio" id="customRadio9" name="education"
							class="custom-control-input" value="Technical diploma"> <label
							class="custom-control-label" for="customRadio9">Two-year
							technical diploma</label>
					</div>
					<div class="custom-control custom-radio">
						<input type="radio" id="customRadio10" name="education"
							class="custom-control-input" value="Associate degree"> <label
							class="custom-control-label" for="customRadio10">Two-year
							associate degree</label>
					</div>
					<div class="custom-control custom-radio">
						<input type="radio" id="customRadio11" name="education"
							class="custom-control-input" value="Bachelor's degree"> <label
							class="custom-control-label" for="customRadio11">Bachelor’s
							degree</label>
					</div>
					<div class="custom-control custom-radio">
						<input type="radio" id="customRadio12" name="education"
							class="custom-control-input" value="College degree"> <label
							class="custom-control-label" for="customRadio12">Graduate
							college degree</label>
					</div>
				</div>
<!-- SKILLS -->
				<legend>Skills</legend>
				<div class="form-group">
					<div class="custom-control custom-checkbox">
						<input type="checkbox" class="custom-control-input"
							id="customCheck1" name="skills" value="aaa"> <label
							class="custom-control-label" for="customCheck1">Software
							development</label>
					</div>
					<div class="custom-control custom-checkbox">
						<input type="checkbox" class="custom-control-input"
							id="customCheck2" name="skills" value="aaa"><label
							class="custom-control-label" for="customCheck2">HTML</label>
					</div>
					<div class="custom-control custom-checkbox">
						<input type="checkbox" class="custom-control-input"
							id="customCheck3" name="skills" value="aaa"> <label
							class="custom-control-label" for="customCheck3">CSS</label>
					</div>
					<div class="custom-control custom-checkbox">
						<input type="checkbox" class="custom-control-input"
							id="customCheck4" name="skills" value="HTML"><label
							class="custom-control-label" for="customCheck4">JavaScript</label>
					</div>
					<div class="custom-control custom-checkbox">
						<input type="checkbox" class="custom-control-input"
							id="customCheck5" name="skills" value=""> <label
							class="custom-control-label" for="customCheck5">Java</label>
					</div>
					<div class="custom-control custom-checkbox">
						<input type="checkbox" class="custom-control-input"
							id="customCheck6" name="skills" value="HTML"><label
							class="custom-control-label" for="customCheck6">Wordpress</label>
					</div>
					<div class="custom-control custom-checkbox">
						<input type="checkbox" class="custom-control-input"
							id="customCheck7" name="skills" value="HTML"><label
							class="custom-control-label" for="customCheck7">JavaScript</label>
					</div>
					<div class="custom-control custom-checkbox">
						<input type="checkbox" class="custom-control-input"
							id="customCheck8" name="skills" value=""> <label
							class="custom-control-label" for="customCheck8">Android
							Development</label>
					</div>
					<div class="custom-control custom-checkbox">
						<input type="checkbox" class="custom-control-input"
							id="customCheck9" name="skills" value=""><label
							class="custom-control-label" for="customCheck9">iOS
							Development</label>
					</div>
					<div class="custom-control custom-checkbox">
						<input type="checkbox" class="custom-control-input"
							id="customCheck10" name="skills" value="HTML"><label
							class="custom-control-label" for="customCheck10">PHP</label>
					</div>
					<div class="custom-control custom-checkbox">
						<input type="checkbox" class="custom-control-input"
							id="customCheck11" name="skills" value="HTML"><label
							class="custom-control-label" for="customCheck11">SQL
							Databases</label>
					</div>
					<div class="custom-control custom-checkbox">
						<input type="checkbox" class="custom-control-input"
							id="customCheck12" name="skills" value=""> <label
							class="custom-control-label" for="customCheck12">C++</label>
					</div>
					<div class="custom-control custom-checkbox">
						<input type="checkbox" class="custom-control-input"
							id="customCheck13" name="skills" value="HTML"><label
							class="custom-control-label" for="customCheck13">Web
							design</label>
					</div>
					<div class="custom-control custom-checkbox">
						<input type="checkbox" class="custom-control-input"
							id="customCheck14" name="skills" value="HTML"><label
							class="custom-control-label" for="customCheck14">Angular</label>
					</div>
					<div class="custom-control custom-checkbox">
						<input type="checkbox" class="custom-control-input"
							id="customCheck15" name="skills" value=""> <label
							class="custom-control-label" for="customCheck15">React</label>
					</div>
					<div class="custom-control custom-checkbox">
						<input type="checkbox" class="custom-control-input"
							id="customCheck16" name="skills" value="HTML"><label
							class="custom-control-label" for="customCheck16">Written
							communication</label>
					</div>
					<div class="custom-control custom-checkbox">
						<input type="checkbox" class="custom-control-input"
							id="customCheck17" name="skills" value="HTML"><label
							class="custom-control-label" for="customCheck17">Verbal
							communication</label>
					</div>
				</div>
<!-- TYPE -->
				<legend>Type</legend>
				<div class="form-group">
					<div class="custom-control custom-radio">
						<input type="radio" id="customRadio13" name="type"
							class="custom-control-input" value="Part time"  checked=""> <label
							class="custom-control-label" for="customRadio13">Part time</label>
					</div>
					<div class="custom-control custom-radio">
						<input type="radio" id="customRadio14" name="type"
							class="custom-control-input" value="Full time"> <label
							class="custom-control-label" for="customRadio14">Full time</label>
					</div>
				</div>
<!-- SIZE -->
				<legend>Company size</legend>
				<div class="form-group">
					<div class="custom-control custom-radio">
						<input type="radio" id="customRadio15" name="size"
							class="custom-control-input" value="Small"  checked=""> <label
							class="custom-control-label" for="customRadio15">Small</label>
					</div>
					<div class="custom-control custom-radio">
						<input type="radio" id="customRadio16" name="size"
							class="custom-control-input" value="Medium"> <label
							class="custom-control-label" for="customRadio16">Medium</label>
					</div>
					<div class="custom-control custom-radio">
						<input type="radio" id="customRadio17" name="size"
							class="custom-control-input" value="Medium"> <label
							class="custom-control-label" for="customRadio17">Medium</label>
					</div>
				</div>
<!-- LOCATION -->
				<legend>Location</legend>
				<div class="form-group">
					<div class="custom-control custom-radio">
						<input type="radio" id="customRadio18" name="location"
							class="custom-control-input" value="Metro Detroit"  checked=""> <label
							class="custom-control-label" for="customRadio18">Metro Detroit</label>
					</div>
					<div class="custom-control custom-radio">
						<input type="radio" id="customRadio19" name="location"
							class="custom-control-input" value="Ann Arbor"> <label
							class="custom-control-label" for="customRadio19">Ann Arbor</label>
					</div>
					<div class="custom-control custom-radio">
						<input type="radio" id="customRadio20" name="location"
							class="custom-control-input" value="All"> <label
							class="custom-control-label" for="customRadio20">All</label>
					</div>
				</div>

<!-- 				<div class="form-group">
					<select class="custom-select">
						<option selected="">Open this select menu</option>
						<option value="1">One</option>
						<option value="2">Two</option>
						<option value="3">Three</option>
					</select>
				</div> 
				 -->


			</fieldset>
			<input type="hidden" name="userid" value="${user.id }">
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
		
	</div>
</body>
</html>