<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Posters</title>
</head>
<body>
 <h2>新規投稿</h2>

<p></p>

<form action="/Posters/CreateServlet" method="POST">
<p>タイトル:</p>
<input type=text name="title">
<p>メッセージ:</p>
<input type=text name="message">
<p></p>
<input type="submit" value="投稿">
 </form>

<a href="/Posters/LoginServlet">トップへ</a>
</body>
</html>