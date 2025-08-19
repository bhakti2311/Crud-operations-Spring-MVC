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
				background-color: green;
				text-align: center;
				height: 300px;
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
	<form action="save" id="form">
		<h1>Register Page</h1>
		Rollno : <input type="text" name="rollno" class ="a"><br><br>
		Name : <input type="text" name="name" class ="a"><br><br>
		Username : <input type="text" name="username" class ="a"><br><br>
		Password : <input type="text" name="password" class ="a"> <br><br>
		<input type="submit" value="SAVE" id="button">
		
		
	</form>
</body>
</html>