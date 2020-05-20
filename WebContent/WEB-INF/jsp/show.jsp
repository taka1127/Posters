<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<form action="delete?id=<%= request.getAttribute("id") %>" method="POST">
<p>ID: <%= request.getAttribute("post_id") %></p>
<p>TITLE: <%= request.getAttribute("message") %></p>
<p>CONTENT:</p>
<p><%= request.getAttribute("image") %></p>
<p><%= request.getAttribute("video") %></p>
<br>
 </form>
<br>
<a href="/Posters/LoginServlet">トップへ</a>
</body>
</html>