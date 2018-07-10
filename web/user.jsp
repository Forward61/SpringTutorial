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
    <title>User列表</title>
  </head>
  <body>
    <form action="${pageContext.request.contextPath}/deleteUsers" method="post">
      <table width="20%" border="1">
        <tr>
          <td>选择</td>
          <td>用户名</td>
        </tr>
        <tr>
          <td><input name="ids" value="1"></td>
          <td>tom</td>
        </tr>
        <tr>
          <td><input name="ids" value="2"></td>
          <td>jack</td>
        </tr>
      </table>
      <input type="submit" value="删除">
    </form>
  </body>
</html>
