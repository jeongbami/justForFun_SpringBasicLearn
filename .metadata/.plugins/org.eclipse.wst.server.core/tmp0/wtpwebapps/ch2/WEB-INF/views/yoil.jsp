<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>yoilTeller</title>
</head>
<body>


<h1>year=<% request.getParameter("year"); %></h1>
<p>${myDate.year}년 ${myDate.month}월 ${myDate.day}은 ${yoil}요일 입니다.</p>

</body>
</html>