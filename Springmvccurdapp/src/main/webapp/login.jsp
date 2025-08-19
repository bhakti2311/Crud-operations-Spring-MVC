<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
	<style type="text/css">
			#form{
				border: 5px solid black;
				border-radius: 5px;
				width: 400px;
				background-color: red;
				text-align: center;
				height: 250px;
			}
			
			.a{
				border-radius: 5px;
			width: 200px;
			height: 20px;
			}
			
			#button{
			height: 30px;
			width: 80px;
			border-radius: 10px;
			
		}
	</style>
</head>
<body>
	<form action="log" id="form">
		<h1>Login Page</h1>
		Username : <input type="text" name="username" class ="a"><br><br>
		Password : <input type="text" name="password" class ="a"> <br><br>
		<input type="submit" value="Login" id="button"><br><br>
		
		<a href="openreg">Register Here</a>
	</form>
</body>
</html>