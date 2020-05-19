<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="model.User" %>
<%
User registerUser = (User)session.getAttribute("registerUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Posters</title>
</head>
<body>
<p>下記のユーザーを登録します</p>
<p>
ログインID:<%= registerUser.getUserId() %><br>
パスワード：<%= registerUser.getPass()%><br>
メールアドレス：<%= registerUser.getEmail() %><br>
ユーザー名：<%= registerUser.getName() %><br>

</p>
<a href="/Posters/RegisterServlet">戻る</a>
<a href="/Posters/RegisterServlet?action=done">登録</a>
</body>
</html>