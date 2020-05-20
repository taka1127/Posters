<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Posters</title>
</head>
<body>
<p>ようこそ<c:out value="${userId }" />さん</p>
<a href="/Posters/NewServlet">投稿する</a>
<a href="/Posters/IndexServlet">ログアウト</a>
<c:forEach var="post" items="${postList }">
	<p><c:out value="${post.post_id }"></c:out><c:out value="${post.message}"></c:out>:<c:out value="${post.image }"></c:out><c:out value="${post.video }"></c:out>
		<a href="/Posters/ShowServlet?POST_ID=${post.post_id }">詳細</a>
	</p>
</c:forEach>




</body>
</html>