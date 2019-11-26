<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/11/25
  Time: 12:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>city</title>
</head>
<body>

id-------------------name-------------------countrycode-------------------district-------------------population<br>
<hr>
<c:forEach var="v" items="${citylise}">
    ${v.id}-------------------${v.name}-------------------${v.countrycode}-------------------${v.district}-------------------${v.population}
    <br>
</c:forEach>

<a href="http://localhost:8080/ssm2019_11_21pm/c?page=1">首页</a>
<a href="http://localhost:8080/ssm2019_11_21pm/c?page=${pageInfo.prePage}">上一页</a>
现在是 ${pageInfo.pageNum} 页
<a href="http://localhost:8080/ssm2019_11_21pm/c?page=${pageInfo.nextPage}">下一页</a>
<a href="http://localhost:8080/ssm2019_11_21pm/c?page=${pageInfo.pages}">尾页</a>
<br>
<c:forEach items="${pageInfo.navigatepageNums}" var="v">
    <a href="http://localhost:8080/ssm2019_11_21pm/c?page=${v}">- ${v} -</a>
</c:forEach>
</body>
</html>
