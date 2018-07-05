<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
	<%
		String context = request.getContextPath();
	%>
	<h1>Write Form</h1>
	<form action="<%=context%>/notice/noticeWritePro" method="post">
		작성자 : <security:authentication property="principal.username"/><br> 
		제목 : <input type="text" name="noticeTitle" required="required"><br>
		내용<br>
		<textarea name="noticeContent" required="required"></textarea><br>
		<input type="hidden" name="noticeWriter" value="<security:authentication property="principal.username"/>" />
		<%-- <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/> --%>
		<input type="submit" value="작성"/> 
	</form>
</body>
</html>