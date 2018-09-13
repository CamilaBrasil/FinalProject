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
				<li class="nav-item"><a class="nav-link" href="/home">Home</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/job_results">Find Jobs</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/favorites">Matches</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/about">About</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/contact">Contact</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/login">Log
						Out</a></li>
			</ul>
			

	<table class="table table-hover">
		<thead>
			<tr>
				<th scope="col">Job Title</th>
				<th scope="col">URL</th>
				<th scope="col">Description</th>
				<th scope="col">Location</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach var="j" items="${jobs}">
				<tr class="table-susse">
				<tr class="table-primary">
					<td>${j.jobTitle}</td>
					<td>${j.joburl}</td>
					<td>${j.description}</td>
					<td>${j.location}</td>
				</tr>
			</c:forEach>
</table> 

</body>
</html>