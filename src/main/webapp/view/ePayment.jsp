<%@ page contentType="text/html; charset=utf-8"%>
  <head>
    <meta charset="utf-8">
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>


    <link rel="canonical" href="https://getbootstrap.kr/docs/5.1/examples/sign-in/">



    <!-- Bootstrap core CSS -->
<link href="/docs/5.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <!-- Favicons -->
<link rel="apple-touch-icon" href="/docs/5.1/assets/img/favicons/apple-touch-icon.png" sizes="180x180">
<link rel="icon" href="/docs/5.1/assets/img/favicons/favicon-32x32.png" sizes="32x32" type="image/png">
<link rel="icon" href="/docs/5.1/assets/img/favicons/favicon-16x16.png" sizes="16x16" type="image/png">
<link rel="manifest" href="/docs/5.1/assets/img/favicons/manifest.json">
<link rel="mask-icon" href="/docs/5.1/assets/img/favicons/safari-pinned-tab.svg" color="#7952b3">
<link rel="icon" href="/docs/5.1/assets/img/favicons/favicon.ico">
<meta name="theme-color" content="#7952b3">


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

        html, body {
            height: 100%
        }

        #wrap {
        height:auto;
        min-height: 100%;
        }
h4 {
	color: #0A2D5D;
	font-weight: bold;
}

#dolistAppro {
	list-style: none;
	margin: 0;
	padding-left: 20px;
	background: #6794D4;
	text-align: left;
}

#dolistAppro li {
	/* 	float: left; */
	display: inline-block;
	background: white;
	margin: 10px 20px;
	padding: 5px;
}

#dolistAppro li > a {
	text-decoration: none;
}

#dolist {
	width: 1000px;
	padding-left: 15px;
}

#dolist h4 {
	margin-top: 10px;
	padding: 0;
}

#dolistcon {
	padding: 20px;
}

.container {
	width: 900px;
}

.active > th {
	text-align: center;
}

.table-content > td{
 	text-align: center;
}
.table-content > td:nth-child(3){
	text-align: left;
}
.table-content span{
	color: red;
}

.title {
	text-align: left;
	margin-bottom: 18px;
	font-weight: bold;
}
#contents{
    margin-left: 200px;
    position: sticky;
}
    </style>
<jsp:include page="/view/common/top.jsp" />
  </head>


  <body>
  <div id ="wrap">
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
    <div id="contents">
    	<div id="dolistcon">
    		<div id="dolist">
    			<h3 class="title">처리할 일</h3>
    			<ul id="dolistAppro">
    				<li><a href="/document/list/waitapprove" style="font-size: 16px;">결재대기함 : ${waitApproveCnt }건</a></li>
    				<li><a href="/document/list/progress" style="font-size: 16px;">진행문서함 : ${progressCnt }건</a></li>
    			</ul>
    		</div>
    		<br>
    		<br>
    		<br>


    		<div class="container" style="width: 1000px; margin-left: 0px">
    			<h3 class="title">결재대기함</h3>
    			<table class="table table-striped table-hover" style="width: 1000px;">
    				<!-- 부트스트랩, table -->
    				<tr class="active">
    					<th style="width: 10%;">구분</th>
    					<th style="width: 20%;">보고일자</th>
    					<th style="width: 40%;">제목</th>
    					<th style="width: 10%;">부서</th>
    					<th style="width: 10%;">직위</th>
    					<th style="width: 10%;">보고자</th>
    				</tr>

    				<c:if test="${empty waitApproveDoList }">
    				<tr class="table-content">
    					<td colspan="6">조회된 문서가 없습니다.</td>
    				</tr>
    				</c:if>

    				<c:forEach items="${waitApproveDoList }" var="waitApprove">
    				<tr class="table-content">
    					<td>${waitApprove.report_type }</td>
    					<td><fmt:formatDate value="${waitApprove.doc_date }" pattern="yyyy-MM-dd"/></td>
    					<td>
    					<c:if test="${waitApprove.doc_emergency eq 'Y' }">
    					<a href="/document/approve/view?doc_num=${waitApprove.doc_num }"><span>[긴급] </span>${waitApprove.doc_title }</a>
    					</c:if>
    					<c:if test="${waitApprove.doc_emergency != 'Y' }">
    					<a href="/document/approve/view?doc_num=${waitApprove.doc_num }">${waitApprove.doc_title }</a>
    					</c:if>
    					</td>
    					<td>${waitApprove.dept }</td>
    					<td>${waitApprove.userrank }</td>
    					<td>${waitApprove.username }</td>
    				</tr>
    				</c:forEach>
    			</table>


    			<br>

    			<h3 class="title">진행문서함</h3>
    			<table class="table table-striped table-hover " style="width:1000px;">
    				<!-- 부트스트랩, table -->
    				<tr class="active">
    					<th style="width: 10%;">구분</th>
    					<th style="width: 20%;">보고일자</th>
    					<th style="width: 40%;">제목</th>
    					<th style="width: 10%;">부서</th>
    					<th style="width: 10%;">직위</th>
    					<th style="width: 10%;">보고자</th>
    				</tr>

    				<c:if test="${empty progressDoList }">
    				<tr class="table-content">
    					<td colspan="6">조회된 문서가 없습니다.</td>
    				</tr>
    				</c:if>

    				<c:forEach items="${progressDoList }" var="progress">
    				<tr class="table-content">
    					<td>${progress.report_type }</td>
    					<td><fmt:formatDate value="${progress.doc_date }" pattern="yyyy-MM-dd"/></td>
    					<td>
    					<c:if test="${progress.doc_emergency eq 'Y' }">
    					<a href="/document/view?doc_num=${progress.doc_num }"><span>[긴급] </span>${progress.doc_title }</a>
    					</c:if>
    					<c:if test="${progress.doc_emergency != 'Y' }">
    					<a href="/document/view?doc_num=${progress.doc_num }">${progress.doc_title }</a>
    					</c:if>
    					</td>
    					<td>${progress.dept }</td>
    					<td>${progress.userrank }</td>
    					<td>${progress.username }</td>
    				</tr>
    				</c:forEach>
    			</table>


    		</div>
    		<!-- div.container -->

    		<br>

    	</div>
    	<!-- dolistcon -->


    </div>
     </div>

  </body>


    <jsp:include page="/view/common/footer.jsp" />

