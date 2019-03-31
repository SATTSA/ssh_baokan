<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
    <a href="save?kehu.kname=wang"> 保存</a>
    <a href="del?kehu.kid=26">  删除</a>
    <a href="update?kehu.kid=1">  修改</a><br>
    <form action="update"  method="post">
    id<input type="kehu"  name="kehu.kid"><br>
    name<input type="kehu"  name="kehu.kname"><br>
    <input type="submit"  value="修改">
    </form>
    <a href="queryAll"> 查询</a>
  </body>
</html>
