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
    <title>Json交互</title>
    <meta http-equiv="Content-Type" content="text/html charset=UTF-8">
    <script type="text/javascript" src="${pageContext.request.contextPath}/jquery-1.11.3.min.js">

    </script>
    <script type="text/javascript">
      function testJson() {

          var id =$("#username").val();

          $.ajax({
              url : "${pageContext.request.contextPath}/user/"+id,
              type : "GET",
//              data : JSON.stringify(data), //转JSON字符串
              dataType: 'json',
//              contentType:'application/json;charset=UTF-8', //contentType很重要
              success : function(result) {
                  console.log(result.username);
              }
          });


          <%--$.ajax({--%>
             <%--url: "${pageContext.request.contextPath}/testJson",--%>
              <%--type:"post",--%>
              <%--data:JSON.stringify({username:username,password:password}),--%>
              <%--contentType:"application/json;charset=UTF-8",--%>
              <%--dataType:"json",--%>
              <%--success:function (data) {--%>
                  <%--if(data!=null){--%>
                      <%--alert("你输入的密码为"+data.password);--%>
                  <%--}--%>
              <%--}--%>
          <%--});--%>
      }
    </script>
  </head>
  <body>
  <form >
  用户名：<input type="text" name="username" id="username"/><br/>
  密码： <input type="text" name="password" id="password">
  <input type="button" value="查询" onclick="testJson()">
  </form>
  </body>
</html>
