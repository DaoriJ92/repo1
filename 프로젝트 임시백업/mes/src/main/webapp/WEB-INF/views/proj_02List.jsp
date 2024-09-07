<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<table border="1">
    <tr>
        <th>Location</th>
    </tr>
    <c:forEach var="proj02dto" items="${list}">
        <tr>
            <td>${proj02dto.location}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
