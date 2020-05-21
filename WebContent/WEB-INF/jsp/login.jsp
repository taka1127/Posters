<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link href="${pageContext.request.contextPath}/css/login.css" rel="stylesheet"  media="all">
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
        <li><a href="/Posters/IndexServlet">戻る</a></li>
      </ul>
    </nav>
  </header>

  <div id="wrap">
    <div class="content">
      <div class="main-center">
        <h1>ログイン</h1>
        <p>登録されたユーザーIDとパスワードを入力してください。</p>
        <section>
          <div class="form">
            <form action="/Posters/LoginServlet" method="post">
				※ ユーザID：　<input type="text" name="userId" class="userId"><br>
				※ パスワード：<input type="password" name="pass" class="pass"><br>
									<input type="submit" value="ログイン" class="botton">
			</form>
            <div class="attention">
              <p>※ の付いている項目は必須項目です。
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