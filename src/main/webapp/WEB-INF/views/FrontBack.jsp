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
<h3>FrontBack</h3>

${quiz.skills}
		<form class="form-horizontal" action="/frontback" method="POST">
			<fieldset>
				<div id="legend">
					<legend class="">Login</legend>
				</div>
				<div class="control-group">
					<label class="control-label" for="front">Are you Front End?</label>
					<div class="controls">
						<input type="text" id="frontEnd" name="frontEnd" placeholder=""
							class="input-xlarge">
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="back">Are you Back End</label>
					<div class="controls">
						<input type="text" id="backEnd" name="backEnd"
							placeholder="" class="input-xlarge">
				</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<button class="btn btn-info">Submit</button>
					</div>
				</div>
			</fieldset>
		</form>
</body>
</html>