<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC Library</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Classification ID</th>
				<th>Classification Name</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="classification" items="${classificationList }">
			<tr>
				<td><c:out value="${classification.classification_id }"/></td>
				<td><c:out value="${classification.classification_name }"/></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>