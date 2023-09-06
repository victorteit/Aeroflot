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
		  href="${pageContext.request.contextPath}/resources/css/index.css">
		  <style>	
html {
    background-image: url(${pageContext.request.contextPath}/resources/images/cloud.webp);
      background-size: cover;
         background-repeat: repeat;
} </style>
    <title>Welcome</title>
</head>
<body>

<div class="logo"><img src="${pageContext.request.contextPath}/resources/images/images.png"></div>
<div class="registration">
    <form>
        <h3 class="text-center">Please sign in</h3>
        <div class="form-group">
            <input class="form-control item" type="text" name="username" id="username" placeholder="Login" required>
        </div>
        <div class="form-group">
            <input class="form-control item" type="password" name="Пароль" id="password" placeholder="Password" required>
        </div>
        <div class="form-group">
            <button class="btn btn-primary btn-block create-account" type="submit"><a href="main">ENTER</a></button>
        </div>
    </form>
</div>
</body>
</html>