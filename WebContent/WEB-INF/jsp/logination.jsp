<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Logination page</title>
</head>
<body>
<form action="FrontController" method="post">
<input type="hidden" name="command" value="logination">
login:<br/>
<input type="text" name="login" value="" placeholder="Login"/><br/>
password:<br/>
<input type="password" name="password" value="" placeholder="Password"/><br/>
<input type="submit" name="sign in" value="sign in">
</form>
</body>
</html>