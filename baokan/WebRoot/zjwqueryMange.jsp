<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'queryMange.jsp' starting page</title>
    
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
  <form action="toShow"  method="post">
    身份证:<input type="kehu"  name="kehu.kid"><br>
    <input type="submit"  value="查询">
   </form>
  <form action="queryAll" method="post">
    <input type="submit" value="查询全部"><br> 
  </form>
  <form action="toSavePage" method="post">
    <input type="submit" value="新增"><br>
  </form>
    <table border="1">
    <s:iterator value="kehuList"  var="kehu">
    <tr>
         <td><s:property value="kid"/></td>
         <td><s:property value="kname"/></td>
         <td><s:property value="ksex"/></td>
         <td><s:property value="kconnect"/></td>
         <td><s:property value="kbook"/></td>
         <td><a href="toUpdatePage?kehu.kid=<s:property value="kid"/>">修改</a></td>
         <td><a href="del?kehu.kid=<s:property value="kid"/>">删除</a></td>
    </tr>
    </s:iterator>
    </table>
    
    
  </body>
</html>
