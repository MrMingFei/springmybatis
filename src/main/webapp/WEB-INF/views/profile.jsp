<%--
  Created by IntelliJ IDEA.
  User: 10050253c
  Date: 2019/9/3
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Spitter</title>
    <link rel="stylesheet" type="text/css"
          href="<c:url value="/resources/style.css" /> ">
</head>
<body>
<h1>Your Profile</h1>
<c:out value="${spitter.username}" /><br/>
<c:out value="${spitter.firstName}" /><br/>
<c:out value="${spitter.lastName}" /><br/>
<c:out value="${spitter.email}" /><br/>
</body>
</html>
