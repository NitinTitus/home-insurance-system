<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored = "false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Buy Policy</title>
</head>
<body>
<div align="center">
	<h1>Buy Policy</h1>
		<br/>
		<br/>
		<form:form action="addPolicy" modelAttribute="userPolicyObject">
		Policy effective date (dd/mm/yyyy): <form:input type="text" path="effectiveDate"/>
		<br/>
		<br/>
		Policy end date (dd/mm/yyyy): <form:input type="text" path="endDate"/>
		<br/>
		<br/>
		<input type="submit"/>
		</form:form>
		<br/>
		<br/>
		<span style="color:green">${policyMessage}</span>
		<h3><a href="initialPage">Back</a><br/></h3>
</div>
</body>
</html>