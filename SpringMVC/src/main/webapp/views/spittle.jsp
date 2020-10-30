<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spitter</title>
<link rel="stylesheet"
      type="text/css"
      href="<c:url value="/resources/style.css"/>">
</head>
<body>
  <h1>Spittle</h1>
   <div><c:out value="${spittle.message} "/></div>
   <div><c:out value="${spittle.time} "/></div>
</body>
</html>