<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Showing the jobs searched</title>
<link href="https://bootswatch.com/4/united/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
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
				<li class="nav-item"><a class="nav-link" href="/findJobs">Find
						Jobs</a></li>
				<li class="nav-item"><a class="nav-link" href="/favorites">Saved
						Jobs</a></li>

				<li class="nav-item"><a class="nav-link" href="/logout">Log Out</a></li>
			</ul>
		</div>
	</nav>


	<div style="padding: 5%">
	<h2>Welcome, ${user.firstname}</h2>
		<h3>Here are your job matches!</h3>

		<table class="table table-hover">
			<thead>
				<tr>
					<th scope="col">Match %</th>
					<th scope="col">Title</th>
					<th scope="col">Apply</th>
					<th scope="col">Save</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="j" items="${jobs}" varStatus="count">

					<tr class="table-primary">
						<td>${j.keywords}</td>
						<td>${j.jobTitle}</td>
						<td><a href="${j.joburl}" target="_blank">Application</a></td>
						<td><a href="/savejob/${j.jobTitle}"><button
									class="btn btn-light btn-sm">Save</button></a></td>
					</tr>
				</c:forEach>
		</table>
	</div>
</body>
</html>