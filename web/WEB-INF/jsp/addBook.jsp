<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div>
    <form action="${pageContext.request.contextPath}/addBook" method="post">
        书籍名称：
        <input type="text" name="bookName" required><br>
        书籍数量：
        <input type="number" name="bookCounts" required><br>
        书籍简介：
        <input type="text" name="detail" style="width:500px" ></input><br>

        <input type="submit">
    </form>
</div>

</body>
</html>
