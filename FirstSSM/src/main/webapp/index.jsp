<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>首页</title>
    <style type="text/css">
        h3{
            width: 180px;
            height: 38px;
            margin: 100px auto;
            text-align: center;
            line-height: 38px;
            background: deepskyblue;
            border-radius: 5px;
        }
        a{
            text-decoration: none;
            color: black;
            font-size: 18px;
        }
    </style>
</head>
<body>

<h3><a href="${pageContext.request.contextPath}/book/allBooks">进入书籍页面</a></h3>
<h4><a href="${pageContext.request.contextPath}/User/login.jsp">登录页面</a></h4>
</body>
</html>