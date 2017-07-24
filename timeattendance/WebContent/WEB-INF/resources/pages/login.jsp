<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>登录</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
		<link href="css/main.css" rel="stylesheet" />
   
  </head>
  <body>
  	<article class="container">
	  	<form action="message/add" role="form" class="form-horizontal " style="margin-top: 100px;">
	  		<div class="form-group">
	  			<label for="uName" class="control-label col-xs-4">姓名:</label>
	  			<div class="col-xs-3">
	  				<input id="uName" type="text" class="form-control"/>
	  			</div>
	  		</div>
	  		<div class="form-group">
	  			<label class="control-label col-xs-4">密码 :</label>
	  			<div class="col-xs-3">
	  				<input type="password" class="form-control"/>
	  			</div>
	  		</div>
	  		<div class="form-group">
	  			<label class="control-label col-xs-4">确认密码 :</label>
	  			<div class="col-xs-3">
	  				<input type="password" class="form-control"/>
	  			</div>
	  		</div>
	  		<div class="form-group">
	  			<div class="col-xs-offset-6">
	  				<input type="submit" value="注册" class="btn btn-primary col-xs-1"/>
      				<input type="submit" value="登录" class="btn btn-primary col-xs-1"/>
      			</div>
  			</div>
	  	</form>
  	</article>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>