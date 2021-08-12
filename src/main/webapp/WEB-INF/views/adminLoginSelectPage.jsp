<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored = "false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Select User</title>
</head>
<body>
	<div align="center">
		<h3>Select the user to view details</h3>
		<form:form mthod="post" action="adminLoginSelect" modelAttribute="adminUser">
			<form:select path="userId">
				<form:options items="${usersMap}"></form:options>
			</form:select>
			<br/>
			<br/>
			<input type="submit">
			<br/>
			<br/>
		</form:form>
		<button><a href="home">Back</a></button>
	</div>
</body>
</html>