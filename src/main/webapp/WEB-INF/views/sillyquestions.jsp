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
					class="custom-control-input" value="2"> <label
					class="custom-control-label" for="customRadio5">Belle</label>
			</div>
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio6" name="quest1"
					class="custom-control-input" value="Team Player"> <label
					class="custom-control-label" for="customRadio6">Snow White</label>
			</div>
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
		</form>

</body>
</html>