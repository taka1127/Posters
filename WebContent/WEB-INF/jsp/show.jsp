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
<h2>MEMO DETAIL</h2>
 <p>This app is made by Java Servlet and JSP.</p>


<br>
<form action="/Posters/DeleteServlet?POST_ID=<%= request.getAttribute("POST_ID") %>" method="POST">
<p>ID: <%= request.getAttribute("post_id") %></p>
<p>TITLE: <%= request.getAttribute("message") %></p>
<p>CONTENT:</p>
<p><%= request.getAttribute("image") %></p>
<p><%= request.getAttribute("video") %></p>
<br>
<input type="submit" value="削除">
 </form>
<br>
<a href="/Posters/LoginServlet">トップへ</a>
</body>
</html>