<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/fileupload/upload.action" method="post" 
enctype="multipart/form-data">
    用户名：<input type="text" name="name"/> <br/>
    文件：<input type="file" name="pictureFile"/> <br/>
    <input type="submit" value="提交"/>
</form>

</body>
</html>