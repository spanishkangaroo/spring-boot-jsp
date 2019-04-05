<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
<h1>Issue:</h1>
<form action="/issue" method="post">
	Id: <input type="text" name="id" value="${issue.id}"><br>
	Name: <input type="text" name="name" value="${issue.name}"><br>
	<input type="submit" value="Submit">
</form>
</body>
</html>