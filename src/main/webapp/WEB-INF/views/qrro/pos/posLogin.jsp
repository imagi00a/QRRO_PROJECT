<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
</head>
<body>
        <h1>POS Login</h1>
            <div>
                <input type="text" name="username" placeholder="아이디를 입력하세요"><br>
                <input type="password" name="password" placeholder="비밀번호를 입력하세요"><br>
            </div>
            <div>
				<ul>
					<li><a href="<c:url value='/qrro/pos/posMain'/>">Login</a></li>
					<li><a href="<c:url value='/qrro/pos/createAd'/>">Create Admin ID</a></li>
				</ul>
		</div>
</body>
</html>
