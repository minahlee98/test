<%@ page contentType="text/html; charset=utf-8"%>
<%
final boolean hasUserData = session.getAttribute("user_info") != null;
System.out.println( "여기는 logout "+ hasUserData );
session.invalidate();
response.sendRedirect("index.jsp");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>index</title>
</head>
<body>
			"logout 입니당"

</body>
</html>