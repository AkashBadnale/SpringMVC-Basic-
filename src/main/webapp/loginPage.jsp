<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <form id="logInForm" action="userLogin" method="post">
             USERNAME :  &nbsp; <input name="uname" value="" type="text"><br/><br/>
             PASSWORD :  &nbsp; <input name="pwd" value="" type="text"><br/><br/>
     <button id="logInSubmitButton" type="submit">LogIN</button>
</form>
<p>New  User  Register first</p>
<a href=registerPage.jsp >Register</a>
    
</body>
</html>