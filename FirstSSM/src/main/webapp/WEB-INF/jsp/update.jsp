<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/6/30
  Time: 22:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新书籍</title>
</head>
<body>
<div align="center">
    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <input name="bookID" type="hidden" value="${QBooks.bookID}">
        书名:<input name="bookName" type="text" value="${QBooks.bookName}"><br>
        书量:<input name="bookCounts" type="text" value="${QBooks.bookCounts}"><br>
        描述:<input name="detail" type="text" value="${QBooks.detail}"><br>
        <input type="submit" value="提交">
    </form>
</div>
</body>
</html>
