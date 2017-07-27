<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>登录</title>

<link href="../../css/bootstrap.min.css" rel="stylesheet" />

</head>
<body>
	<article class="container">
		<div class="collapse navbar-collapse nav-divider" id="java02_menu">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="">学生登录</a></li>
				<li><a href="">教师登录</a></li>
			</ul>
		</div>
		<div class="container">
			<div class="row clearfix">
				<div class="col-md-12 column">
					<div class="row clearfix">
						<div class="col-md-7 column"></div>
						<div class="col-md-5 column  panel panel-default">
							<form action="arthur/user/findByTeacherNameAndTeacherPwd"
								role="form" class="form-horizontal">
								<div style="text-align:center">
									<span><h1>学生登录</h1></span>
								</div>
								<div class="form-group">
									<label for="uName" class="control-label col-xs-4">姓名:</label>
									<div class="col-xs-6">
										<input id="uName" type="text" class="form-control" />
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-xs-4">密码 :</label>
									<div class="col-xs-6">
										<input type="password" class="form-control" />
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-xs-4">确认密码 :</label>
									<div class="col-xs-6">
										<input type="password" class="form-control" />
									</div>
								</div>
								<div class="form-group">
									<div class="col-xs-offset-5">
										<a href="home">
											<input type="submit" value="登录" class="btn btn-primary col-xs-4" />
										</a>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</article>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="../../js/bootstrap.min.js"></script>
</body>
</html>