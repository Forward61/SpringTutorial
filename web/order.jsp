<%--
  Created by IntelliJ IDEA.
  User: ningli
  Date: 2018/7/5
  Time: 下午10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Order</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/findOrdersWithUser" method="post">
    订单编号：<input type="text" name="orderId"/><br/>
    所属用户： <input type="text" name="user.username">
    <input type="submit" value="查询">
  </form>
  </body>
</html>
