<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="5">
			<thead>
					<tr>
						<th>RollNo</th>
						<th>Name</th>
						<th>Username</th>
						<th>Password</th>
						<th>Action</th>
					</tr>
			</thead>
			
			<tbody>
				 	
				 		<c:forEach items="${data}" var="s">
				 			<tr>
				 				<td>${s.rollno}</td>
				 			<td>${s.name}</td>
				 			<td>${s.username}</td>
				 			<td>${s.password}</td>
				 			<td><a href="delete?rollno=${s.rollno}">Delete</a> || <a href="edit?rollno=${s.rollno}">Edit</a></td>
				 			</tr>
				 		</c:forEach>
				 		
				 	
			</tbody>
	</table>
</body>
</html>