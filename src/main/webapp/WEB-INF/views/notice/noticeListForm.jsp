<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>공지사항</title>
</head>
<body>
	<h1>Notice List</h1>
	<c:forEach items="${list}" var="noticeDTO">
		noticeId: ${noticeDTO.noticeId }<br>
		noticeWriter: ${noticeDTO.noticeWriter }<br>
		noticeTitle: ${noticeDTO.noticeTitle }<br>
		noticeContent: ${noticeDTO.noticeContent }<br>
		noticeDate: ${noticeDTO.noticeDate }<br>
		noticeUpdateDate: ${noticeDTO.noticeUpdateDate }<br>
		noticeHit: ${noticeDTO.noticeHit }
		<hr>
	</c:forEach>
	<button class="" onclick="window.location='noticeWriteForm'">Write</button>
</body>
</html>