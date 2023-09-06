<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		      <link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/main.css">
		  <style>
		  html {
    background-image: url(${pageContext.request.contextPath}/resources/images/cloud.webp);
      background-size: cover;
         background-repeat: repeat;
} </style>
    <title>Aeroflot</title>
</head>
<body>
<div class="container">
    <div class="header">
        <img src="${pageContext.request.contextPath}/resources/images/aeroflot-big.jpeg">
    </div>
    <p>
			<a href="${pageContext.request.contextPath}/main">Back</a>
		</p>
    	<h2>Passengers sorted by last name: </h2>
    	
    	<table>
				<tr>
					<th>ID passenger</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Birthday</th>
					<th>Email</th>
					<th>Phone</th>
					<th>Gender</th>
					<th>Member bonus number</th>
					<th>Address</th>
				</tr>
					<tr>
						<td> ${passenger.id_pax} </td>
						<td> ${passenger.first_name} </td>
						<td> ${passenger.last_name} </td>
						<td> ${passenger.birthday} </td>
						<td> ${passenger.email} </td>
						<td> ${passenger.phone} </td>
						<td> ${passenger.gender} </td>
						<td> ${passenger.member_bonus} </td>
					</tr>
				
			</table>
    
</div>
</body>
</html>
