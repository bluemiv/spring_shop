<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<!-- https://docs.spring.io/spring-security/site/docs/current/reference/htmlsingle/#csrf-include-csrf-token -->
	
	<meta id="_csrf" name="_csrf" content="${_csrf.token}" />
	<meta id="_csrf_header" name="_csrf_header" content="${_csrf.headerName}" />
	
	<title>로그인 페이지</title>
</head>
<body>
	<h1>loginForm</h1>
	
	<form action="<c:url value="/j_spring_security_check" />" method="post">
		<c:if test="${error eq true }">
			<p>로그인 실패</p>
		</c:if>
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
		ID : <input type="text" name="username"/><br>
		Password : <input type="password" name="password"/><br>
		<input type="submit" value="login" />
	</form>
</body>
</html>