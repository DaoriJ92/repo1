<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="list">목록으로가기</a><br>
<a href="">삭제</a><br>
<a href="">수정하기</a><br>
	<div>${dto.tno }</div>
	<div>${dto.title }</div>
	<div>${dto.dueDate }</div>
	<div>${dto.finished }</div>
</body>
</html>