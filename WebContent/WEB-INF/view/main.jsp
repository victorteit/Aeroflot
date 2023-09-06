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
		  href="${pageContext.request.contextPath}/resources/css/main.css">
		  	  <style>
html {
    background-image: url(${pageContext.request.contextPath}/resources/images/cloud.webp);
      background-size: cover;
} </style>
    <title>Aeroflot</title>
</head>
<body>
<div class="container">
    <div class="header">
        <img src="${pageContext.request.contextPath}/resources/images/aeroflot-big.jpeg">
    </div>
<div class="title">
    <h1>Welcome to Aeroflot Booking System</h1>
</div>
    <div class="forms">
        <button class="button"><a href="list-passengers">List PAX</a></button>
   
        <button class="button"><a href="passengers/find/Cormode">Find PAX by Last name</a></button>

        <button class="button"><a href="/passengers/find/deleteByID/1">Delete by PAX ID</a></button>

        <button class="button"><a href="/passengers/find/id/"></a></button>
   
        <button class="button"><a href="/passenger/sorted">Sorted by last name</a></button>
 
        <button class="button"><a href="list-passengers"></a></button>
   
        <button class="button"><a href="list-passengers"></a></button>

        <button class="button"><a href="list-passengers"></a></button>
    </div>
    <footer class="footer">
        <p class="footer-text">Copyright© 2023 OJSC "Aeroflot - Russian Airlines" - Moscow Russia</p>
    </footer>
</div>
</body>
</html>