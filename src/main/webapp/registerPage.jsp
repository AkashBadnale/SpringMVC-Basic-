
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>register  new  user page </title>
 </head>
 <body>
  <h3>Add Your  Information  to  complete the registration .</h3>
  
  <form id="userForm" action="adduser" method="post">
             NAME :  &nbsp; <input name="name"  value="" type="text"><br/><br/>
             SURNAME :  &nbsp; <input name="surname" value="" type="text"><br/><br/>
             USERNAME :  &nbsp; <input name="username" value="" type="text"><br/><br/>
             PASSWORD :  &nbsp; <input name="password" value="" type="text"><br/><br/>
     <button id="newUserRegisterSubmitButton" type="submit">Register</button>
</form>
  
  
 </body>
</html>