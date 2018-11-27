<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="pass" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change Password</title>
</head>
<body>
	<pass:form action="password" method="post" modelAttribute="my">
		<table>
			<tr><td>Enter username:</td><td><pass:input path="userName"/><br></td></tr>
			<tr><td>Enter old password:</td><td><pass:input path="password"/><br></td></tr>
			<tr><td>Enter new password:</td><td><pass:input path="password"/><br></td></tr>
			<tr><td>Re-Enter new password:</td><td><pass:input path="password"/><br></td></tr>
			<tr><td></td><td><input type="submit" value="Change password"/></td></tr>
		</table>
	</pass:form>
</body>
</html>