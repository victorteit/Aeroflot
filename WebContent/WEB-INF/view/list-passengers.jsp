<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/list.css">
		  	  <style>
html {
    background-image: url(${pageContext.request.contextPath}/resources/images/cloud.webp);
      background-size: cover;
         background-repeat: repeat;
} </style>
    <title>List of passengers</title>
</head>
<body>
<div class="container">
<p>
			<a href="${pageContext.request.contextPath}/main">Back</a>
		</p>
    <div><h2>List of all passengers</h2></div>
    <div class="table">
		<table>
				<tr>
					<th>ID pax</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Birthday</th>
					<th>Email</th>
					<th>Gender</th>
					<th>Aeroflot bonus number</th>
					<th>Departure city</th>
					<th>Destination</th>
					<th>Departure Date</th>
					<th>Address</th>
				</tr>
				
				<c:forEach var="temPax" items="${passenger}">
				
		<%-- 		<c:url var="find-pax" value="/customer/showLast_name">
						<c:param name="last_name" value="${passenger.id}" />
					</c:url>	 --%>	
					<tr>
						<td> ${temPax.id_pax} </td>
						<td> ${temPax.first_name} </td>
						<td> ${temPax.last_name} </td>
						<td> ${temPax.birthday} </td>
						<td> ${temPax.email} </td>
						<td> ${temPax.gender} </td>
						<td> ${temPax.member_bonus} </td>
						<td> ${temPax.fromCity} </td>
						<td> ${temPax.toCity} </td>
						<td> ${temPax.departureDate} </td>
						<td><a href="${showLink}">Show address</a></td>
					</tr>
				
				</c:forEach>
			</table>
    </div>
</div>
</body>
</html>