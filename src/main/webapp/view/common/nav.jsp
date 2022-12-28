<%@ page import="springTest.model.UserData" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
final boolean hasUserData = session.getAttribute("user_info") != null;
System.out.println( "여기는 index.jsp > "+ hasUserData );
%>
<html>
<head>
    <title>연습용 페이지 입니다.</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <style>
        nav{
               width:200px;
               background-color:#eee;
               border-right : 1px solid #ddd;
               position:absolute;
               height:100%
               }
               h1{font-size:18px; padding:20px;}
               .menu{}
               .menu li {}

               .menu li a {
               height:30px;
               line-height: 30px;
               display:block;
               padding 0 20px;
               font-size :12px;
               color:#555;}

               .menu li a: hover {background-color : yellowgreen; color:white;}

    </style>
</head>
<body>

 <nav>
    <ul class="menu">
    <li><a href="/view/ePayment.jsp">마이페이지</a></li>
    <li><a href="/view/document/docwrite.jsp">기안하기</a></li>
    <li><a href="">결재대기함</a></li>
    <li><a href="">진행문서함</a></li>
    <li><a href="">완료된문서</a></li>
    <li><a href="">기안한문서</a></li>
    </ul>
    </nav>
</body>
</html>