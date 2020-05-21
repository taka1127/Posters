<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<link href="${pageContext.request.contextPath}/css/show.css" rel="stylesheet"  media="all">
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
        <li><a href="/Posters/LoginServlet">ログイン画面へ</a></li>
      </ul>
    </nav>
  </header>

  <div id="wrap">
    <div class="content">
      <div class="main-center">
        <h1>投稿内容</h1>


          <form action="/Posters/DeleteServlet?POST_ID=<%= request.getAttribute("POST_ID") %>" method="POST">
			<p>タイトル</p>
			 <p><%= request.getAttribute("title") %></p>
			<p>メッセージ </p>
			<p><%= request.getAttribute("message")%></p>
			<input type="submit" value="削除">
		  </form>
			<br>
          </div>

      </div>
    </div>

</body>
</html>