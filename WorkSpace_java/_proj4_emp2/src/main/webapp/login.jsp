<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="emp2.dto.EmpDTO"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션으로 로그인</title>
</head>
<body>

	<form method="post" action="login">
		아이디(ename) : <input type="text" name="id" value="SMITH"><br>
		비밀번호(empno) : <input type="password" name="pw" value="7369">
		<c:if test='${param.code == "L001" }'>
			<div style="color: #f00;">
				아이디 또는 비밀번호를 확인 해 주세요
			</div>
		</c:if>
		<input type="submit" value="로그인">
	</form>

</body>
</html>
