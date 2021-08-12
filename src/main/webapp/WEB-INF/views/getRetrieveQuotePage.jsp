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
	<h2>Retrieve Quote Details</h2>
	<br/>
	<br/>
	Quote Id: ${quote.quoteId}
	<br/>
	<br/>
	Residence Type: ${location.residenceType}
	<br/>
	<br/>
	Address Line 1: ${location.address1}
	<br/>
	<br/>
	City: ${location.city}
	<br/>
	<br/>
	State: ${location.state}
	<br/>
	<br/>
	Zip: ${location.zip}
	<br/>
	<br/>
	Residence User: ${location.residenceUse}
	<br/>
	<br/>
	<h3><a href="retrieveQuote">Back</a><br/></h3>
</div>
</body>
</html>