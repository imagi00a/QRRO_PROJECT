<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
	<head>
	    <meta charset="UTF-8">
	    <title>Create Admin ID Page</title>
	</head>
	
	<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
	<script>
	
	//입력값 유효성 검사. form의 모든 항목을 불러와서 입력값이 비었을 경우
	//버튼을 클릭했을 때 지정한 위치에 메세지를 뜨게 설정함.
	  $(document).ready(function(){
	    $('#btnCreate').click(function(e){
	      var store_id = $('input[name="store_id"]').val().trim();
	      var store_pw = $('input[name="store_pw"]').val().trim();
	      var store_name = $('input[name="store_name"]').val().trim();
	      var owner = $('input[name="owner"]').val().trim();
	      var store_no = $('input[name="store_no"]').val().trim();
	      var address = $('input[name="address"]').val().trim();
	      var store_tel = $('input[name="store_tel"]').val().trim();
	
	      if(store_id === '' || store_pw === '' || store_name === '' || owner === '' 
	    		  || store_no === '' || address === '' || store_tel === '') {
	    	  $('#message').text('모든 항목을 입력해 주세요');
	          e.preventDefault();
	        } else {
	          $('#message').text('');
	          $('#frm1').submit();
	          alert('관리자 등록이 되었습니다.');
	        }
	    });
	  });
	</script>

	<body>
		<div>
	        <h1>Create Admin ID</h1>
		</div>
		<div>
			<form id="frm1" method = "post" action = "<c:url value = '/pos/create'/>" enctype="multipart/form-data">
			            
				<input type="text" name="store_id" placeholder="아이디 입력"><br>
				<input type="password" name="store_pw" placeholder="비밀번호 입력"><br>
				<input type="text" name="store_name" placeholder="업장명 입력"><br>
				<input type="text" name="owner" placeholder="사업주명 입력"><br>
				<input type="text" name="store_no" placeholder="사업자번호 입력"><br>
				<input type="text" name="address" placeholder="주소 입력"><br>
				<input type="tel"  name="store_tel" placeholder="전화번호 입력"><br>
				<input type="button" id="btnCreate" value="Create">
				<input type="button" id="btnFindId" value="FindID">
				<input type="button" id="btnFindPw" value="FindPW"><br>
				<div id="message" style="color:red;"></div>
			</form>
		</div>
	
		
	</body>
</html>