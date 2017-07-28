<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<base href="${pageContext.request.scheme }://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/" />
<html lang="zh-CN">

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>老师查看考勤页面</title>

		<link href="css/bootstrap.min.css" rel="stylesheet">
		
	</head>

	<body>
		<div class="container-fluid" style="margin-left:25px;">
			<div class="panel-default">
				<div class="panel-title">
					<h2>信息列表</h2>
				</div>
				<div class="row col-md-12">
					<div class="panel-group" id="accordion">
						<div class="panel panel-default">
							<div class="panel-heading">
								<h4 class="panel-title">
								<a data-toggle="collapse" data-parent="#accordion" href="#collapseOne">
									查看所有学生的提问！
								</a>
							</h4>
							</div>
							<div id="collapseOne" class="panel-collapse collapse in">
								<div class="row clearfix">
									<div class="col-md-12 column">
										<table class="table table-bordered">
											<thead>
												<tr>
													<th>
														提问的问题
													</th>
													<th>
														学生姓名
													</th>
													<th>
														提问时间
													</th>
													<th>
														点击回答
													</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td>
														是
													</td>
													<td>
														TB - Monthly
													</td>
													<td>
														01/04/2012
													</td>
													<td>
														<a href="answer.jsp">点击回答</a>
													</td>
												</tr>
												<tr>
													<td>
														TB - Monthly
													</td>
													<td>
														01/04/2012
													</td>
													<td>
														Approved
													</td>
													<td>
														<a href="answer.jsp">点击回答</a>
													</td>
												</tr>
												<tr>
													<td>
														TB - Monthly
													</td>
													<td>
														02/04/2012
													</td>
													<td>
														Declined
													</td>
													<td>
														<a href="answer.jsp">点击回答</a>
													</td>
												</tr>
												<tr>
													<td>
														TB - Monthly
													</td>
													<td>
														03/04/2012
													</td>
													<td>
														Pending
													</td>
													<td>
														<a href="answer.jsp">点击回答</a>
													</td>
												</tr>
												<tr>
													<td>
														TB - Monthly
													</td>
													<td>
														04/04/2012
													</td>
													<td>
														Call in to confirm
													</td>
													<td>
														<a href="answer.jsp">点击回答</a>
													</td>
												</tr>
											</tbody>
										</table>
										<div class="row" style="text-align: center;">
											<ul class="pagination pagination-lg">
												<li>
													<a href="#">共10条记录，2/5页</a>
												</li>
												<li>
													<a href="#">首页</a>
												</li>
												<li>
													<a href="#">上一页</a>
												</li>
												<li>
													<a href="#">下一页</a>
												</li>
												<li>
													<a href="#">尾页</a>
												</li>
											</ul>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="panel panel-default">
							<div class="panel-heading">
								<h4 class="panel-title">
								<a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo">
									这里可以查看学生的考勤信息哦！
								</a>
							</h4>
							</div>
							<div id="collapseTwo" class="panel-collapse collapse">
								<div class="panel-body">
									<div class="col-md-4">
										<div class="input-group">
											请输入学生姓名：
											<input type="text">
										</div>
									</div>
									<div class="col-md-4">
										<div class="row">
											请选择学生班级：
											<select name="mont" style="height:25px;width:150px;">
												<option value="0">---请选择班级---</option>
												<option value="java01班">java01班</option>
												<option value="java02班">java02班</option>
											</select>
										</div>
									</div>
									<div class="row clearfix">
										<div class="btn-group btn-group-sm">
											<button type="button" class="btn btn-default">点击查询</button>
										</div>
									</div>
								</div>
								<div class="row clearfix">
									<div class="col-md-12 column">
										<table class="table table-bordered">
											<thead>
												<tr>
													<th>
														签到时间
													</th>
													<th>
														签退时间
													</th>
													<th>
														是否迟到
													</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td>
														是
													</td>
													<td>
														TB - Monthly
													</td>
													<td>
														01/04/2012
													</td>
												</tr>
												<tr>
													<td>
														TB - Monthly
													</td>
													<td>
														01/04/2012
													</td>
													<td>
														Approved
													</td>
												</tr>
												<tr>
													<td>
														TB - Monthly
													</td>
													<td>
														02/04/2012
													</td>
													<td>
														Declined
													</td>
												</tr>
												<tr>
													<td>
														TB - Monthly
													</td>
													<td>
														03/04/2012
													</td>
													<td>
														Pending
													</td>
												</tr>
												<tr>
													<td>
														TB - Monthly
													</td>
													<td>
														04/04/2012
													</td>
													<td>
														Call in to confirm
													</td>
												</tr>
											</tbody>
										</table>
										<div class="row" style="text-align: center;">
											<ul class="pagination pagination-lg">
												<li>
													<a href="#">共10条记录，2/5页</a>
												</li>
												<li>
													<a href="#">首页</a>
												</li>
												<li>
													<a href="#">上一页</a>
												</li>
												<li>
													<a href="#">下一页</a>
												</li>
												<li>
													<a href="#">尾页</a>
												</li>
											</ul>
										</div>
									</div>
								</div>
							</div>
						</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
							<a data-toggle="collapse" data-parent="#accordion" href="#collapseThree">
								这里可以查看学生个人一周的考勤率哦！
							</a>
						</h4>
						</div>
						<div id="collapseThree" class="panel-collapse collapse">
							<div class="panel-body">
								<div class="col-md-4">
									<div class="input-group">
										请输入学生姓名：
										<input type="text">
									</div>
								</div>
								<div class="col-md-4">
									<div class="row">
										请选择学生班级：
										<select name="mont" style="height:25px;width:150px;">
											<option value="0">---请选择班级---</option>
											<option value="java01班">java01班</option>
											<option value="java02班">java02班</option>
										</select>
									</div>
								</div>
								<div class="row clearfix">
									<div class="btn-group btn-group-sm">
										<button type="button" class="btn btn-default">点击查询</button>
									</div>
								</div>
								<div style="margin-top: 40px;"></div>
								<div class="panel panel-title">
									<span style="font-size: 30px;">该学生一周内的考勤率为：<span>99</span>%</span>
								</div>
							</div>
						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
							<a data-toggle="collapse" data-parent="#accordion" href="#collapseFour">
								这里可以查看班级一周的考勤率哦！
							</a>
						</h4>
						</div>
						<div id="collapseFour" class="panel-collapse collapse">
							<div class="panel-body">
								<div class="col-md-4">
									<div class="row">
										请选择学生班级：
										<select name="mont" style="height:25px;width:150px;">
											<option value="0">---请选择班级---</option>
											<option value="java01班">java01班</option>
											<option value="java02班">java02班</option>
										</select>
									</div>
								</div>
								<div class="row clearfix">
									<div class="btn-group btn-group-sm">
										<button type="button" class="btn btn-default">点击查询</button>
									</div>
								</div>
								<div style="margin-top: 40px;"></div>
								<div class="panel panel-title">
									<span style="font-size: 30px;">该班级一周内的考勤率为：<span>99</span>%</span>
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