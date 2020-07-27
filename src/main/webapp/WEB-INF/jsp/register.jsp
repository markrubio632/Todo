<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- added to refresh with a timer, should be placed with a new page-->
<!-- <meta http-equiv="Refresh" content="3;url=login.jsp"> -->
<title>Insert title here</title>
</head>
<body>

	<h2>User Registration Page</h2>
	<form:form method="post" modelAttribute="register">
		<div align="center">
			<table border="1">
				<caption>
					<h2>Register A User</h2>
				</caption>
				<tr>
					<th>Name</th>
					<th>Password</th>
				</tr>
				<tr>
					<td><input type="text" name="name"></td>
					<td><input type="text" name="password"></td>
				</tr>
			</table>
			<!-- insert if statement here -->
			<!-- i think we need to request params here? -->
			<%-- <c:if test="${name != null && password != null}">
				<c:out value="User successfully created, redirecting..."></c:out>
			</c:if>
			<c:if test="${name == null && password == null}">
				<c:out value="User did not create successfully, please enter values in both boxes. refreshing in..."></c:out>
			</c:if> --%>
		</div>
		<div>
		<input type="submit" id="btn sub">
		</div>
	</form:form>
</body>
</html>