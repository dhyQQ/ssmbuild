<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/9/8 0008
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div>
    <form action="${pageContext.request.contextPath}/updateBook" method="post">
        <!--添加隐藏前端数据，用来传递数据给后端-->
        <input type="hidden" name="bookId" value="${QBook.bookId}" >
        书籍名称：
        <input  name="bookName" value="${QBook.bookName}" required><br>
        书籍数量：
        <input type="number" name="bookCounts" value="${QBook.bookCounts}" required><br>
        书籍简介：
        <input type="text" name="detail" style="width:500px" value="${QBook.detail}"></input><br>

        <input type="submit">
    </form>
</div>

</body>
</html>
