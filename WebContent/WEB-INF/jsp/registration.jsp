<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration page</title>
</head>
<style>
        input[type=password]:invalid {
            border: solid 2px red;
        }
    </style>
    <SCRIPT LANGUAGE="JavaScript">
    <!-- Begin
    function checkPw(form) {
    pw1 = form.password.value;
    pw2 = form.confirmPassword.value;

    if (pw1 != pw2) {
    alert ("\n\"Password\" and \"Confirm Password\" do not match. Plese, try again.\".")
    return false;
    }
    else return true;
    }
    // End -->
    </script>
<body>

<form action="FrontController" method="post" onSubmit="return checkPw(this)">
<input type="hidden" name="command" value="registration">
Enter login:</br>
<input type="text" name="login" value="" placeholder="login"></br>
Enter password:</br>
<input type="password" name =password value="" placeholder="password"></br>
Confirm password:</br>
<input type="password" name =confirmPassword value=""></br>
Enter name:</br>
<input type="text" name="name" value="" placeholder="name"></br>
Enter surname:</br>
<input type="text" name="surname" value="" placeholder="surname"></br>
Enter E-mail:</br>
<input type="text" name="mail" value="" placeholder="E-mail"></br>
Enter phone:</br>
<input type="text" name="phone" value="" placeholder="phone"></br>
<input type="submit" name="sign in" value="submit">
</form>
</body>
</html>