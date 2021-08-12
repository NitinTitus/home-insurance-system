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
	<h2>Location Details</h2>
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
	<h2>Home Owner Details</h2>
	<br/>
	<br/>
	First Name: ${owner.firstName}
	<br/>
	<br/>
	Last Name: ${owner.lastName}
	<br/>
	<br/>
	Date of Birth: ${owner.dob}
	<br/>
	<br/>
	Are you retired? ${owner.retired}
	<br/>
	<br/>
	Social Security Number: ${owner.ssn}
	<br/>
	<br/>
	Email: ${owner.email}
	<br/>
	<br/>
	<h2>Property Details</h2>
	<br/>
	<br/>
	What is the market value of your home? ${property.marketValue}
	<br/>
	<br/>
	What year was your home originally built? ${property.yearBuilt}
	<br/>
	<br/>
	Square footage(in sq foot): ${property.sqFootage}
	<br/>
	<br/>
	Dwelling style: ${property.dwellingStyle}
	<br/>
	<br/>
	Roof material: ${property.roofMaterial}
	<br/>
	<br/>
	Type of Garage: ${property.garageType}
	<br/>
	<br/>
	Number of full baths: ${property.numFullBaths}
	<br/>
	<br/>
	Number of half baths: ${property.numHalfBaths}
	<br/>
	<br/>
	Does your home have a swimming pool? ${property.hasSwimmingPool}
	<br/>
	<br/>
	<h2>Coverage Details</h2>
	<br/>
	<br/>
	Quote Id: ${quote.quoteId} 
	<br/>
	<br/>
	Monthly Premium: ${quote.premium}
	<br/>
	<br/>
	Dwelling coverage ${quote.dwellingCoverage}
	<br/>
	<br/>
	Detached structures: ${quote.detachedStructures}
	<br/>
	<br/>
	Personal Property: ${quote.personalProperty}
	<br/>
	<br/>
	Medical Expense: ${quote.medicalExpense}
	<br/>
	<br/>
	Additional Expense: ${quote.additionalExpense}
	<br/>
	<br/>
	Deductible: ${quote.deductible}
	<br/>
	<br/>
	<h3><a href="retrieveQuote">Back</a><br/></h3>
</div>
</body>
</html>