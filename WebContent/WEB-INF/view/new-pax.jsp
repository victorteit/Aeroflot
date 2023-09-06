<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/main.css">
    <title>Aeroflot</title>
</head>
<body>

				<div id="wrapper">
		<div id="header">
			<h2>Customer Management</h2>
		</div>
	</div>
<div id="container">

		<h3>New passenger</h3>
		<form:form action="save" modelAttribute="passenger" method="POST">
		<form:hidden path="id" />
				
					<table>
						<tbody>
					<tr>
						<td><label>First name:</label></td>
						<td><form:input path="first_name" /></td>
					</tr>
				
					<tr>
						<td><label>Last name:</label></td>
						<td><form:input path="last_name" /></td>
					</tr>
					<tr>
						<td><label>Birthday:</label></td>
						<td><form:input path="birthday" /></td>
					</tr>
					
					
					<tr>
						<td><label>Email:</label></td>
						<td><form:input path="email" /></td>
					</tr>
					<tr>
						<td><label>Phone:</label></td>
						<td><form:input path="phone" /></td>
					</tr>
					<tr>
						<td><label>Gender:</label></td>
						<td><form:input path="gender" /></td>
					</tr>
					
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>
						</tbody>
			</table>
			</form:form>
		<div style="clear; both;"></div>
		
			<p>
			<a href="${pageContext.request.contextPath}/customer/list">Back to List</a>
		</p>
	
	</div>
				

	

</body>
</html>

