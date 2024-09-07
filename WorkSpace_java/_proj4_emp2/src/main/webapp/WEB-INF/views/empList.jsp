<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    %>
<%@ page import="java.util.List" %>
<%@ page import="emp2.dto.EmpDTO" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    <!-- 사용자 로그인 상태에 따라 환영 메시지 또는 로그인 링크를 표시 -->
    <div style="text-align: right;">
        <!-- loginDTO 객체가 비어 있지 않으면 사용자 이름을 표시 -->
        <c:if test="${not empty loginDTO}">
            ${loginDTO.ename}님 환영합니다.
        </c:if>
        <!-- loginDTO 객체가 비어 있으면 로그인 링크를 표시 -->
        <c:if test="${empty loginDTO}">
            <a href="login.jsp">로그인</a>
        </c:if>
    </div>

    <!-- emp2 테이블의 데이터를 표시하는 HTML 테이블 -->
    <table border="1">
        <tr>
            <th>empno</th>
            <th>ename</th>
            <th>job</th>
            <th>hireDate</th>
        </tr>
        
        <!-- JSP EL(Expression Language)을 사용하여 'list' 속성의 각 항목을 반복하여 테이블에 표시 -->
        <c:forEach var="emp" items="${list}">
            <tr>
                <td>${emp.empno}</td>
                <td>${emp.ename}</td>
                <td>${emp.job}</td>
                <td>${emp.hireDate}</td>
            </tr>
        </c:forEach>
    </table>
    <hr>
    
    <!-- 다음 테이블은 스크립트릿을 사용하여 'list' 속성의 데이터를 표시 -->
    <table border="1">
        <tr>
            <th>empno</th>
            <th>ename</th>
            <th>job</th>
            <th>hireDate</th>
        </tr>
        <%
            // request 객체에서 'list' 속성을 가져와서 List<EmpDTO>로 캐스팅
            List<EmpDTO> list = (List<EmpDTO>)request.getAttribute("list");

            // List<EmpDTO>의 각 항목을 반복하여 empno 값을 출력
            for (EmpDTO dto : list) {
                int empno = dto.getEmpno();
                out.print(empno + ", ");
            }
        %>
    </table>
</body>
</html>
