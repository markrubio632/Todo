<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>
<div>
<!-- insert if statement here -->
			<!-- i think we need to request params here? -->
			<%-- <c:out value="${param.name}"></c:out>
			<c:out value="${param.password}"></c:out>  --%>
			<%-- <c:if test="${name != null && password != null}">
				<c:out value="User successfully created, redirecting..."></c:out>
			</c:if>
			<c:if test="${name == null && password == null}">
				<c:out value="User did not create successfully, please enter values in both boxes. refreshing in..."></c:out>
			</c:if> --%>
			
			<!-- copied from above, tests only name validation -->
			<c:if test="${not empty name}">
				<c:out value="User successfully created, redirecting..."></c:out>
			</c:if>
			<c:if test="${empty name}">
				<c:out value="User did not create successfully, please enter values in both boxes. refreshing in..."></c:out>
			</c:if>
			
</div>
</body>
</html>