<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'signup.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <!-- 课程名称，课程学时，课程要求，课程要讲的内容，考核方式。 -->
  <body>
   <form  action="/servlet/pubclass" method="post">
		<table>
			<tr>
				<td>课程名称:</td>
				<td><input name="name" type="text"></input></td>
			</tr>
			<tr>
				<td>课程学时:</td>
				<td><input name="time" type="text"></input></td>
			</tr>
			<tr>
				<td>课程要求:</td>
				<td><input name="req" type="text"></input></td>
			</tr>
			
			<tr>
				<td>课程要讲的内容:</td>
				<td><input name="content" type="text"></input></td>
			</tr>
		
			<tr>
				<td>考核方式:</td>
				<td><input name="test" type="text"></input></td>
			</tr>
			
			
				<td><input type="submit" value="提交"></input></td>
			</tr>
		</table>
	</form>
	
  </body>
</html>
