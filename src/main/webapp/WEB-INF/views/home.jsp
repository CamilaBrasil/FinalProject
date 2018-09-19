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
				<li class="nav-item"><a class="nav-link" href="/home">Home</a>
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
		<h1 class="display-3">Hello ${user.firstname} ${user.lastname}!</h1>
		<br>
		<br><h1>Welcome to TinTech!</h1><br>

		<p class="lead">Did you know that your favorite pizza topping
			can help determine what your next job will be? Job searching in the
			21st century can be stressful and time consuming. In many ways,
			looking for a job can be a job itself. One of the main hitches in the
			modern job search process is online job search engines that ask you a
			million questions and still give you a list of jobs that have no
			relevance to the kind of job you’re looking for or who you are as a
			candidate. TinTech is a web app that gives tech job seekers a quick,
			fun way of finding jobs that are relevant to them. The name “TinTech”
			is a play on the dating app “Tinder” because TinTech uses a similar
			strategy to dating apps that match people with potential mates based
			on their answers to personality-based questions. A user registers on
			TinTech and selects their top three technical skills, they then take
			a short, multiple choice, BuzzFeed-esque, personality quiz which has
			a soft skill keyword attached to each answer. Using an algorithm that
			matches those keywords to job descriptions from the Authentic Jobs,
			USAJobs, and GitHub Jobs APIs, TinTech then displays a list of
			matching jobs and a percentage showing the relevance of each job
			based on how many times the given keywords appear in the job
			description. The user can then click a link which will take them to
			the job application and save jobs so they can come back to them
			later. TinTech helps tech job seekers save time on the job search by
			matching them with jobs based on both hard and soft skills. Tell us
			your favorite pizza topping, find your dream tech job, and work your
			best life!</p>
		<hr class="my-4">
		
			
		</p>
	</div>
</body>
</html>