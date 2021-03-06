<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>今日头条-管理员中心</title>
<link rel="stylesheet" type="text/css"
	href="/resource/bootstrap.min.css" />
<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
<!-- 先引入jquery,再引入bootstrap -->
<script type="text/javascript" src="/resource/popper.min.js"></script>
<script type="text/javascript" src="/resource/bootstrap.min.js"></script>
</head>
<body>
	<div class="container-fulid">
		<div class="row">
			<div class="col-md-12"
				style="background-color: rgb(80, 180, 196); height: 60px">
				<img src="/resource/images/3.jpg" width="60px" height="60px">
				<font color="white">今日头条-管理员中心</font>

				<div class="btn-group dropleft" style="float: right">
					<button type="button" class="btn btn-link dropdown-toggle"
						data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
						<font color="white" size="2px">登录信息</font>
					</button>
					<div class="dropdown-menu">
						<a class="dropdown-item" href="#">${sessionScope.admin.username }</a>
						<a class="dropdown-item" href="/passport/logout">注销</a>
					</div>
				</div>
			</div>
		</div>
		<div class="row" style="height: 550px">
			<!-- 左侧菜单 -->
			<div class="col-md-2 rounded"
				style="background-color: #abe; text-align: center; margin-left: 10px; padding-top: 10px"" >
				<nav class="nav flex-column">
					<a class="list-group-item active" href="#" data="/admin/articles">文章审核</a>
					<a class="list-group-item" href="#" data="/admin/users">用户管理</a> <a
						class="list-group-item" href="#">栏目管理</a> <a
						class="list-group-item" href="#">分类管理</a> <a
						class="list-group-item" href="#">系统设置</a> <a
						class="list-group-item" href="#" data="/admin/choose">评选管理</a>
				</nav>
			</div>
			<!-- 内容显示区 -->
			<div class="col-md-9" id="center"></div>
		</div>
	</div>

	<script type="text/javascript">
		//点击样式的切换
		//为 li 添加点击事件
		$(function() {
			//默认显示我的文章
			$("#center").load("/admin/articles");
			$("a").click(function() {
				var url = $(this).attr("data");
				//去除样式
				$("a").removeClass("active");
				//让当前点击的li 添加选中样式
				$(this).addClass("list-group-item active")
				//在中间区域显示url的内容
				$("#center").load(url);
			})

		})
	</script>
</body>
</html>