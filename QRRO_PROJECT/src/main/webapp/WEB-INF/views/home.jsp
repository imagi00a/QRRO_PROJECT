<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Home</title>
	</head>
	<body>
		<h1>
			Hello QRRO!  
		</h1>
		<div>
			<ul>
				<li><a href="<c:url value='/qrro/order/orderLogin'/>">ORDER</a></li>
            	<li><a href="<c:url value='/qrro/pos/posLogin'/>">POS</a></li>
			</ul>
		</div>
	
	<P>  The time on the server is ${serverTime}. </P>
	</body>
</html>
