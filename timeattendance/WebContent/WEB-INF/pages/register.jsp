<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<base href="${pageContext.request.scheme }://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/" />
<!DOCTYPE html>
<html lang="zh-CN">

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>注册</title>

		<link href="css/bootstrap.min.css" rel="stylesheet">

		<style type="text/css">
			body {
				margin: 50px;
			}
		</style>
	</head>

	<body>
		<div class="row col-md-12">
			<div class="col-md-2" style="margin-left: 30px;">
				<span>
					<a href="user/tHomePage"><h1>返回首页</h1></a>
				</span>
			</div>
			${register}
		</div>
		<div class="container col-md-5" style="margin-left: 380px;">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h2 style="text-align: center;"><strong>注册</strong></h2>
				</div>
				<div class="panel-body">
					<form action="user/register" role="form" class="form-horizontal" method="post">
						<div class="form-group">
							<label for="studentName" class="control-label col-xs-4">姓名：</label>
							<div class="col-xs-6">
								<input type="text" class="form-control" name="studentName"/>
							</div>
						</div>
						<div class="form-group">
							<label for="studentSex" class=" control-label col-xs-4">性别：</label>
							<div class="col-xs-6">
								<input type="text" class="form-control" name="studentSex"/>
							</div>
						</div>
						<div class="form-group">
							<label for="newPwd" class=" control-label col-xs-4">班级：</label>
							<div class="col-xs-6">
								<select name="classId" style="width:218px;height:35px;">
									<option>---请选择---</option>
									<c:forEach items="${stuClass }" var="st">
									<option value="${st.id }">${st.className }</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label for="confirmPwd" class=" control-label col-xs-4">学号：</label>
							<div class="col-xs-6">
								<input type="text" class="form-control" name="studentNo"/>
							</div>
						</div>
						<div class="form-group">
							<label for="newPwd" class=" control-label col-xs-4">密码：</label>
							<div class="col-xs-6">
								<input type="password" class="form-control" name="studentPwd"/>
							</div>
						</div>
						<div class="form-group">
							<div class="col-xs-offset-4">
								<input type="submit" class="btn btn-primary col-xs-5" style="margin-left:35px;" value="注册" />
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