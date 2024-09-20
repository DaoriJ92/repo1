<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<header>
		Logo
		<nav>emp > 회원 목록</nav>
	</header>
	<main>
		<section>
			<article>
				<a href="Emp0?cmd=join">회원가입</a>
				<form method="get" action="Emp0">
					<select name="type">
						<option value="1">이름</option>
						<option value="2">직책</option>
						<option value="3">이름 + 직책</option>
					</select> 검색 : <input type="text" name="keyword" placeholder="검색어를 입력하세요">
					<input type="submit" value="검색">
				</form>
				
				<table border="1">
					<caption>회원 목록 표시</caption>
					<thead>
						<tr>
							<th>선택</th>
							<th>사원번호</th>
							<th>이름</th>
							<th>직책</th>
							<th>사수</th>
							<th>입사일</th>
							<th>급여</th>
							<th>상여금</th>
							<th>부서번호</th>
						<!--  <th>삭제</th> -->
						</tr>
					</thead>
					<tbody>

						<c:forEach var="list" items="${ empList }">
							<tr>
								<td><input type="checkbox" name="check"
									value="${dto.empno}"> </td>
								<c:url var="empno" value="Emp0?cmd=adit">
									<c:param name="empno" value="${ list.empno }" />
									<c:param name="ename" value="${ list.ename }" />
									<c:param name="job" value="${ list.job }" />
								</c:url>
								<td><a href="${ empno }">${ list.empno }</a></td>
								<td>${ list.ename }</td>
								<td>${ list.job }</td>
								<td>${ list.mgr }</td>
								<td>
									<!-- 원하는 형태로 날짜를 정할수 있다. --> <fmt:formatDate
										value="${ list.hireDate }" pattern="yyyy년 MM월 dd일 hh시 mm분 ss초" />
								</td>
								<td>${ list.sal }</td>
								<td>${ list.comm }</td>
								<td>${ list.deptno }</td>
							<!-- 	<td><form method="post" action="Emp0?cmd=delete">
										<input type="hidden" name="empno" value="${ list.empno }">
										<input type="submit" value="삭제">
									</td> -->
							</tr>
						</c:forEach>
					</tbody>
				</table>
				</form>
			</article>
		</section>
	</main>
	<footer>휴먼교육센터</footer>
</body>
</html>