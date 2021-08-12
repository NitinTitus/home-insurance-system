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
	<h2>Enter Home Owner Details</h2>
	<form:form method="post" action="addHomeOwner" modelAttribute="homeOwnerObject">
		First Name: 
		<form:input path = "firstName" />
		<form:errors path = "firstName" cssStyle="color:red"/>
		<br/>
		<br/>
		<br/>
		Last Name: 
		<form:input path = "lastName" />
		<form:errors path = "lastName" cssStyle="color:red"/>
		<br/>
		<br/>
		<br/>
		Date of Birth (in dd/mm/yyyy format): 
		<form:input path = "dob" />
		<form:errors path = "dob" cssStyle="color:red"/>
		<br/>
		<br/>
		<br/>
		Are you retired?
		<form:select path = "retired">
			<option>Yes</option>
			<option>No</option>
		</form:select>
		<form:errors path = "retired" cssStyle="color:red"/>
		<br/>
		<br/>
		<br/>
		Social Security Number:
		<form:input path = "ssn" />
		<form:errors path = "ssn" cssStyle="color:red"/>
		<br/>
		<br/>
		<br/>
		Email:
		<form:input path = "email" />
		<form:errors path = "email" cssStyle="color:red"/>
		<br/>
		<br/>
		<br/>
		<input type="submit"/>
	</form:form>
	<h3><a href="createQuote">Back</a><br/></h3>
	<span style="color:green">${savedHomeStatus}</span>
</div>
</body>
</html>