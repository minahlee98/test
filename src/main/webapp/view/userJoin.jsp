<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>회원가입 화면 - Bootstrap</title>

  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
    integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

  <style>
    body {
      min-height: 100vh;

      background: -webkit-gradient(linear, left bottom, right top, from(#92b5db), to(#1d466c));
      background: -webkit-linear-gradient(bottom left, #92b5db 0%, #1d466c 100%);
      background: -moz-linear-gradient(bottom left, #92b5db 0%, #1d466c 100%);
      background: -o-linear-gradient(bottom left, #92b5db 0%, #1d466c 100%);
      background: linear-gradient(to top right, #92b5db 0%, #1d466c 100%);
    }

    .input-form {
      max-width: 680px;

      margin-top: 80px;
      padding: 32px;

      background: #fff;
      -webkit-border-radius: 10px;
      -moz-border-radius: 10px;
      border-radius: 10px;
      -webkit-box-shadow: 0 8px 20px 0 rgba(0, 0, 0, 0.15);
      -moz-box-shadow: 0 8px 20px 0 rgba(0, 0, 0, 0.15);
      box-shadow: 0 8px 20px 0 rgba(0, 0, 0, 0.15)
    }
       .bir_mmdd{
        width:300px;
        display:table-cell;
        }
          .bir_yy{
                width:160px;
                display:table-cell;
                }
        .bir_nm_bir_Dd, .bir_Yy+.bir_mm{
        padding-left:10px;
        }

        .form-select_b{
            width: 126px;
            height: 37px;
            padding-left: 0px;
            margin-left: 10px;
            border:1px solid #ced4da;
                color: #495057;
        }
  </style>
  <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
  <script>
$(document).ready(function() {

     var now = new Date();
        var year = now.getFullYear();
        var mon = (now.getMonth() + 1) > 9 ? ''+(now.getMonth() + 1) : '0'+(now.getMonth() + 1);
        var day = (now.getDate()) > 9 ? ''+(now.getDate()) : '0'+(now.getDate());
        //년도 selectbox만들기
        for(var i = 1900 ; i <= year ; i++) {
            $('#yy').append('<option value="' + i + '">' + i + '년</option>');
        }

        // 월별 selectbox 만들기
        for(var i=1; i <= 12; i++) {
            var mm = i > 9 ? i : "0"+i ;
            $('#mm').append('<option value="' + mm + '">' + mm + '월</option>');
        }

        // 일별 selectbox 만들기
        for(var i=1; i <= 31; i++) {
            var dd = i > 9 ? i : "0"+i ;
            $('#dd').append('<option value="' + dd + '">' + dd+ '일</option>');
        }
        $("#yy  > option[value="+year+"]")
        $("#mm  > option[value="+mon+"]")
        $("#dd  > option[value="+day+"]")

         $('#validation-form').bootstrapValidator();

});
  </script>
</head>

<body>
  <div class="container">
    <div class="input-form-backgroud row">
      <div class="input-form col-md-12 mx-auto">
        <h4 class="mb-3">회원가입</h4>
        <form class="validation-form"  action="/register" method="post" novalidate>
            <div class="mb-3">
              <label for="name">이름</label>
              <input type="text" class="form-control" id="name" name="name" placeholder="성명" value="" required>
               <div class="invalid-feedback">한글로 시작하는 2~5 이내로 입력하세요.</div>
            </div>

          <div class="mb-3">
            <label for="id">아이디</label>
            <input type="text" class="form-control" id="id" name="id" placeholder="아이디" required>
          </div>
           <div class="mb-3">
                      <label for="email">이메일</label>
                      <input type="text" class="form-control" id="email" name="email" placeholder="email" required>
                    </div>
            <div class="mb-3">
            <label for="password">비밀번호</label>
            <input type="password" class="form-control" id="pw" name="pw" placeholder="비밀번호" required>
          </div>
            <div class="mb-3">
                      <label for="password_c">비밀번호 확인</label>
                      <input type="password" class="form-control" id="pw_c" placeholder="비밀번호 확인" required>
                      <div class="invalid-feedback">비밀번호가 일치하지 않습니다.</div>
                    </div>
          <div class="mb-3">
            <label for="address">주소</label>
            <input type="text" class="form-control" id="address" name="address" placeholder="서울특별시 강남구" required>
            <div class="invalid-feedback">주소를 입력하세요.</div>
          </div>
          <div class="bir_wrap">
            <label for="address">생년월일</label>
            <div class="bir_yy">
                   <select class="form-select_b" id="yy" name="yy" ><option value="년도" selected>년도</option></select>
            </div>
            <div class="bir_mmdd" >
                        <select class="form-select_b" id="mm" name="mm"><option value="월" selected>월</option></select>
                           <select class="form-select_b" id="dd" name="dd" ><option value="일" selected>일</option></select>
            </div>
</div>
          <hr class="mb-4">
          <div class="custom-control custom-checkbox">
            <input type="checkbox" class="custom-control-input" id="aggrement" required>
            <label class="custom-control-label" for="aggrement">개인정보 수집 및 이용에 동의합니다.</label>
          </div>
          <div class="mb-4"></div>
          <button class="btn btn-primary btn-lg btn-block" type="submit">가입 완료</button>
        </form>
      </div>
    </div>
    <footer class="my-3 text-center text-small">
      <p class="mb-1">&copy; 2021 YD</p>
    </footer>
  </div>
  <script>
    window.addEventListener('load', () => {
      const forms = document.getElementsByClassName('validation-form');

      Array.prototype.filter.call(forms, (form) => {
        form.addEventListener('submit', function (event) {
          if (form.checkValidity() === false) {
            event.preventDefault();
            event.stopPropagation();
          }

          form.classList.add('was-validated');
        }, false);
      });
    }, false);
  </script>
</body>

</html>