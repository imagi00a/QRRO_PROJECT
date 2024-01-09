<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>

</head>
<body>
	<h1>order Login</h1>
	<div>
		<form action="/qrro/order/orderLogin" method="get">
			<input type="text" id="table_id" name="table_id"
				placeholder="아이디를 입력하세요"><br> <input type="password"
				id="table_pw" name="table_pw" placeholder="비밀번호를 입력하세요"><br>
			<button type="submit">로그인</button>
		</form>
		<p>${logingMSG}</p>
	</div>
</body>
</html>