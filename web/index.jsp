<%@ page import="test.Mytest" %>
<%@ page import="pojo.Member" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: wyj
  Date: 2019/2/28
  Time: 下午8:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% List<Member> list =Mytest.findll();%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <table  border="solid 1px">

      <%
        for (Member member:list
             ) {
      %>
    <tr>
        <td>
    <%=member.getId()%>
        </td>
      <td>
        <%=member.getUsername()%>
      </td>
      <td>
        <%=member.getPass()%>
      </td>
      <td>
        <%=member.getSex()%>
      </td>
    </tr>
    <%}%>
  </table>
  </body>
</html>
