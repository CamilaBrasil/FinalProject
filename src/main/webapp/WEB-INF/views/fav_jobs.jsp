<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
			
				<li class="nav-item"><a class="nav-link" href="">Log Out</a></li>
			</ul>
		</div>
	</nav>

	<table class="table table-hover">
		<thead>
			<tr>
				<!-- <th scope="col">Job Title</th>
				<th scope="col">URL</th>
				<th scope="col">Description</th>
				<th scope="col">Location</th> -->
			</tr>
		</thead>

		<tbody>
			<c:forEach var="j" items="${jobs}">
				<tr class="table-active">
				<tr class="table-primary">
					<td>${j.jobTitle}</td>
				</tr>
			</c:forEach>
			<!-- 		<tr>
					<th scope="row">Default</th>
					<td>Column content</td>
					<td>Column content</td>
					<td>Column content</td>
				</tr>
				<tr class="table-primary">
					<th scope="row">Primary</th>
					<td>Column content</td>
					<td>Column content</td>
					<td>Column content</td>
				</tr>
				<tr class="table-secondary">
					<th scope="row">Secondary</th>
					<td>Column content</td>
					<td>Column content</td>
					<td>Column content</td>
				</tr>
				<tr class="table-success">
					<th scope="row">Success</th>
					<td>Column content</td>
					<td>Column content</td>
					<td>Column content</td>
				</tr>
				<tr class="table-danger">
					<th scope="row">Danger</th>
					<td>Column content</td>
					<td>Column content</td>
					<td>Column content</td>
				</tr>
				<tr class="table-warning">
					<th scope="row">Warning</th>
					<td>Column content</td>
					<td>Column content</td>
					<td>Column content</td>
				</tr>
				<tr class="table-info">
					<th scope="row">Info</th>
					<td>Column content</td>
					<td>Column content</td>
					<td>Column content</td>
				</tr>
				<tr class="table-light">
					<th scope="row">Light</th>
					<td>Column content</td>
					<td>Column content</td>
					<td>Column content</td>
				</tr>
				<tr class="table-dark">
					<th scope="row">Dark</th>
					<td>Column content</td>
					<td>Column content</td>
					<td>Column content</td>
				</tr> -->
		</tbody>
	</table>

</body>
</html>