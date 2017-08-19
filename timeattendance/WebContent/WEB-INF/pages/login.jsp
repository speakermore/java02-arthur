<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<base href="${pageContext.request.scheme }://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/" />
<!DOCTYPE html>
<html lang="zh-CN">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>登录</title>

<link href="css/bootstrap.min.css" rel="stylesheet" />
<style type="text/css">
	body {
		margin: 50px;
	}
</style>
</head>
<body>
	<div class="container col-md-5" style="margin-left: 380px;margin-top: 120px;">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h2 style="text-align: center;"><strong>登录</strong></h2>
				</div>
				<div class="panel-body">
					<form action="user/login" role="form" class="form-horizontal"  method="post">
						<div class="form-group">
							<label for="stuname" class="control-label col-xs-4">用户名：</label>
							<div class="col-xs-6">
								<input type="text" class="form-control" name="name"/>
							</div>
						</div>
						<div class="form-group">
							<label for="newPwd" class=" control-label col-xs-4">密码：</label>
							<div class="col-xs-6">
								<input type="password" class="form-control" name="pwd"/>
							</div>
						</div>
						<div class="form-group">
							<div class="col-xs-offset-4">
								<input type="submit" class="btn btn-primary col-xs-5" style="margin-left:35px;" value="登录" />
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
</body>
</html>