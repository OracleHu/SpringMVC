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
  <h1>welcome to spitter</h1>
  <a href="<c:url value="/spittles" />">Spitters</a>
  <a href="<c:url value="/spitter/register" />">Register</a>
</body>
</html>