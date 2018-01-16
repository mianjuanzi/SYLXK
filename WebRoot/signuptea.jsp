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
  
  <body>
   <form  action="/servlet/signuptea" method="post">
		<table>
			<tr>
				<td>工号ID:</td>
				<td><input name="tid" type="text"></input></td>
			</tr>
			<tr>
				<td>密码:</td>
				<td><input name="pwd" type="password"></input></td>
			</tr>
			<tr>
				<td>姓名:</td>
				<td><input name="name" type="text"></input></td>
			</tr>
			
			<tr>
				<td>性别:</td>
				<td><input name="sex" type="text"></input></td>
			</tr>
		
			<tr>
				<td>年龄:</td>
				<td><input name="age" type="text"></input></td>
			</tr>
			
			<tr>
				<td>专业:</td>
				<td><input name="major" type="text"></input></td>
			</tr>
			
			<tr>
				<td>职称:</td>
				<td><input name="level" type="text"></input></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input name="mail" type="text"></input></td>
			</tr>
			<tr>
				<td>QQ:</td>
				<td><input name="qq" type="text"></input></td>
			</tr>
			
			<tr>
				<td>Tel:</td>
				<td><input name="tel" type="text"></input></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="提交"></input></td>
			</tr>
		</table>
	</form>
	
  </body>
</html>
