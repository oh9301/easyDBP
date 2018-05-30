<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<script src="/easydb/resources/jquery-3.2.1.min.js"></script>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
<form action = "user/login" method = "post">
ID<input type = "text" name = "id">
PW<input type = "text" name = "pw">
<input type = "submit" value = "login">

</form>

</body>

</html>