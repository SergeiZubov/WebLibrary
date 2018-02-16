<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Start page</title>
</head>
<body>
<form action="FrontController" method="post">
<input type="hidden" name="command" value="loginationPage"></br>

<input type="submit" name="logination" value="Logination"></br></br>
</form>
<form action="FrontController" method="post">
<input type="hidden" name="command" value="registrationPage">
<input type="submit" name="registration" value="Registration">
</form>
</body>
</html>