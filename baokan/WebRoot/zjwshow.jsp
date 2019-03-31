<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'show.jsp' starting page</title>
    
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
  <form>
  <input type="submit" value="投诉"><input type="submit" value="表扬"><input type="submit" value="建议">
  </form>
  <form action="toshow" method="post">
  <table border="1">
  <tr><td>身份证:</td><td><input name="kehu.kid"      value="${showKehu.kid }"></td></tr>
  <tr><td>姓名:</td><td><input name="kehu.kname"    value="${showKehu.kname }"></td></tr>
  <tr><td>性别:</td><td><input name="kehu.ksex"     value="${showKehu.ksex }"></td></tr>
  <tr><td>联系方式:</td><td><input name="kehu.kconnect" value="${showKehu.kconnect }"></td></tr>
  <tr><td>订阅日期:</td><td><input name="kehu.kbook"    value="${showKehu.kbook }"></td></tr>
  </table>
  <input type="submit" value="返回">
  </form>
  </body>
</html>
