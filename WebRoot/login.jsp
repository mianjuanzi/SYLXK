<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>ѡ��ϵͳ</title>
</head>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<body>
<form id="form1" name="form1" method="post" action="/servlet/logincontrol">
  <p>�û�:
    <input type="text" name="userName" />
  </p>
  <p>����:
    <input type="password" name="password" />
  </p>
  <p><select  class="form-control" id="select" name="code">
  <option value="1">ѧ��</option>
    <option value="2">��ʦ</option>
		<option value="3">����Ա</option>
	</select></p>
  <p>
    <input type="submit" value="��¼" /><a href=".\signup.jsp"><button type="button">ע��</button></a>
</p>
</form>


</body>
</html>

