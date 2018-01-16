<%@ page contentType="text/html; charset=gb2312" language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <link rel="stylesheet" type="text/css" href="./js/jquery-easyui-1.2.6/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="./js/jquery-easyui-1.2.6/themes/icon.css">
<script type="text/javascript" src="./jquery-easyui-1.2.6/jquery-1.7.2.min.js"></script>
	<script type="text/javascript" src="./jquery-easyui-1.2.6/jquery.easyui.min.js"></script>
	
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
   <form  action="/servlet/signupstu" method="post">
		<table>
			<tr>
				<td>学号ID:</td>
				<td><input name="cid" type="text" required="true"></input></td>
			</tr>
			<tr>
				<td>密码:</td>
				<td><input name="pwd" type="password" required="true"></input></td>
			</tr>
			<tr>
				<td>姓名:</td>
				<td><input name="name" type="text" required="true"></input></td>
			</tr>
		
			<tr>
				<td>性别:</td>
				<td><input name="sex" type="text" required="true"></input></td>
			</tr>
			
			<tr>
				<td>专业:</td>
				<td><input name="major" type="text" required="true"></input></td>
			</tr>
			
			<tr>
				<td>班级:</td>
				<td><input name="stuclass" type="text" required="true"></input></td>
			</tr>
			
			<tr>
				<td>Email:</td>
				<td><input class="easyui-validatebox" name="mail" type="text" required="true" validType="email"></input></td>
			</tr>
		
			<tr>
				<td>QQ:</td>
				<td><input name="qq" type="text" required="true"></input></td>
			</tr>
		
			<tr>
				<td>Tel:</td>
				<td><input class="easyui-validatebox" name="tel" type="text" required="true"></input></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="提交"></input></td>
			</tr>
		</table>
	</form>
	
  </body>
</html>
