<%--
  Created by IntelliJ IDEA.
  User: Jorge
  Date: 2019-07-23
  Time: 10:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head></head>
<body>
<form action="../action/login" method="get">

    Starbuck's ${roast.toUpperCase()} Roast Coffees:

    <table>
        <c:forEach var = "i" begin = "0" end = "${advice.size() - 1}">
            <c:choose>
            <c:when test="${i%2 == 0}">
                <tr style="background-color:cyan">
            </c:when>
            <c:otherwise>
                <tr style="background-color:yellow">
            </c:otherwise>
            </c:choose>

            <td> ${advice.get(i)}</td>
            </tr>

        </c:forEach>
    </table>

    <input type="submit" value="Back">
</form>
</body>
</html>
