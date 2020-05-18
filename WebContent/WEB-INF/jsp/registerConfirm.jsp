<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー登録</title>
</head>
<body>
<p>下記のユーザーを登録します</p>
<p>
ログインID:<c:out value="${userId}" /><br>
ユーザー名：：<c:out value="${name}" /><br>
メールアドレス：<c:out value="${email}" /><br>
パスワード：<c:out value="${pass}" /><br>
</p>
<a href="/Posters/RegisterServlet">戻る</a>
<a href="/Posters/RegisterServlet?action=done">登録</a>
</body>
</html>