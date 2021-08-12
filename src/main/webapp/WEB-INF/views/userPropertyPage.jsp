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
	<h2>Enter Property Details</h2>
	<form:form method="post" action="addProperty" modelAttribute="userPropertyObject">
		Market value of your home(in $): 
		<form:input path = "marketValue" />
		<form:errors path = "marketValue" cssStyle="color:red"/>
		<br/>
		<br/>
		<br/>
		Year home was built: 
		<form:input path = "yearBuilt" />
		<form:errors path = "yearBuilt" cssStyle="color:red"/>
		<br/>
		<br/>
		<br/>
		Square footage (in sq foot): 
		<form:input path = "sqFootage" />
		<form:errors path = "sqFootage" cssStyle="color:red"/>
		<br/>
		<br/>
		<br/>
		Dwelling style:
		<form:select path = "dwellingStyle">
			<option>1 story</option>
			<option>1.5 story</option>
			<option>2 story</option>
			<option>2.5 story</option>
			<option>3 story</option>
		</form:select>
		<form:errors path = "dwellingStyle" cssStyle="color:red"/>
		<br/>
		<br/>
		<br/>
		Roof Material:
		<form:select path = "roofMaterial">
			<option>Concrete</option>
			<option>Clay</option>
			<option>Rubber</option>
			<option>Steel</option>
			<option>Tin</option>
			<option>Wood</option>
		</form:select>
		<form:errors path = "roofMaterial" cssStyle="color:red"/>
		<br/>
		<br/>
		<br/>
		Garage Type:
		<form:select path = "garageType">
			<option>Attached</option>
			<option>Detached</option>
			<option>Built-in</option>
			<option>None</option>
		</form:select>
		<form:errors path = "garageType" cssStyle="color:red"/>
		<br/>
		<br/>
		<br/>
		Number of full baths:
		<form:select path = "numFullBaths">
			<option>1</option>
			<option>2</option>
			<option>3</option>
			<option>More</option>
		</form:select>
		<form:errors path = "numFullBaths" cssStyle="color:red"/>
		<br/>
		<br/>
		<br/>
		Number of half baths:
		<form:select path = "numHalfBaths">
			<option>1</option>
			<option>2</option>
			<option>3</option>
			<option>More</option>
		</form:select>
		<form:errors path = "numHalfBaths" cssStyle="color:red"/>
		<br/>
		<br/>
		<br/>
		Does your home have a swimming pool?
		<form:select path = "hasSwimmingPool">
			<option>Yes</option>
			<option>No</option>
		</form:select>
		<form:errors path = "hasSwimmingPool" cssStyle="color:red"/>
		<br/>
		<br/>
		<br/>
		<input type="submit"/>
	</form:form>
	<h3><a href="createQuote">Back</a><br/></h3>
	<span style="color:green">${savedPropertyStatus}</span>
</div>
</body>
</html>