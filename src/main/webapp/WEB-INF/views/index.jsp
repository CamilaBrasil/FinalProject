<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css" />
</head>
<body>
			<h1>Job Search</h1>

${email}
${firstname}
${lastname}
${zipcode}
${password}

	<form = action= "/submitlogin" > 
Log In <br> <input = type= "text" name = "email" placeholder="email" />
	   		<input =  type = "text" name ="password" placeholder= "passwkrd"/><br>
	   		<input = type = "submit"  value= "Log In"><br>
	   		</form><br>
	  <a href= "">Register Here</a>
	  
	  
<br>
		


</body>
</html>