<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<h2>Quote Details</h2>
	<br/>
	<br/>
	Quote Id: ${quote.quoteId}
	<br/>
	<br/>
	Monthly Premium: ${quote.premium}
	<br/>
	<br/>
	Dwelling Coverage: ${quote.dwellingCoverage}
	<br/>
	<br/>
	Detached Structures: ${quote.detachedStructures}
	<br/>
	<br/>
	Personal Property: ${quote.personalProperty}
	<br/>
	<br/>
	Additional Living Expense: ${quote.additionalExpense}
	<br/>
	<br/>
	Medical Expense: ${quote.medicalExpense}
	<br/>
	<br/>
	Deductible: ${quote.deductible}
	<br/>
	<br/>
	<span style="color:red">${quoteMessage}</span>
	<br/>
	<br/>
	<h3><a href="createQuote">Back</a><br/></h3>
</div>
</body>
</html>