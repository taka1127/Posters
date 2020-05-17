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


</body>
</html>