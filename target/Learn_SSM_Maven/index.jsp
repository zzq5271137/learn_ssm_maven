<%--
  Created by IntelliJ IDEA.
  User: zzq52
  Date: 2020/3/2
  Time: 3:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Learn SSM Maven</title>
</head>
<body>
<h1>Learn SSM Maven</h1>

<hr>

<form action="${pageContext.request.contextPath}/addTeacher">
    <label>
        姓名:
        <input type="text" name="teacher_name">
    </label>
    <input type="submit" value="提交">
</form>

</body>
</html>
