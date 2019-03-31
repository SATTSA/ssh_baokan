<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'update.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <form action="update" method="post">
  <table border="1">
  <tr><td>身份证:<input name="kehu.kid"      value="${showKehu.kid }"></td></tr>
  <tr><td>姓名:<input name="kehu.kname"    value="${showKehu.kname }"></td></tr>
  <tr><td>性别:<input name="kehu.ksex"     value="${showKehu.ksex }"></td></tr>
  <tr><td>联系方式:<input name="kehu.kconnect" value="${showKehu.kconnect }"></td></tr>
  <tr><td>订阅日期:<input name="kehu.kbook"    value="${showKehu.kbook }"></td></tr>
  </table>
  <input type="submit" value="保存">
  </form>
  </body>
</html>
