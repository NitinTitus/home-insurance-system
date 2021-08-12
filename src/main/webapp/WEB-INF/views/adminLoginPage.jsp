<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored = "false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<h1>Home Insurance System</h1>
	<br/>
	<br/>
	<h3>Admin login</h3>
		<form:form action="newAdminLogin" modelAttribute="admin">
		Admin name: <form:input type="text" path="adminname"/>
		<form:errors path = "adminname" cssStyle="color:red"/>
		<br/>
		<br/>
		Password: <form:input type="password" path="password"/>
		<form:errors path = "password" cssStyle="color:red"/>
		<br/>
		<br/>
		<input type="submit"/>
		<br/>
		<br/>
		</form:form>
	<span style="color:red">${adminMessage}</span>
	<br/>
	<br/>
	<button><a href="home">Back</a></button>
</div>
</body>
</html>