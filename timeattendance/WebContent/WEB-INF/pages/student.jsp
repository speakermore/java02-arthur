<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<base
	href="${pageContext.request.scheme }://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/" />
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>学生信息</title>

<link href="css/bootstrap.min.css" rel="stylesheet">

</head>

<body>
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-3 column">
				<span><a href="user/stuHomePage"><h1>返回首页</h1></a></span>
				<div class="row">
					<div class="column">
						<section class="panel panel-default">
							<h2 class="panel-heading">个人信息</h2>
							<ol class="list-unstyled"
								style="margin-left: 70px; font-size: 20px;">
								<li>姓名:${stu.studentName }</li>
								<li>性别:${stu.studentSex }</li>
								<li>班级:${stu.className }</li>
								<li>学号:${stu.studentNo }</li>
								<li>积分:${stu.integralNum }</li>
								<li>被点赞数:${stu.fabulousNum }</li>
							</ol>
						</section>
					</div>
				</div>
			</div>
			<div class="col-md-9 column" style="margin-top: 70px;">
				<div class="tabbable" id="tabs-743460">
					<ul class="nav nav-tabs">
						<li class="active on"><a href="#panel-713206"
							data-toggle="tab">填写日志</a></li>
						<li><a href="#panel-387867" data-toggle="tab">提问</a></li>
						<li><a href="#panel-345344" data-toggle="tab">打考勤</a></li>
					</ul>
					<div class="tab-content">
						<div class="tab-pane active" id="panel-713206">
							<p>
							<div class="row">
								<div class="col-md-7">
									<div class="column">
										${journal}
										<form action="user/jorunal" method="post">
											<div class="panel panel-body">
												<h3>日志填写：</h3>
												<div class="divcss5">
													<textarea name="test" class="ckeditor"></textarea>
												</div>
											</div>
											<div class="row col-md-6" style="margin-left: 550px;">
												<button type="submit" class="btn btn-default col-md-9">提交</button>
											</div>
										</form>
									</div>
								</div>
							</div>
							</p>
						</div>
						<div class="tab-pane" id="panel-387867">
							<p>
							<div class="row">
								<div class="col-md-7">
									<div class="column">
										${questions}
										<form action="question/context" method="post">
											<div class="panel panel-body">
												<h3>问题填写：</h3>
												奖励积分：<input name="questionGiveIntegral" style="width: 50px;" />
												<div class="divcss5" style="margin-top: 10px">
													<textarea name="questionContent" class="ckeditor"></textarea>
												</div>
											</div>
											<div class="row col-md-6" style="margin-left: 550px;">
												<button type="submit" class="btn btn-default col-md-9">提交</button>
											</div>
										</form>
									</div>
								</div>
							</div>
							</p>
						</div>
						<div class="tab-pane" id="panel-345344">
							<p>
							<div class="container">
								<div class="row clearfix">
									<div class="row">
										<div class="container">
											<div class="row">${attendance }
												<table class="table table-bordered"
													style="margin-left: 60px; margin-top: 40px; width: 500px;">
													<thead>
														<tr>
															<th>签到时间</th>
															<th>签退时间</th>
														</tr>
													</thead>
													<tbody>
														<tr>
															<td>Tanmay</td>
															<td>Bangalore</td>
														</tr>
														<tr>
															<td>Sachin</td>
															<td>Mumbai</td>
														</tr>
														<tr>
															<td>Uma</td>
															<td>Pune</td>
														</tr>
													</tbody>
												</table>
											</div>
											<div style="margin-top: -130px; margin-left: 600px;">
												<div>
													<a href="attendance/addattendanceSign">
														<button type="button" style="width: 150px;"
															class="btn btn-default">点击签到</button>
													</a>
												</div>
												<div>
													<a href="attendance/addattendanceOut">
														<button type="button"
															style="width: 150px; margin-top: 20px;"
															class="btn btn-default">点击签退</button>
													</a>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
		<script src="third/ckeditor/ckeditor.js">
			CKEDITOR.replace("test");
		</script>
		<script src="third/ckeditor/ckeditor.js">
			CKEDITOR.replace("questionContent");
		</script>

		<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
		<!-- Include all compiled plugins (below), or include individual files as needed -->
		<script src="js/bootstrap.min.js"></script>
</body>

</html>
