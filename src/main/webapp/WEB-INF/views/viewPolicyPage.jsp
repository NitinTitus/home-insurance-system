<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored = "false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Policy</title>
</head>
<body>
	<div align="center">
		<h2>View Policy Details</h2>
		<br/>
		<br/>
		Policy Key: ${policy.policyKey}
		<br/>
		<br/>
		Quote Id: ${policy.quoteId}
		<br/>
		<br/>
		Policy Effective Date: ${policy.effectiveDate}
		<br/>
		<br/>
		Policy End Date: ${policy.endDate}
		<br/>
		<br/>
		Policy Term: ${policy.policyTerm}
		<br/>
		<br/>
		Policy Status: ${policy.policyStatus}
		<c:if test = "${not empty adminId}"><h4><a href="cancelPolicy">Cancel Policy</a><br/></h4></c:if>
		<c:if test = "${not empty adminId}"><h4><a href="renewPolicy">Renew Policy</a><br/></h4></c:if>
		<c:if test = "${not empty adminId}"><h4><a href="editPolicyTerms">Edit Policy Terms</a><br/></h4></c:if>
		<span style="color:red">${policyBuy}</span>
		<h3><a href="initialPage">Back</a><br/></h3>
	</div>
</body>
</html>