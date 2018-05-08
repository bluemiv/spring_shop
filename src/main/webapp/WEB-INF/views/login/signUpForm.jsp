<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>회원가입</title>
	<script type="text/javascript">
		var pwd1;
		var pwd2;
		if(pwd1 != null && pwd2 != null && pwd1 == pwd2){
			
		}
	</script>
</head>
<body>
	<h1>signUp Form</h1>
	<form action="signUpPro" method="post">
		Email <input type="text" name="userEmail" /><br>
		Password <input type="password" id="pwd1" name="userPwd" /><br>
		Password 재확인 <input type="password" id="pwd2"/><br>
		Name <input type="text" name="userName" /><br>
		Age <input type="date" name="userAge" /><br>
		Gender <input type="radio" name="userGender" value="female"/> 여성
		<input type="radio" name="userGender" value="male"/> 남성<br>
		Address <input type="text" name="userAddress" /><br>
		Role <input type="radio" name="userRole" value="ROLE_ADMIN"/> 관리자
		<input type="radio" name="userRole" value="ROLE_USER"/> 사용자<br>
		<input type="hidden" name="_csrf" value="${_csrf.token}"/>
		<input type="submit" value="Sign Up"/>
	</form>
</body>
</html>