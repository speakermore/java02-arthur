<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<base href="${pageContext.request.scheme }://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/" />
<html lang="zh-CN">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>回答页面</title>

<link href="css/bootstrap.min.css" rel="stylesheet">

</head>

<body>
	<form action="user/add" method="post">
		<div class="container">
			<div class="row clearfix">
				<div class="col-md-12 column">
					<h4>
						提问者：${ques.studentName}<span style="margin-left: 160px;">班级：${ques.className}</span><span
							style="margin-left: 200px;"><input type="hidden"
							name="questionGiveIntegral" value="${ques.questionGiveIntegral}" />奖励的积分：${ques.questionGiveIntegral }</span>
					</h4>
					<h4>
						提问的内容：<span style="margin-left: 410px;"><input
							type="hidden" name="questionTime" value="${ques.questionTime }" />提问的时间：<fmt:formatDate
								value="${ques.questionTime}" pattern="yyyy-MM-dd" /></span>
					</h4>
					<textarea cols="100px" rows="10px" readonly="readonly">${ques.questionContent }</textarea>
					<input type="hidden" name="questionContent"
						value="${ques.questionContent }" />
				</div>
			</div>
			<div class="row clearfix">
				<div class="col-md-12 column">
					<h4>回答内容：</h4>
					<div class="divcss5">
						<textarea name="answerContent" class="ckeditor"></textarea>
					</div>
					<a href="user/tHomePage"><button type="button"
							class="btn btn-default col-md-2"
							style="margin-left: 120px; margin-top: 20px;">返回首页</button></a>
					<button type="submit" class="btn btn-default col-md-2"
						style="margin-left: 50px; margin-top: 20px;">提交</button>
					<input type="hidden" name="questionId" value="${ques.studentId }" />
					<div class="panel-body"></div>
				</div>
			</div>
		</div>
	</form>
	<script src="third/ckeditor/ckeditor.js">
		CKEDITOR.replace("answerContent");
	</script>

	<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>

</html>