<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加书籍</title>
</head>
<body>
 <div align="center">
     <form action="${pageContext.request.contextPath}/book/addBooks" method="post">
         书名:<input name="bookName" type="text" required><br>
         书量:<input name="bookCounts" type="text" required><br>
         描述:<input name="detail" type="text" required><br>
         <input type="submit" value="提交">
     </form>
 </div>
</body>
</html>
