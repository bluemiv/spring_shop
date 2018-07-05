<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>수정</title>
</head>
<body>
	<security:authentication property="principal.username" var="username"/>
	<c:if test="${noticeDto.noticeWriter eq username}">
	<form action="<c:url value='noticeModifyPro' />" method="post">
		작성자 : ${noticeDto.noticeWriter}<br> 
		제목 : <input type="text" name="noticeTitle" value="${noticeDto.noticeTitle}" required="required"><br>
		내용<br>
		<textarea name="noticeContent" required="required">${noticeDto.noticeContent}</textarea><br>
		<input type="hidden" name="noticeId" value="${noticeDto.noticeId}" />
		<input type="submit" value="수정 완료"/> 
	</form>
	</c:if>
	
</body>
</html>