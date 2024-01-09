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
    <div>
        <h1>ORDER Login</h1>
        <form>
            <div>
				<input type="text" placeholder="아이디를 입력하세요"><br>
				<input type="password" placeholder="비밀번호를 입력하세요"><br>
				<button type="submit">Login</button><br>
            </div>
        </form>
    </div>
</body>
</html>