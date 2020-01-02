<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-2.2.4.min.js"></script>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>
<body>
		<table>
		<tr>
			<th>책번호</th>
			<th>제목</th>
			<th>페이지수</th>
			<th>조회수</th>
		</tr>
		<c:forEach items="${list }" var="i">
		<tr>
			<td style="width:15%">${i.bookSeq}</td>
			<td style="width:8%">
			<a href="/book/${i.bookSeq }" ><span style="font-size:25px;">${i.bookTitle }</span></a>
			</td>
			<td style="width:20%">${i.pageCount }</td>
			<td style="width:50%">1</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>