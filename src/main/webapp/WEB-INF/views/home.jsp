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
				<li class="nav-item"><a class="nav-link" href="/home">Home</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/jobs/${user.user_id}">Find Jobs</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/favorites">Matches</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/about">About</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/contact">Contact</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="">Log
						Out</a></li>
			</ul>

		</div>
	</nav>

	<div class="jumbotron">
		<h1 class="display-3">Welcome, ${user.firstname} ${user.lastname}</h1>

		<p class="lead">Pudding ice cream sweet roll caramels wafer
			topping marzipan caramels. Sugar plum biscuit tart gummi bears
			gummies. Marzipan tart brownie. Topping jelly cake macaroon candy
			canes sweet. Cookie cupcake cheesecake sesame snaps cotton candy.
			Gingerbread tart macaroon jelly croissant sugar plum. Sugar plum
			pudding pudding candy powder topping cupcake gingerbread powder. Cake
			fruitcake candy sweet tart sweet roll apple pie. Danish gummi bears
			oat cake topping toffee sweet. Tart dessert croissant powder cake oat
			cake ice cream. Wafer marshmallow donut jujubes pie sugar plum
			biscuit icing. Ice cream pie danish liquorice bonbon dessert
			cheesecake chocolate. Gingerbread dragée lollipop croissant toffee
			biscuit tootsie roll. Halvah fruitcake gummies jelly beans. Ice cream
			cake jelly-o icing danish tootsie roll carrot cake oat cake pie.
			Tootsie roll bear claw icing marzipan.</p>
		<hr class="my-4">
		<p>Croissant chocolate bar cake muffin oat cake pudding gummi
			bears oat cake dessert. Brownie jelly beans lemon drops marshmallow
			macaroon jujubes sweet.</p>
		<p class="lead">
			<a class="btn btn-info btn-lg" href="/about" role="button">Learn more</a>
		</p>
	</div>
</body>
</html>