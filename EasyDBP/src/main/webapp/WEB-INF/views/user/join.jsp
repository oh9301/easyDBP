<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<script src="/easydb/resources/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
$(Document).ready(function(){
	$("#btn").click(function(){
		alert("중복확인!")
	});
	$("#db").click(function(){
		alert("DB 먼저 만들자")
	});
});


</script>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
ID    <input type = "text" name = "id">
<input type = "submit" id = btn name = "check" value = "중복확인"><br>
PW<input type = "text" name = "pw"><br>

<!-- <form action = "" method = "post"> -->
<input type = "submit" id = db value = "DB등록">
<!-- </form> -->

</body>

</html>