<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>YoillTeller Error page</title>
</head>
<body>
 정확한 년,원,일 을 입력해주세요 
 <%=application.getServerInfo() %>
 <%= application.getMajorVersion() %>.<%= application.getMinorVersion() %>
 <%= JspFactory.getDefaultFactory().getEngineInfo().getSpecificationVersion() %> 
</body>
</html>