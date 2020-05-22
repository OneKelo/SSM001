<%--
  Created by IntelliJ IDEA.
  User: XM
  Date: 2020/5/19
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>主界面</h1>
    <form:form method="post" action="" modelAttribute="customer">
    <table border="1" cellpadding="5" cellspacing="0">
        <tr>
            <td width="5%" align="center" id="All">全选</td>
            <td width="15%" align="center">编号</td>
            <td width="15%" align="center">名称</td>
            <td width="18%" align="center">客户信息来源</td>
            <td width="18%" align="center">客户所属行业</td>
            <td width="23%" align="center">创建日期</td>
        </tr>
        <c:forEach items="${list}" var="cus">
        <tr>
            <td><input type="checkbox" name="customerId"></td>
            <td>${cus.customerId}</td>
            <td>${cus.customerName}</td>
            <td>${cus.customerSourse}</td>
            <td>${cus.customerIndustry}</td>
            <td>${cus.customerDate}</td>
        </tr>
        </c:forEach>
    </table>
    </form:form>
</body>
</html>
