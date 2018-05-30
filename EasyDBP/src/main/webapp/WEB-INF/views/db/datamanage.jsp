<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	DATAMANAGE
	<h1> excel
	<button> import </button>
	<button> export </button>
	</h1>
	<br>
	
	<table border=1>
		<tr><td>col 1</td> <td>col 2</td></tr>
		<c:forEach items="${tableList }" var="vo">
			<tr>
				<c:forEach items="${fn:split(vo, ',') }" var="cell">
					<td><input value=${cell}  size="5" ></td>
				</c:forEach>

				<td>
					<button> 삭제 </button>
				</td>

				<td>
					<button> 수정 </button>
				</td>

			</tr>
		</c:forEach>
	</table>
	

</body>
</html>