<%--
  Created by IntelliJ IDEA.
  User: Jorge
  Date: 2019-07-23
  Time: 10:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:choose>
    <c:when test="${expectedPassword == null || !expectedPassword.equals(password)}">
        <jsp:forward page="index.jsp" />
    </c:when>
    <c:otherwise>
        <h2>Login Successful</h2>
        <p/>
        <form action="login" method="get">
            <input type="submit" value="Back"/>
        </form>
    </c:otherwise>
</c:choose>
</body>
</html>
