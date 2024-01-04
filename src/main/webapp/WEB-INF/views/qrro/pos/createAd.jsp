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
        <form>
            <div>
            
            	아이디<br><input type="text"placeholder="아이디 입력"><br>
            	비밀번호<br><input type="password" placeholder="비밀번호 입력"><br>
            	<input type="password" placeholder="비밀번호 재확인"><br>
            	업장명<br><input type="text" placeholder="업장명 입력"><br>
            	사업주 이름<br><input type="text" placeholder="사업주명 입력"><br>
            	사업자 번호<br><input type="text" placeholder="사업자번호 입력"><br>
            	업장 주소<br><input type="text" placeholder="주소 입력"><br>
            	업장 전화번호<br><input type="tel"  placeholder="전화번호 입력"><br>
            
            </div>
        </form>
    </div>
</body>
</html>