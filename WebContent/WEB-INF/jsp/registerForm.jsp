<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー登録</title>
</head>
<body>
<form action="/Posters/RegisterServlet" method="post">
ログインID：<input type ="text" name = "userId"><br>
名前：<input type ="text" name = "name"><br>
メールアドレス：<input type ="text" name = "email"><br>
パスワード：<input type ="password" name = "pass"><br>
<input type="submit" value="	確認">
</form>

</body>
</html>