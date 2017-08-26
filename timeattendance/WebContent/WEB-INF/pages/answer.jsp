<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<base
	href="${pageContext.request.scheme }://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/" />
<html lang="zh-CN">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>回答页面</title>

<link href="css/bootstrap.min.css" rel="stylesheet">

</head>

<body>
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<h4>
					提问的时间：<span style="margin-left: 200px;">奖励的积分：</span>
				</h4>
				<h4>
					我的提问内容：
				</h4>
				<textarea cols="100px" rows="10px" readonly="readonly"></textarea>
			</div>
		</div>
		<div class="row clearfix">
			<div class="col-md-12 column">
				<h4>
					回答者：<span style="margin-left: 200px;">班级：</span>
				</h4>
				<h4>回答内容：</h4>
				<div class="divcss5">
					<textarea cols="100px" rows="10px" readonly="readonly"></textarea>
				</div>
			</div>
		</div>
		<a href="user/stuHomePage"><button type="button"
				class="btn btn-default col-md-2"
				style="margin-left: 230px; margin-top: 20px;">返回首页</button></a>
		<div class="panel-body"></div>
	</div>


	<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>

</html>