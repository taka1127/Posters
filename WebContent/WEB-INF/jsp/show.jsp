<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>投稿内容</h2>

<br>
<form action="/Posters/DeleteServlet?POST_ID=<%= request.getAttribute("POST_ID") %>" method="POST">
<p>TITLE: <%= request.getAttribute("title") %></p>
<p>CONTENT: <%= request.getAttribute("message") %></p>
<br>
<input type="submit" value="削除">
 </form>
<br>
<a href="/Posters/LoginServlet">トップへ</a>
</body>
</html>