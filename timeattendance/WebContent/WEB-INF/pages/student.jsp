<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<base href="${pageContext.request.scheme }://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/" />
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
					<span>
						<a href="home.jsp"><h1>返回首页</h1></a>
					</span>
					<div class="row">
						<div class="column">
							<section class="panel panel-default">
								<h2 class="panel-heading">个人信息</h2>
								<ol class="list-unstyled" style="margin-left: 70px; font-size: 20px;">
									<li>
										姓名
									</li>
									<li>
										性别
									</li>
									<li>
										班级
									</li>
									<li>
										学号
									</li>
									<li>
										积分
									</li>
									<li>
										点赞数
									</li>
								</ol>
							</section>
						</div>
					</div>
			</div>
			<div class="col-md-9 column" style="margin-top: 70px;">
						<div class="tabbable" id="tabs-743460">
							<ul class="nav nav-tabs">
								<li class="active on">
									 <a href="#panel-713206" data-toggle="tab" >填写日志</a>
								</li>
								<li>
									 <a href="#panel-124822" data-toggle="tab">修改日志</a>
								</li>
								<li>
									 <a href="#panel-387867" data-toggle="tab" >提问</a>
								</li>
								<li>
									 <a href="#panel-345344" data-toggle="tab" >打考勤</a>
								</li>
							</ul>
							<div class="tab-content">
								<div class="tab-pane active" id="panel-713206">
									<p>
										<div class="row">
											<div class="col-md-7">
												<div class="column">
													<div class="panel panel-body">
													<form action="arthur/journal/addjournal" method="post">
													<h3>日志填写：</h3>
														<div class="divcss5">
															<textarea cols="100px" rows="10px" name="journalContent">${success }</textarea>
														</div>
													</div>
													<span class="wocao">
														<div class="row col-md-6" style="margin-left: 550px;">
															<button type="submit" class="btn btn-default col-md-9">提交</button>
														</div>
													</span>
													</form>
												</div>                 
											</div>
										</div>
									</p>
								</div>
								<div class="tab-pane" id="panel-124822">
									<p>
										<div class="row">
											<div class="col-md-7">
												<div class="column">
													<div class="panel panel-body">
													<h3>日志修改：</h3>
														<div class="divcss5">
															<textarea cols="100px" rows="10px" ></textarea>
														</div>
													</div>
													<span class="wocao">
														<div class="row col-md-6" style="margin-left: 550px;">
															<button type="button" class="btn btn-default col-md-9">提交</button>
														</div>
													</span>
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
													<div class="panel panel-body">
													<form action="arthur/question/student" method="post">
													<h3>问题填写：</h3>
														<div class="divcss5">
															<textarea cols="100px" rows="10px" name="questionContent">${success }</textarea>
														</div>
													</div>
													<span class="wocao">
														<div class="row col-md-6" style="margin-left: 550px;">
															<button type="submit" class="btn btn-default col-md-9">提交</button>
														</div>
													</span>
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
														<div class="row">
															<div class="column col-md-6">
																<table class="table table-bordered" style="margin-left: 70px;margin-top: 30px;">
																	<thead>
																		<tr>
																			<th>
																				签到时间
																			</th>
																			<th>
																				请点击
																			</th>
																		</tr>
																		
																	</thead>
																	<tbody>
																		<form action="arthur/attendance/addStudentSign" method="post">
																			<tr>
																				<td>
																					<input readonly="readonly" value="${sign.studentSign }"/>
																				</td>
																				<td>
																					<button type="subimt">签到</button>
																				</td>
																			</tr>
																		</form>
																	</tbody>
																	<thead>
																		<tr>
																			<th>
																				签退时间
																			</th>
																			<th>
																				请点击
																			</th>
																		</tr>
																	</thead>
																	<tbody>
																		<form action="#" method="post">
																			<tr>
																				<td>
																					<input readonly="readonly" name=""/>
																				</td>
																				<td>
																					<button type="button">签退</button>
																				</td>
																			</tr>
																		</form>
																	</tbody>
																</table>
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
		<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
		<!-- Include all compiled plugins (below), or include individual files as needed -->
		<script src="js/bootstrap.min.js"></script>
	</body>

</html>
