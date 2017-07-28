<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<base href="${pageContext.request.scheme }://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/" />
<html lang="zh-CN">

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>回答页面</title>

		<link href="css/bootstrap.min.css" rel="stylesheet">
		
		<style>
			.divcss5 {
				word-wrap: break-word
			}
			.a{
				float:right
			}
		</style>
	</head>

	<body>
		<div class="row">
			<div class="col-md-6">
				<div class="column">
					<div class="panel-default panel-title">
						<h4 class="panel-heading">提问者：<span>张三</span><span class="a">奖励的积分：<span>100</span></span></h4>
					</div>
					<div class="panel panel-body">
						<h4 class="panel">提问的问题：</h4>
						<div class="divcss5">
							<textarea cols="85px" rows="10px" readonly="readonly">有些事，轻轻放下，未必不是轻松。有些人，深深记住，未必不是幸福。有些痛，淡淡看开，未必不是历练。坎坷路途，给身边一份温暖，风雨人生，给自己一个微笑。生活，就是体谅和理解，把快乐装在心中，静静融化，慢慢扩散！
							</textarea>
						</div>
					</div>
					<a href="home">
						<div class="row col-md-6" style="margin-left: 200px;">
							<button type="button" class="btn btn-default col-md-9">返回首页</button>
						</div>
					</a>
				</div>
			</div>
			<div class="col-md-6">
				<div class="column">
					<div class="panel-default panel-title">
						<h4 class="panel-heading">回答者：<span>沙雕</span></h4>
					</div>
					<div class="panel panel-body">
						<h4 class="panel">回答的内容：</h4>
						<div class="divcss5">
							<textarea cols="85px" rows="10px">人生就是这样，想要拥有却不能够拥有，或许会使人们自暴自弃。确实失去，就要越坚强，过去的事就让它过去，无法挽回过去。就让我们坚强起来，失去了一个人，至少还有其他人，不会让我们觉得寂寞的！
							</textarea>
						</div>
					</div>
					<a href="home">
						<div class="row col-md-6" style="margin-left: 200px;">
							<button type="button" class="btn btn-default col-md-9">提交</button>
						</div>
					</a>
				</div>
			</div>
		</div>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
		<!-- Include all compiled plugins (below), or include individual files as needed -->
		<script src="js/bootstrap.min.js"></script>
	</body>

</html>