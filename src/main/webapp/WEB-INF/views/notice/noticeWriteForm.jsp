<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
		제목 : <input type="text" name="noticeTitle" required="required"><br>
		내용<br>
		<textarea name="noticeContent" required="required"></textarea><br>
		<input type="text" name="noticeWriter" disabled="disabled" value="${username}" />
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
		<input type="submit" value="작성"/> 
	</form>
</body>
</html>