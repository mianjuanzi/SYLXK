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
  <!-- �γ����ƣ��γ�ѧʱ���γ�Ҫ�󣬿γ�Ҫ�������ݣ����˷�ʽ�� -->
  <body>
   <form  action="/servlet/pubclass" method="post">
		<table>
			<tr>
				<td>�γ�����:</td>
				<td><input name="name" type="text"></input></td>
			</tr>
			<tr>
				<td>�γ�ѧʱ:</td>
				<td><input name="time" type="text"></input></td>
			</tr>
			<tr>
				<td>�γ�Ҫ��:</td>
				<td><input name="req" type="text"></input></td>
			</tr>
			
			<tr>
				<td>�γ�Ҫ��������:</td>
				<td><input name="content" type="text"></input></td>
			</tr>
		
			<tr>
				<td>���˷�ʽ:</td>
				<td><input name="test" type="text"></input></td>
			</tr>
			
			
				<td><input type="submit" value="�ύ"></input></td>
			</tr>
		</table>
	</form>
	
  </body>
</html>
