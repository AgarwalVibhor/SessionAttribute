<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create Account</title>
<style type="text/css">
	.error
	{
		color : red;
		font-weight: bold;
	}
</style>
</head>
<body>
	<form:form name="createAccount" action="createAccount.spring" method="POST" commandName="account">
	
		<table border="0" align="center">
			<tr>
				<td colspan="3" align="center"><h1>NEW ACCOUNT :</h1></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>FIRST NAME :</td>
				<td><form:input path="firstName" /></td>
				<td><form:errors path="firstName" cssClass="error" /></td>
			</tr>
			<tr>
				<td>LAST NAME :</td>
				<td><form:input path="lastName" /></td>
				<td><form:errors path="lastName" cssClass="error" /></td>
			</tr>
			<tr>
				<td>ADDRESS :</td>
				<td><form:textarea path="address"></form:textarea></td>
				<td><form:errors path="address" cssClass="error" /></td>
			</tr>
			<tr>
				<td>EMAIL :</td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="3" align="center"><input type="submit" value="Create Account" /></td>
			</tr>
		</table>
	
	</form:form>
</body>
</html>