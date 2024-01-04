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
				<input type="button" id="btnCreate" value="Create"><br>
			</form>
		</div>
	
		<script src="<c:url value='/cdn/js/jquery-3.7.1.min.js'/>"></script>
		
		<script>
		
			document.getElementById('btnCreate').addEventListener('click',function(){
			document.getElementById('frm1').submit();
			});
		
		</script>
		
	</body>
</html>