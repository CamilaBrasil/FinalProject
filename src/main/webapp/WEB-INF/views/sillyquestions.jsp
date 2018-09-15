<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/spacelab/bootstrap.min.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	${test}
<form class="form-horizontal" action="/submitsillyq" method="POST">
		<legend>Favorite Disney Character</legend>
		<div class="form-group">
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio1" name="quest1"
					class="custom-control-input" value="Leader" checked=""> <label
					class="custom-control-label" for="customRadio1">Jack Skellington</label>
			</div>
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio2" name="quest1"
					class="custom-control-input" value="Energetic"> <label
					class="custom-control-label" for="customRadio2">Donald Duck</label>
			</div>
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio3" name="quest1"
					class="custom-control-input" value="People Skills"> <label
					class="custom-control-label" for="customRadio3">Mickey Mouse</label>
			</div>
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio4" name="quest1"
					class="custom-control-input" value="Focus"> <label
					class="custom-control-label" for="customRadio4">Young Simba</label>
			</div>
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio5" name="quest1"
					class="custom-control-input" value="Organized"> <label
					class="custom-control-label" for="customRadio5">Belle</label>
			</div>
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio6" name="quest1"
					class="custom-control-input" value="Team Player"> <label
					class="custom-control-label" for="customRadio6">Snow White</label>
			</div>
		</div>
		
		
		<legend>Favorite Pizza Topping</legend>
		<div class="form-group">
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio7" name="quest2"
					class="custom-control-input" value="Project Management" checked=""> <label
					class="custom-control-label" for="customRadio7">Pepperoni</label>
			</div>
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio8" name="quest2"
					class="custom-control-input" value="Team Work"> <label
					class="custom-control-label" for="customRadio8">Bacon</label>
			</div>
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio9" name="quest2"
					class="custom-control-input" value="Trouble Shooting"> <label
					class="custom-control-label" for="customRadio9">Mushrooms</label>
			</div>
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio10" name="quest2"
					class="custom-control-input" value="Polite"> <label
					class="custom-control-label" for="customRadio10">Anchovies</label>
			</div>
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio11" name="quest2"
					class="custom-control-input" value="Tech Smart"> <label
					class="custom-control-label" for="customRadio11">Pineapple</label>
			</div>
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio12" name="quest2"
					class="custom-control-input" value="Pressure"> <label
					class="custom-control-label" for="customRadio12">Green Peppers</label>
			</div>
		</div>
		
		
		<legend>Pick A location</legend>
		<div class="form-group">
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio13" name="quest3"
					class="custom-control-input" value="Startup" checked=""> <label
					class="custom-control-label" for="customRadio13">The Beach</label>
			</div>
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio14" name="quest3"
					class="custom-control-input" value="Adaptability"> <label
					class="custom-control-label" for="customRadio14">Mountains</label>
			</div>
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio15" name="quest3"
					class="custom-control-input" value="Problem Solving"> <label
					class="custom-control-label" for="customRadio15">Forest</label>
			</div>
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio16" name="quest3"
					class="custom-control-input" value="Leadership"> <label
					class="custom-control-label" for="customRadio16">Farm</label>
			</div>
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio17" name="quest3"
					class="custom-control-input" value="Tech Savvy"> <label
					class="custom-control-label" for="customRadio17">Desert</label>
			</div>
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio18" name="quest3"
					class="custom-control-input" value="Communication"> <label
					class="custom-control-label" for="customRadio18">City</label>
			</div>
		</div>
		
		<button type="submit" class="btn btn-primary">Submit</button>
		</form>

</body>
</html>