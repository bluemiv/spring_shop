<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>공지사항</title>
	<script>
		window.onload=function(){
			var isUpdate = document.getElementById("isUpdate").value;
			var isInsert = document.getElementById("isInsert").value;
			var isDelete = document.getElementById("isDelete").value;
			
			if(isUpdate == "true"){
				alert("수정 완료!");	
			}else if(isUpdate == "false"){
				alert("오류 : 수정 실패!");
			}
			
			if(isInsert == "true"){
				alert("글 작성 완료!");
			}else if(isInsert == "false"){
				alert("오류 : 글 작성 실패!");
			}
			
			if(isDelete == "true"){
				alert("글 삭제 완료!");
			}else if(isDelete == "false"){
				alert("오류 : 글 삭제 실패!");
			}
		}
	</script>
</head>
<body>
	<input type="hidden" value="${isUpdate}" id="isUpdate"/>
	<input type="hidden" value="${isInsert}" id="isInsert"/>
	<input type="hidden" value="${isDelete}" id="isDelete"/>
	<h1>Notice List</h1>
	<c:forEach items="${list}" var="noticeDTO">
		noticeId: ${noticeDTO.noticeId }<br>
		noticeWriter: ${noticeDTO.noticeWriter }<br>
		noticeTitle: ${noticeDTO.noticeTitle }<br>
		noticeContent: ${noticeDTO.noticeContent }<br>
		noticeDate: ${noticeDTO.noticeDate }<br>
		noticeUpdateDate: ${noticeDTO.noticeUpdateDate }<br>
		noticeHit: ${noticeDTO.noticeHit }
		<form action="noticeModifyForm" method="post">
			<input type="hidden" name="noticeId" value="${noticeDTO.noticeId}">
			<input type="submit" value="Modify"/>
		</form>
		<form action="noticeDelete" method="post">
			<input type="hidden" name="noticeId"value="${noticeDTO.noticeId}">
			<input type="submit" value="Delete"/>
		</form>
		<hr>
	</c:forEach>
	<button class="" onclick="window.location='noticeWriteForm'">Write</button>
</body>
</html>