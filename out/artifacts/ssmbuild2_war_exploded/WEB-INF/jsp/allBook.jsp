<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/9/8 0008
  Time: 20:00
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>allBook</title>
</head>
<body>

<div align="center">

    <h3>书籍列表——————显示所有书籍</h3>

    <div style="display: inline-block">
        <a href="${pageContext.request.contextPath}/toAddBook"><input type="button" value="添加书籍"></a>
        <a href="${pageContext.request.contextPath}/allBook"><input type="button" value="查询所有书籍"></a>
    </div>
    <div style="display: inline-block">
        <form action="${pageContext.request.contextPath}/queryBookByName" method="post">
            <input type="text" name="bookName" placeholder="请输入查询书籍名称">
            <input type="submit" value="查询">
            <span>${err}</span>
        </form>
    </div>


    <table border="0" >
        <tr>
            <th>书籍编号</th>
            <th>书籍名称</th>
            <th>剩余数量</th>
            <th>书籍介绍</th>
            <th>操作</th>
        </tr>

        <c:forEach var="book" items="${bookList}">
        <tr align="center">
            <td>${book.bookId}</td>
            <td>${book.bookName}</td>
            <td>${book.bookCounts}</td>
            <td>${book.detail}</td>
            <td>
                <a href="${pageContext.request.contextPath}/toUpdateBook/${book.bookId}">修改</a>
                &nbsp;|&nbsp;
                <a href="${pageContext.request.contextPath}/deleteBook/${book.bookId}">删除</a>
            </td>
        </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
