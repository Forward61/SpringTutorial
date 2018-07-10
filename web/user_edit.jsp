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
    <form action="${pageContext.request.contextPath}/editUsers" method="post" id="formid">
      <table width="20%" border="1">
        <tr>
          <td>选择</td>
          <td>用户名</td>
        </tr>
        <tr>
          <td><input name="users[0].id" value="1" type="checkbox"></td>
          <td><input name="users[0].username" type="text" value="tom"> </td>
        </tr>
        <tr>
          <td><input name="users[1].id" value="2" type="checkbox"></td>
          <td><input name="users[1].username" type="text" value="jack"> </td>
        </tr>
      </table>
      <input type="submit" value="修改">
    </form>
  </body>
</html>
