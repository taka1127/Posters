<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


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
<p>MESSAGE:</p>
<input type=text name="message">
<p>IMAGE:</p>
<input type="file" name="image" accept="image/*" multiple>
<p>VIDEO:</p>
<input type="file" name="video" accept="video/*" multiple>
<p></p>
<input type="submit" value="投稿">
 </form>

<a href="/Posters/LoginServlet">トップへ</a>
</body>
</html>