<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>�ޱ����ĵ�</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>
ѡ��ʧ��!<span id="leave">5</span>����Զ���ת����½ҳ��
<p>�����Զ���ת,����<a href="student.html">�ص���ҳ</a></p>
</body>
</html>

<script>
	 var t=5;
	 setInterval("f()",1000);
	 
	  function f()
	  {
	  	   t--;
	  	   leave.innerHTML=t;
	  	   if(t==0)
			window.location.href="student.html";

		   
		   
	  }
	
	
</script>
