<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.*" %>

<!DOCTYPE html>
<html>
<link href="${pageContext.request.contextPath}/css/new.css" rel="stylesheet"  media="all">
<head>
<meta charset="UTF-8">
<title>Posters</title>
<link href="https://fonts.googleapis.com/css?family=Bitter:400,700" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
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
        <h1>投稿フォーム</h1>
        <p>日常の出来事や思い出を日記のように投稿しましょう。</p>
        <section>
          <div class="form">
            <form action="/Posters/CreateServlet" method="POST">
				<p>※タイトル</p>
				<input type=text size="40" name="title" class="title">
				<p>※メッセージ</p>
				<textarea name="message" cols="80" rows="8" class="message"></textarea>
				<p>※ の付いている項目は必須項目です。</p>
				<input type="submit" value="投稿">
			 </form>
            <div class="attention">
            </div>
          </div>
        </section>
      </div>
    </div>
  </div>
  <footer>
    <small>Posters.</small>
  </footer>
</body>
</html>