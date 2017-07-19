<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<base href="${pageContext.request.scheme }://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/" />
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>成功</h1>
	<!-- 方法一： -->
	<%-- <img src="img/${userImg }"> --%>
	<!-- 方法二： -->
	<table>
		<c:forEach items="${userUpload }" var="up">
			<tr>
				<td>${up.userName }</td>
				<td>${up.userPwd }</td>
				<td><img src="img/${up.userImg }"/></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>