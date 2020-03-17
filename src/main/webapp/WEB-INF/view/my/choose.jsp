<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
	评选页面
	
		<table class="table">
			<c:forEach items="${list }" var="c">
				<tr>
					<td>${c.title }
						<input type="hidden" name="articleId" value="${c.id }">
					</td>
					<td>A<input type="checkbox" name="option" value="A"> B<input
						type="checkbox" name="option" value="B"> C<input
						type="checkbox" name="option" value="C"> D<input
						type="checkbox" name="option" value="D">
					</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="10">
					<button onclick="add()" type="button">提交</button>
				</td>
			</tr>
		</table>
	

	<script type="text/javascript">
		function add() {
			//alert(1);
			var options = $("[name=option]:checked").map(function() {
				return this.value;
			}).get().join();
			var articleIds = $("[name=articleId]").map(function() {
				return this.value;
			}).get().join();
			alert(options);
			alert(articleIds);
			$.post(
				"/my/addChooseResult",
				{options:options,articleIds:articleIds},
				function(flag) {
					if (flag) {
						alert("提交成功");
					}else {
						alert("提交失败");
					}
				},"json"
			)
		}
	</script>
</body>
</html>