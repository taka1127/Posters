<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="model.User" %>
<%
User registerUser = (User)session.getAttribute("registerUser");
%>
<!DOCTYPE html>
<html>
<link href="${pageContext.request.contextPath}/css/registerConfirm.css" rel="stylesheet"  media="all">
<head>
<meta charset="UTF-8">
<title>Posters</title>
<link href="https://fonts.googleapis.com/css?family=Bitter:400,700" rel="stylesheet">
</head>
<body id="contact">

  <header>
    <div class="logo">

    </div>
    <nav>
      <ul class="global-nav">
        <li><a href="/Posters/RegisterServlet">戻る</a></li>
      </ul>
    </nav>
  </header>

  <div id="wrap">
    <div class="content">
      <div class="main-center">
        <h1>アカウント登録</h1>


          <div class="form">
            <p>下記のユーザーを登録します</p>
				<p>
				ログインID:<%= registerUser.getUserId() %><br>
				パスワード：<%= registerUser.getPass()%><br>
				メールアドレス：<%= registerUser.getEmail() %><br>
				ユーザー名：<%= registerUser.getName() %><br>
				</p>

            </div>
          </div>

      </div>
    </div>
  <p class="btn"> <a href="/Posters/RegisterServlet?action=done">登録</a></p>
</body>
</html>

