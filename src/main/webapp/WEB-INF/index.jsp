<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Secret Code</title>
</head>
<body>
	<div class="error">
		<c:out value="${error}" />
	</div>
	<h2>What is the code?</h2>
	<form action="/code" method="POST">
		<input type="text" name="attempt"></input>
		<br>
		<input type="submit" value="Try Code"></input>
	</form>
</body>
</html>