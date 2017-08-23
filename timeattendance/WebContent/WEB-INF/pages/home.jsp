<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<base
	href="${pageContext.request.scheme }://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html lang="zh-CN">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>首页</title>

<link href="css/bootstrap.min.css" rel="stylesheet">

<style>
body {
	padding-top: 100px;
}
#fixed{
	width:500px;
}
</style>
</head>

<body>
	<!--导航-->
	<nav role="navigation" class="navbar navbar-default navbar-fixed-top">
		<!--菜单-->
		<div class="container">
			<div class="row clearfix">
				<div class="col-md-12 column">
					<a class="navbar-brand"><img
						src="${pageContext.request.contextPath }/img/u=3212295203,1046740809&fm=26&gp=0.jpg"
						width="65" height="65" style="margin-top: -5px;" /></a>
					<ul class="nav nav-tabs" style="margin-top: 20px;">
						<li class="active"><a href="#" style="margin-top: 20px;">首页</a>
						</li>
						<li>
							<h4 style="margin-left: 400px;">
								<strong>北大青鸟</strong>&nbsp;&nbsp;<em>教育改变生活</em>
							</h4>
							<h5 style="margin-left: 780px; margin-top: -6px;">欢迎登录：${student.studentName}</h5>
						</li>
						<li class="dropdown pull-right"><a href="#"
							data-toggle="dropdown" class="dropdown-toggle"
							style="margin-top: 20px;">用户信息<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li><a href="user/personal">个人信息</a></li>
								<li><a href="user/updatePwd">修改密码</a></li>
							</ul></li>
					</ul>
				</div>
			</div>
		</div>
		<!--菜单结束-->
	</nav>
	<!--导航结束-->
	<!--正文-->
	<div class="container-fluid">
		<div class="row">
			<article class="col-sm-12">
				<!--最新资讯-->
				<section class="panel panel-default">
					<!--panel面板-->
					<div class="panel-heading">
						<h3 class="panel-title">学生点赞</h3>
					</div>
					<div class="panel-body">
						<div class="container">
							<div class="row clearfix">
								<div class="col-md-12 column">
									<div class="tabbable" id="tabs-471697">
										<ul class="nav nav-tabs">
											<li class="active"><a href="#panel-269994"
												data-toggle="tab">java01班</a></li>
											<li><a href="#panel-141635" data-toggle="tab">java02班</a>
											</li>
										</ul>
										<div class="tab-content">
											<div class="tab-pane active" id="panel-269994">
												<p>
												<ul class="list-unstyled">
													<li class="text-right"><span class="col-md-1">学生姓名</span>
														<span class="col-md-3">班级</span> <span class="col-md-5">被点赞次数：<span>23</span>次
													</span> <span class="glyphicon glyphicon-thumbs-up"></span>点赞</li>
													<li class="text-right"><span class="col-md-1">学生姓名</span>
														<span class="col-md-3">班级</span> <span class="col-md-5">被点赞次数：<span>23</span>次
													</span> <span class="glyphicon glyphicon-thumbs-up"></span>点赞</li>
													<li class="text-right"><span class="col-md-1">学生姓名</span>
														<span class="col-md-3">班级</span> <span class="col-md-5">被点赞次数：<span>23</span>次
													</span> <span class="glyphicon glyphicon-thumbs-up"></span>点赞</li>
												</ul>
												</p>
											</div>
											<div class="tab-pane" id="panel-141635">
												<p>
												<ul class="list-unstyled">
													<li class="text-right"><span class="col-md-1">学生姓名</span>
														<span class="col-md-3">班级</span> <span class="col-md-5">被点赞次数：<span>23</span>次
													</span> <span class="glyphicon glyphicon-thumbs-up"></span>点赞</li>
													<li class="text-right"><span class="col-md-1">学生姓名</span>
														<span class="col-md-3">班级</span> <span class="col-md-5">被点赞次数：<span>23</span>次
													</span> <span class="glyphicon glyphicon-thumbs-up"></span>点赞</li>
													<li class="text-right"><span class="col-md-1">学生姓名</span>
														<span class="col-md-3">班级</span> <span class="col-md-5">被点赞次数：<span>23</span>次
													</span> <span class="glyphicon glyphicon-thumbs-up"></span>点赞</li>
												</ul>
												</p>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</section>
			</article>
		</div>
		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapseTwo"> 点击查看所有提问的问题！ </a>
				</h4>
			</div>
			<div id="collapseTwo" class="panel-collapse collapse">
				<div class="panel-body">
					<div id="collapseOne" class="panel-collapse collapse in">
						<div class="row clearfix">
							<div class="col-md-12 column">
								<table class="table table-bordered">
									<thead>
										<tr>
											<th>姓名</th>
											<th>班级</th>
											<th>提问的问题</th>
											<th>提问的时间</th>
											<th>积分奖励</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${question}" var="qu">
											<tr>
												<td>${qu.studentName }</td>
												<td>${qu.className }</td>
												<td style="width:500px;"><div id="fixed" style="overflow: hidden;">${qu.questionContent }</div></td>
												<td>${qu.questionTime }</td>
												<td>${qu.questionGiveIntegral }</td>
												<td><a href="#">查看</a></td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
								<div class="row" style="text-align: center;">
									<ul class="pagination pagination-lg">
										<li><a href="#">共条记录/</a></li>
										<li><a href="#">首页</a></li>
										<li><a href="#">上一页</a></li>
										<li><a href="#">下一页</a></li>
										<li><a href="#">尾页</a></li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapseThree"> 点击查看我的日志！ </a>
				</h4>
			</div>
			<div id="collapseThree" class="panel-collapse collapse">
				<div class="panel-body">
					<div id="collapseOne" class="panel-collapse collapse in">
						<div class="row clearfix">
							<div class="col-md-12 column">
								<table class="table table-bordered">
									<thead>
										<tr>
											<th>日志内容</th>
											<th>日志时间</th>
											<th>点击查看</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>123</td>
											<td>123</td>
											<td><a href="#">查看</a></td>
										</tr>
									</tbody>
								</table>
								<div class="row" style="text-align: center;">
									<ul class="pagination pagination-lg">
										<li><a href="#">共条记录/</a></li>
										<li><a href="#">首页</a></li>
										<li><a href="#">上一页</a></li>
										<li><a href="#">下一页</a></li>
										<li><a href="#">尾页</a></li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>

</body>

</html>