<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>今日头条-个人中心</title>
<link rel="stylesheet" type="text/css"
	href="/resource/bootstrap.min.css" />
<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/resource/bootstrap.min.js"></script>
</head>
<body>
	<div class="container-fulid">
		<div class="row">
			<div class="col-md-12" style="background-color: rgb(80,180,196); height: 60px">
				<img alt="" src="/resource/images/2.jpg" style="height: 55px;padding-top: 3px">
				<span style="color: white">今日头条-个人中心</span>
			</div>
		</div>
		<div class="row">
			<!-- 左侧菜单 -->
			<div class="col-md-2">
				<ul class="list-group">
					<li class="list-group-item active"><a href="#" data="/my/articles"><font color="red">我的文章</font></a></li>
					<li class="list-group-item"><a href="#" data="/my/publish"><font color="red">发布文章</font></a></li>
					<li class="list-group-item"><a href="#"><font color="red">我的收藏</font></a></li>
					<li class="list-group-item"><a href="#"><font color="red">我的评论</font></a></li>
					<li class="list-group-item"><a href="#"><font color="red">个人信息</font></a></li>
				</ul>
			</div>
			<!-- 内容显示区 -->
			<div class="col-md-10" id="center">
				<!-- 加载富文本编辑器的样式 -->
				<div style="display: none">
					<jsp:include page="/resource/kindeditor/jsp/demo.jsp"></jsp:include>
				</div>
				
			</div>
		</div>
	</div>
	
<script type="text/javascript">
	$(function() {
		//默认去我的文章
		$("#center").load("/my/articles");
		$("li").click(function() {
			var url = $(this).children().attr("data");
			//删除样式
			$("li").removeClass("active");
			//当前的li选中
			$(this).addClass("list-group-item active");
			//显示菜单栏对应的内容
			$("#center").load(url);
		})
	})
</script>
</body>
</html>