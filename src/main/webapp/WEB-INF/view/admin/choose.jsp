<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="/resource/bootstrap.min.css" />
<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
<!-- 先引入jquery,再引入bootstrap -->
<script type="text/javascript" src="/resource/popper.min.js"></script>
<script type="text/javascript" src="/resource/bootstrap.min.js"></script>
</head>
<body>
	<div class="form-group form-inline" style="padding-top: 10px">
		<button type="button" class="btn btn-warning btn-sm"
			onclick="selectChoose()">更新评选项</button>
		&nbsp;&nbsp;
		<button type="button" class="btn btn-info btn-sm">更新评选结果</button>
	</div>

	<script type="text/javascript">
		function selectChoose() {
			//alert(1);
			$.post("/admin/updateChoose", function(flag) {
				if (flag) {
					alert("更新成功");
				} else {
					alert("更新失败");
				}
			}, "json")
		}
	</script>
</body>
</html>