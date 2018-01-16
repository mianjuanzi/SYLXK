<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>选课系统</title>
</head>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<body>
<form id="form1" name="form1" method="post" action="/servlet/logincontrol">
  <p>用户:
    <input type="text" name="userName" />
  </p>
  <p>密码:
    <input type="password" name="password" />
  </p>
  <p><select  class="form-control" id="select" name="code">
  <option value="1">学生</option>
    <option value="2">老师</option>
		<option value="3">管理员</option>
	</select></p>
  <p>
    <input type="submit" value="登录" /><a href=".\signup.jsp"><button type="button">注册</button></a>
</p>
</form>


</body>
</html>

