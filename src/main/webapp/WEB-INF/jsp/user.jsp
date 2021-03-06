<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form method="post" modelAttribute="user">
		<div align="center">
			<table border="1">
				<caption>
					<h2>List of users</h2>
				</caption>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Password</th>
				</tr>
				<c:forEach var="user" items="${listOfUsers}">
					<tr>
						<td><c:out value="${user.id}" /></td>
						<td><c:out value="${user.name}" /></td>
						<td><c:out value="${user.password}" /></td>
						<td><a type="button" class="btn btn-update"
							href="/update-user?id=${user.id}">Update</a></td>
						<td><a type="button" class="btn btn-delete"
							href="/update-delete?id=${user.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>

	</form:form>

	<%-- <form>
		<sql:setDataSource var="myDB" driver="com.mysql.jdbc.Driver"
			url="jdbc:mysql://localhost:3306/test" user="root" password="root" />

		<sql:query var="userList" dataSource="${myDB}">SELECT id, name FROM to_do</sql:query>
		<div align="center">
			<table border="1">
				<caption>
					<h2>List of users</h2>
				</caption>
				<tr>
					<th>ID</th>
					<th>Name</th>
				</tr>
				<c:forEach var="user" items="${userList.rows}">
					<tr>
						<td><c:out value="${user.id}" /></td>
						<td><c:out value="${user.name}" /></td>
						<td><a type="button" class="btn btn-update" href="/update-user?id=${user.id}">Update</a></td>
						<td><a type="button" class="btn btn-delete" href="/update-delete?id=${user.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</form> --%>

</body>
</html>