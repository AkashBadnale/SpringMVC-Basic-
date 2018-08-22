<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head> <%@ page isELIgnored="false" %></head>
<body>
	<h2>List of Users of these site</h2>

<%-- <c:forEach var="listValue" items="${lists}">
     ${listValue.name}  &nbsp;&nbsp;&nbsp;   ${listValue.surname}  &nbsp;&nbsp;&nbsp;   ${listValue.username}  &nbsp;&nbsp;&nbsp;  ${listValue.password} <br>
</c:forEach> --%>
<!-- <form  action="show" method="get"> -->

	<c:if test="${!empty lists}">
	<table align="left"  border=1>
		<tr>
			<th>NAME</th>
			<th>SURNAME</th>
			<th>USERNAME</th>
			<th>PASSWORD</th>
		</tr>

		<c:forEach var="listValue" items="${lists}">
			<tr>
				<td>${listValue.name}</td>
				<td>${listValue.surname}</td>
				<td>${listValue.username}</td>
				<td>${listValue.password}</td>
			</tr>
		</c:forEach>
	</table>
</c:if>

<!-- </form> -->
</body>
</html>