<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍页面</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">

        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>书籍列表 --- 显示所有书籍</small>
                </h1>
            </div>
                <a href="${pageContext.request.contextPath}/book/toAddBook" class="btn btn-primary">添加书籍</a>
            <form action="${pageContext.request.contextPath}/book/queryBookById" method="post">
                书籍名:<input type="text" name="id" style="width: 200px;height: 28px" placeholder="请输入您想查询的书籍ID">
                <input type="submit" class="btn btn-primary" value="查询" style="width: 48px;height: 28px">
            </form>
            <form action="${pageContext.request.contextPath}/book/queryBookByName" method="post">
                书籍名:<input type="text" name="bookName" style="width: 200px;height: 28px" placeholder="请输入您想查询的书籍名称">
                <input type="submit" value="查询" class="btn btn-primary" style="width: 48px;height: 28px">
            </form>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>书籍名称</th>
                    <th>书籍数量</th>
                    <th>书籍详情</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                    <c:forEach var="book" items="${books}">
                        <tr>
                            <td>${book.bookName}</td>
                            <td>${book.bookCounts}</td>
                            <td>${book.detail}</td>
                            <td>
                                <a href="${pageContext.request.contextPath}/book/deleteBookById?id=${book.bookID}" class="delete">删除</a>|
                                <a href="${pageContext.request.contextPath}/book/toUpdate?id=${book.bookID}">修改</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
<script src="${pageContext.request.contextPath}/static/JQuery.js"></script>
<script>
    $(function () {
        $("a.delete").click(function () {
            var text = $(this).parent().parent().find("td:first").text();
            return confirm("您确定要删除["+text+"]吗?");
        })
    })
</script>
</body>
</html>
