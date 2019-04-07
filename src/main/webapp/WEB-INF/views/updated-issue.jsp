<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h1>Updated issue:</h1>
	Id:
	<input type="text" name="id" value="${issue.id}">
	<br> Name:
	<input type="text" name="name" value="${issue.name}">
	<br>
	<br> Anomaly list:
	<c:forEach items="${issue.issueAnomalyList}" var="anomaly">
    	<option value="${anomaly.id}">${anomaly.name}</option>
	</c:forEach>
</body>
</html>