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
  <h1>UserInfo</h1>
    <c:out value="${spitter.username} "></c:out><br/>
    <c:out value="${spitter.firstname} "></c:out><br/>
    <c:out value="${spitter.lastname} "></c:out><br/>
</body>
</html>