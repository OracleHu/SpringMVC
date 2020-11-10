<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spitter</title>
<link rel="stylesheet"
      type="text/css"/>
     
</head>
<body>
  <h1>Register</h1>
    <sf:form method="POST" modelAttribute="spitter" enctype="multipart/form-data">
      First Name:<sf:input  path="firstname"/><br/>
      Last Name:<sf:input path="lastname"/><br/>
      Username:<sf:input path="username"/><br/>
      Password:<sf:password path="password" /><br/>
       <input type="file" name="file" /><br/>
      
      <input type="submit" value="Register">
    </sf:form>
</body>
</html>