<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link  rel="stylesheet" type="text/css" href="frontend/css/style.css">
<link  rel="stylesheet" type="text/css" href="frontend/css/pop.css">
<title>INUS</title>
</head>
<body>
	<div id="container">
		<header>
		</header>
		
		<c:import url="jsp/lbar.jsp"></c:import>
		<div id="content">
			<nav>
			</nav>
		</div>
		
		<c:import url="jsp/rbar.jsp"></c:import>
	</div>
	
	
	<!-- 서버 만들기 레이어 팝업 -->
	<div id="pop">
		<div style="height:370px">
			<form action="AddNewServer">
				서버 이름 : <input type="text" name="serverName">
				<input type="submit" value="입력">
			</form>
		</div>
	</div>
</body>
</html>