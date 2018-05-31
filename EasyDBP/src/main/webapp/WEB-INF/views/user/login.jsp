<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<script src="/easydb/resources/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("#login").click(function(){
		alert("success");
	});
	/* $("#create").click(function(){
		alert("");
	});
	 */
});


</script>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
<form action = "login" method = "post">
ID  <input type = "text" name = "id"><br>
PW<input type = "text" name = "pw"><br>
<input type = "submit" id = login value = "login">
</form>
<form action = "join" method = "post">
<input type = "submit" id = create value = "create">


</form>
</body>

</html>