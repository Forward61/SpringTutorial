<%--
  Created by IntelliJ IDEA.
  User: ningli
  Date: 2018/7/5
  Time: 下午10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.net.URLEncoder" %>
<html>
  <head>
    <title>文件上传</title>
    <meta http-equiv="Content-Type" content="text/html charset=UTF-8">
    <script type="text/javascript" src="${pageContext.request.contextPath}/jquery-1.11.3.min.js">

    </script>
    <script type="text/javascript">
      function check() {
          var name = $("#name").value;
          var file = $("#file").value;
          console.log(name + file);
          return true;


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
  ${msg}
  <form  action="${pageContext.request.contextPath}/fileUpload" method="post" enctype="multipart/form-data" onsubmit="return check()">
  上传人：<input type="text" name="name" id="name"/><br/>
  密码： <input type="file" name="uploadfile" id="file" multiple="multiple">
  <input type="submit" value="上传">
  </form>
  <a href="${pageContext.request.contextPath}/download?filename=<%=URLEncoder.encode("下载.png","UTF-8")%>">文件下载</a>
  </body>
</html>
