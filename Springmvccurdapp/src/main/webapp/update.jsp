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
	<form action="update" id="form">
		<h1>update Page</h1>
		Rollno : <input type="text" name="rollno" class ="a" value="${stu.rollno}"><br><br>
		Name : <input type="text" name="name" class ="a" value="${stu.name}"><br><br>
		Username : <input type="text" name="username" class ="a" value="${stu.username}"><br><br>
		Password : <input type="text" name="password" class ="a" value="${stu.password}"> <br><br>
		<input type="submit" value="update" id="button">
		
		
	</form>
</body>
</html>