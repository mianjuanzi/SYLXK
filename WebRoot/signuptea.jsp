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
				<td>����ID:</td>
				<td><input name="tid" type="text"></input></td>
			</tr>
			<tr>
				<td>����:</td>
				<td><input name="pwd" type="password"></input></td>
			</tr>
			<tr>
				<td>����:</td>
				<td><input name="name" type="text"></input></td>
			</tr>
			
			<tr>
				<td>�Ա�:</td>
				<td><input name="sex" type="text"></input></td>
			</tr>
		
			<tr>
				<td>����:</td>
				<td><input name="age" type="text"></input></td>
			</tr>
			
			<tr>
				<td>רҵ:</td>
				<td><input name="major" type="text"></input></td>
			</tr>
			
			<tr>
				<td>ְ��:</td>
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
				<td><input type="submit" value="�ύ"></input></td>
			</tr>
		</table>
	</form>
	
  </body>
</html>
