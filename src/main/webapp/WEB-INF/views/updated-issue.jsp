<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h1>Updated issue:</h1>
	Id:
	<input type="text" name="id" value="${issue.id}">
	<br> Name:
	<input type="text" name="name" value="${issue.name}">
	<br>
</body>
</html>