<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<base
	href="${pageContext.request.scheme }://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/" />
<html lang="zh-CN">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>日志修改页面</title>

<link href="css/bootstrap.min.css" rel="stylesheet">

</head>

<body>
	<div class="container">
	${journal }
		<div class="row clearfix">
			<div class="col-md-12 column">
				<h4>日志内容：<span style="margin-left: 410px;">提问的时间：<fmt:formatDate
								value="${jou.journalTime }" pattern="yyyy-MM-dd" /></span>
				</h4>
				<textarea cols="100px" rows="10px" readonly="readonly">${jou.journalContent }</textarea>
			</div>
		</div>
		<div class="row clearfix">
			<div class="col-md-12 column">
				<h4>修改内容：</h4>
				<form action="journal/update" method="post">
				<div class="divcss5">
					<textarea name="journalContent" class="ckeditor"></textarea>
				</div>
				<a href="user/stuHomePage"><button type="button"
						class="btn btn-default col-md-2"
						style="margin-left: 120px; margin-top: 20px;">返回首页</button></a>
				<button type="submit" class="btn btn-default col-md-2"
					style="margin-left: 50px; margin-top: 20px;">提交</button>
					<input type="hidden" name="id" value="${jou.id }"/>
					</form>
				<div class="panel-body"></div>
			</div>
		</div>
	</div>
	<script src="third/ckeditor/ckeditor.js">
		CKEDITOR.replace("journalContent");
	</script>


	<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>

</html>