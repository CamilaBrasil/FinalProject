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
					class="custom-control-input" value="0" checked=""> <label
					class="custom-control-label" for="customRadio1">Jack Skellington</label>
			</div>
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio2" name="quest1"
					class="custom-control-input" value="1"> <label
					class="custom-control-label" for="customRadio2">Donald Duck</label>
			</div>
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio3" name="quest1"
					class="custom-control-input" value="2"> <label
					class="custom-control-label" for="customRadio3">Mickey Mouse</label>
			</div>
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio4" name="quest1"
					class="custom-control-input" value="3"> <label
					class="custom-control-label" for="customRadio4">Young Simba</label>
			</div>
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio5" name="quest1"
					class="custom-control-input" value="4"> <label
					class="custom-control-label" for="customRadio5">Belle</label>
			</div>
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio6" name="quest1"
					class="custom-control-input" value="5"> <label
					class="custom-control-label" for="customRadio6">Snow White</label>
			</div>
		</div>
		
		
		<legend>Favorite Pizza Topping</legend>
		<div class="form-group">
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio7" name="quest2"
					class="custom-control-input" value="6" checked=""> <label
					class="custom-control-label" for="customRadio7">Pepperoni</label>
			</div>
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio8" name="quest2"
					class="custom-control-input" value="7"> <label
					class="custom-control-label" for="customRadio8">Bacon</label>
			</div>
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio9" name="quest2"
					class="custom-control-input" value="8"> <label
					class="custom-control-label" for="customRadio9">Mushrooms</label>
			</div>
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio10" name="quest2"
					class="custom-control-input" value="9"> <label
					class="custom-control-label" for="customRadio10">Anchovies</label>
			</div>
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio11" name="quest2"
					class="custom-control-input" value="10"> <label
					class="custom-control-label" for="customRadio11">Pineapple</label>
			</div>
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio12" name="quest2"
					class="custom-control-input" value="11"> <label
					class="custom-control-label" for="customRadio12">Green Peppers</label>
			</div>
		</div>
		
		
		<legend>Pick A location</legend>
		<div class="form-group">
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio13" name="quest3"
					class="custom-control-input" value="12" checked=""> <label
					class="custom-control-label" for="customRadio13">The Beach</label>
			</div>
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio14" name="quest3"
					class="custom-control-input" value="13"> <label
					class="custom-control-label" for="customRadio14">Mountains</label>
			</div>
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio15" name="quest3"
					class="custom-control-input" value="14"> <label
					class="custom-control-label" for="customRadio15">Forest</label>
			</div>
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio16" name="quest3"
					class="custom-control-input" value="15"> <label
					class="custom-control-label" for="customRadio16">Farm</label>
			</div>
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio17" name="quest3"
					class="custom-control-input" value="16"> <label
					class="custom-control-label" for="customRadio17">Desert</label>
			</div>
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio18" name="quest3"
					class="custom-control-input" value="17"> <label
					class="custom-control-label" for="customRadio18">City</label>
			</div>
		</div>
		
		<button type="submit" class="btn btn-primary">Submit</button>
		</form>

</body>
</html>