<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<link href="${pageContext.request.contextPath}/css/top.css" rel="stylesheet"  media="all">
<head>
<meta charset="UTF-8">
<title>Posters</title>
<link href="https://fonts.googleapis.com/css?family=Bitter:400,700" rel="stylesheet">
</head>
<body id="posters">

  <header>
    <div class="logo">
      <h1>ようこそ<c:out value="${userId }" />さん</h1>
    </div>

    <nav>
      <ul class="global-nav">
        <li><a href="/Posters/NewServlet">投稿する</a></li>
        <li><a href="/Posters/IndexServlet">ログアウト</a></li>
      </ul>
    </nav>
  </header>
  <!-- header終わり -->

  <!-- wrap始まり -->
  <div id="wrap" class="clearfix">
    <div class="content">
      <div class="main">
        <h1>Posters</h1>
        <p>これまでに投稿したメッセージを掲載しています。</p>
        <section id="city">
          <h2 class="icon">タイトル</h2>
          <ul class="clearfix post-list">
            <li><c:forEach var="post" items="${postList }">
            <p><c:out value="${post.title}"></c:out><a href="/Posters/ShowServlet?POST_ID=${post.post_id}">詳細</a></p>
			</c:forEach>
			</li>
          </ul>
        </section>
       </div>
    </div>
  </div>

  <!-- wrap終わり -->

  <!-- footer始まり -->
  <footer>
    <small>Posters.</small>
  </footer>
  <!-- footer終わり -->

</body>
</html>

