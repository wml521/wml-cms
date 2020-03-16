<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的文章</title>

</head>
<body>
	<c:forEach items="${list }" var="article">
		<div class="media">
			<img alt="..." src="/pic/${article.picture }" class="mr-3 rounded" style="width: 200px;height: 150px">
			<div class="media-body">
				<h5 class="mt-0">${article.title }</h5>
				<div style="float: right;padding-top: 60px">
     			<!-- Button trigger modal -->
				<button type="button" onclick="articleDetail(${article.id })" class="btn btn-link" data-toggle="modal" data-target="#exampleModalLong">
  					详情
				</button>
    </div>
			</div>
		</div>
		<hr>
	</c:forEach>
	
	<jsp:include page="/WEB-INF/view/common/pages.jsp"/>
	
	<!-- Modal -->
<div class="modal fade" id="exampleModalLong" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle" aria-hidden="true">
  <div class="modal-dialog modal-lg" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLongTitle"><span id="title"></span></h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body" id="content">
       
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
</div>
</body>

<script type="text/javascript">
function goPage(page){
	//在中间区域加载
	$("#center").load("/my/articles?page="+page);
}

function articleDetail(id) {
	$.get(
		"/my/articleDetail",
		{id:id},
		function(article) {
			$("#title").empty();
			$("#content").empty();
			$("#title").append(article.title);
			$("#content").append(article.content);
		}
	)
}
</script>
</html>