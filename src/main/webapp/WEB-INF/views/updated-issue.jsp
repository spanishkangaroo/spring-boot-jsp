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
	<form:input path="name" />
	<br> Anomaly list:
	<form:select path="issueAnomalyList" multiple="true">
		<form:options items="${issue.issueAnomalyList}" />
	</form:select>
</body>
</html>