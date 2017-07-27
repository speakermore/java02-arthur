<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>修改密码</title>

		<link href="../../css/bootstrap.min.css" rel="stylesheet">

		<style type="text/css">
			body {
				margin: 50px;
			}
		</style>
	</head>

	<body>
		<div class="container col-md-5" style="margin-left: 350px;margin-top: 80px;">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title">修改登录密码</h3>
				</div>
				<div class="panel-body">
					<form action="" role="form" class="form-horizontal">
						<div class="form-group">
							<label for="oldPwd" class="control-label col-xs-4">旧密码：</label>
							<div class="col-xs-6">
								<input type="password" id="oldPwd" class="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="newPwd" class=" control-label col-xs-4">新密码：</label>
							<div class="col-xs-6">
								<input type="password" id="newPwd" class="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="confirmPwd" class=" control-label col-xs-4">确认密码：</label>
							<div class="col-xs-6">
								<input type="password" id="confirmPwd" class="form-control" />
							</div>
						</div>
						<div class="form-group">
							<div class="col-xs-offset-4">
								<input type="submit" class="btn btn-primary col-xs-5" style="margin-left:35px;" value="提交" />
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
		<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
		<!-- Include all compiled plugins (below), or include individual files as needed -->
		<script src="../../js/bootstrap.min.js"></script>
	</body>

</html>