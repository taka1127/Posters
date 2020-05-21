<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link href="${pageContext.request.contextPath}/css/registerForm.css" rel="stylesheet"  media="all">
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
        <h1>アカウント登録</h1>

        <section>
          <div class="form">
            <form action="/Posters/RegisterServlet" method="post">
				※ログインID：<input type ="text" size="40" name = "userId"><br>
				※パスワード：<input type ="password" size="40" name = "pass"><br>
				※メールアドレス：<input type ="email" size="40" name = "email"><br>
				※ユーザー名：<input type ="text" size="40" name = "name"><br>
				<input type="submit" value="	確認" class="button">
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