<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored = "false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2>Quote and Policy Options</h2>
		<button><a href="createQuote">Create Quote</a></button>
		<br/>
		<br/>
		<button><a href="retrieveQuote">Retrieve Quote</a></button>
		<br/>
		<br/>
		<button><a href="buyPolicy">Buy Policy</a></button>
		<br/>
		<br/>
		<c:if test = "${not empty adminId}"><button><a href="viewPolicy">View Policy</a></button></c:if>
		<br/>
		<br/>
		<button><a href="logout">Logout</a></button>
	</div>
</body>
</html>