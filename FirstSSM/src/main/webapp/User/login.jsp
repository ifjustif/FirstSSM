<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<div align="center">
<form action="${pageContext.request.contextPath}/user/login" method="post">
    账号：<input type="text" name="user_name" placeholder="账号/手机号"><br>
    密码：<input type="password" name="user_password" placeholder="账号密码"><br>
    <input type="submit" value="登录">
</form>
</div>
</body>
</html>
