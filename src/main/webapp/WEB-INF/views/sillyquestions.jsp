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
<form class="form-horizontal" action="/submitquiz" method="POST">
		<legend>Favorite Disney Character</legend>
		<img src="/images/JackSkellington.jpg" alt="Jack Skellington" height="150" width="150">
		
		<div class="form-group">
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio1" name="quest1"
					class="custom-control-input" value="leader" checked=""> <label
					class="custom-control-label" for="customRadio1">Jack Skellington</label>
			</div><br>
					
			
			<img src="/images/donaldduck.png" alt="Donald Duck" height="150" width="150">
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio2" name="quest1"
					class="custom-control-input" value="energetic"> <label
					class="custom-control-label" for="customRadio2">Donald Duck</label>
			</div><br>
					<img src="/images/Mickey_Mouse.png" alt="Mickey Mouse" height="150" width="150">
			
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio3" name="quest1"
					class="custom-control-input" value="people skills"> <label
					class="custom-control-label" for="customRadio3">Mickey Mouse</label>
			</div><br>
					<img src="/images/Cubsimba.png" alt="Young Simba" height="150" width="150">
			
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio4" name="quest1"
					class="custom-control-input" value="focus"> <label
					class="custom-control-label" for="customRadio4">Young Simba</label>
			</div><br>
					<img src="/images/belle.jpg" alt="Belle" height="150" width="150">
			
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio5" name="quest1"
					class="custom-control-input" value="organized"> <label
					class="custom-control-label" for="customRadio5">Belle</label>
			</div><br>
					<img src="/images/snowwhite.jpg" alt="Snow White" height="150" width="150">
			
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio6" name="quest1"
					class="custom-control-input" value="team player"> <label
					class="custom-control-label" for="customRadio6">Snow White</label>
			</div>
		</div><br>
		
		
		<legend>Favorite Pizza Topping</legend>
							<img src="/images/pepperoni.jpg" alt="Pepperoni" height="150" width="150">
		
		<div class="form-group">
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio7" name="quest2"
					class="custom-control-input" value="project management" checked=""> <label
					class="custom-control-label" for="customRadio7">Pepperoni</label>
			</div><br>
								<img src="/images/bacon.jpg" alt="Bacon" height="150" width="150">
			
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio8" name="quest2"
					class="custom-control-input" value="conflict resolution"> <label
					class="custom-control-label" for="customRadio8">Bacon</label>
			</div><br>
								<img src="/images/shrooms.jpg" alt="Shrooms" height="150" width="150">
			
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio9" name="quest2"
					class="custom-control-input" value="troubleshooting"> <label
					class="custom-control-label" for="customRadio9">Mushrooms</label>
			</div><br>
								<img src="/images/anchovy.jpg" alt="Anchovies" height="150" width="150">
			
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio10" name="quest2"
					class="custom-control-input" value="polite"> <label
					class="custom-control-label" for="customRadio10">Anchovies</label>
			</div><br>
								<img src="/images/pineapple.jpeg" alt="Pineapple" height="150" width="150">
			
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio11" name="quest2"
					class="custom-control-input" value="teach smart"> <label
					class="custom-control-label" for="customRadio11">Pineapple</label>
			</div><br>
								<img src="/images/peppers.jpg" alt="Green Peppers" height="150" width="150">
			
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio12" name="quest2"
					class="custom-control-input" value="pressure"> <label
					class="custom-control-label" for="customRadio12">Green Peppers</label>
			</div>
		</div><br>
		
		
		<legend>Pick A location</legend>
					<img src="/images/beach.jpg" alt="Beach" height="150" width="150">
		
		<div class="form-group">
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio13" name="quest3"
					class="custom-control-input" value="reliable" checked=""> <label
					class="custom-control-label" for="customRadio13">The Beach</label>
			</div><br>
					<img src="/images/mountains.jpg" alt="Mountains" height="150" width="150">
			
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio14" name="quest3"
					class="custom-control-input" value="adaptability"> <label
					class="custom-control-label" for="customRadio14">Mountains</label>
			</div><br>
					<img src="/images/forest.jpg" alt="Forest" height="150" width="150">
			
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio15" name="quest3"
					class="custom-control-input" value="problem solving"> <label
					class="custom-control-label" for="customRadio15">Forest</label>
			</div><br>
					<img src="/images/farm.jpg" alt="Farm" height="150" width="150">
			
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio16" name="quest3"
					class="custom-control-input" value="creativity"> <label
					class="custom-control-label" for="customRadio16">Farm</label>
			</div><br>
					<img src="/images/desert.jpg" alt="Desert" height="150" width="150">
			
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio17" name="quest3"
					class="custom-control-input" value="work ethic"> <label
					class="custom-control-label" for="customRadio17">Desert</label>
			</div><br>
					<img src="/images/detroit.jpg" alt="Detroit" height="150" width="150">
			
			<div class="custom-control custom-radio">
				<input type="radio" id="customRadio18" name="quest3"
					class="custom-control-input" value="interpersonal skills"> <label
					class="custom-control-label" for="customRadio18">City</label>
			</div>
		</div>
		
		<button type="submit" class="btn btn-primary">Submit</button>
		</form>

</body>
</html>