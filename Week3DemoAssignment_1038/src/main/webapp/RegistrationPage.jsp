<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div align="center">
		<h1>Student Register Page</h1>

		<!-- form action ="StudentServlet" method="post"> -->
		<form action="<%=request.getContextPath()%>/StudentServlet"
			method="post">
			<table style="width: 80%">
				<tr>
					<td>First Name</td>
					<td><input type="text" name="firstname" maxlength=50 required /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lastname" /></td>
				</tr>
				<tr>
					<td>UserName</td>
					<td><input type="text" name="grade" /></td>
				</tr>
				
				<tr>
				<td>PhoneNo</td>
				<td> 
				<input type="text" pattern="[1-9]{1}-[0-9]{2}-[0-9]{3}-[0-9]{4}"/> 
				</td>​​
				</tr>	
					
			</table>
			<input type="submit" value="Submit" />
		</form>
	</div>

</body>
</html>