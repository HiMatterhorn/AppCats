<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Lista kotów</title>
</head>
<body>
<a href="<c:url value="dodaj" />">Dodaj kota</a><br />
		<table border="1">
			<thead>
				<tr>
					<th>#</th>
					<th>Imie kota</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${koty}" var="kot" varStatus="status">
				<tr>
					<td>${status.index}</td>
					<td><a href="<c:url value="kot-${status.index}" />">${kot.imie}</a></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		<br />
		<hr />
</body>
</html>