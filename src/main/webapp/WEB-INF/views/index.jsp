<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Shopping Mall</title>
</head>
<body>
	<h1>ShoppingMall</h1>
	<security:authorize access="isAnonymous()">
		<a href="login/loginForm">Login</a><br>
		<a href="login/signUpForm">Sign Up</a><br>
	</security:authorize>
	<security:authorize access="isAuthenticated()">
		<%-- <form action="<c:url value="/logout" />" method = "post">
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
			<input type="submit" value="logout"/>
		</form> --%>
		<a href="<c:url value="/logout" />">logout</a><br>
	</security:authorize>
	<a href="notice/noticeListForm">Notice List</a>
</body>
</html>