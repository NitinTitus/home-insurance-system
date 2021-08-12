<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<h2>Enter User Location Details</h2>
	<form:form method="post" action="addLocation" modelAttribute="userLocationObject">
		Residence Type: 
		<form:select path="residenceType">
			<option>Single-Family Home</option>
			<option>Condo</option>
			<option>Town House</option>
			<option>Row House</option>
			<option>Duplex</option>
			<option>Apartment</option>
		</form:select>
		<form:errors path = "residenceType" cssStyle="color:red"/>
		<br/>
		<br/>
		<br/>
		Address Line 1: 
		<form:input path = "address1" />
		<form:errors path = "address1" cssStyle="color:red"/>
		<br/>
		<br/>
		<br/>
		Address Line 2: 
		<form:input path = "address2" />
		<br/>
		<br/>
		<br/>
		City:
		<form:input path = "city" />
		<form:errors path = "city" cssStyle="color:red"/>
		<br/>
		<br/>
		<br/>
		State:
		<form:input path = "state" />
		<form:errors path = "state" cssStyle="color:red"/>
		<br/>
		<br/>
		<br/>
		Zip:
		<form:input type="number" path = "zip" />
		<form:errors path = "zip" cssStyle="color:red"/>
		<br/>
		<br/>
		<br/>
		Residence Use: 
		<form:select path="residenceUse">
			<option>Primary</option>
			<option>Secondary</option>
			<option>Rental Property</option>
		</form:select>
		<form:errors path = "residenceUse" cssStyle="color:red"/>
		<br/>
		<br/>
		<br/>
		<input type="submit"/>
	</form:form>
	<h3><a href="createQuote">Back</a><br/></h3>
	<span style="color:green">${savedStatus}</span>
</div>
</body>
</html>