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
        .bd-placeholder-img {
            font-size: 1.125rem;
            text-anchor: middle;
            -webkit-user-select: none;
            -moz-user-select: none;
            user-select: none;
        }

        @media (min-width: 768px) {
            .bd-placeholder-img-lg {
                font-size: 3.5rem;
            }
        }
        footer {
          width: 100%;
          height: auto;
          bottom: 0px;
          position: relative;
          border-top: 1px solid #c4c4c4;
          padding-top: 15px;
          color: #808080;
          font-size: 11px;
          background-color: #212529;
          z-index: 1
        }

    </style>
</head>
<body>

<footer class="text-muted py-5">
    <div class="container">
        <p class="float-end mb-1">
            <a href="#">Back to top</a>
        </p>
        <p class="mb-1">Album example is &copy; Bootstrap, but please download and customize it for yourself!</p>
        <p class="mb-0">New to Bootstrap? <a href="/">Visit the homepage</a> or read our <a href="../getting-started/introduction/">getting started guide</a>.</p>
    </div>
</footer>

<main>
</body>
</html>