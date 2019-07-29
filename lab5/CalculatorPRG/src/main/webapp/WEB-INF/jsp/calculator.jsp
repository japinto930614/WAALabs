<%--
  Created by IntelliJ IDEA.
  User: Jorge
  Date: 2019-07-23
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Calculate</title>
</head>
<body>
<%--<c:if test="${errors != null}">--%>

<%--    <p id="errors">--%>
<%--        Error(s)!--%>
<%--    <ul>--%>
<%--        <c:forEach var="error" items="${errors}">--%>
<%--            <li>${error}</li>--%>
<%--        </c:forEach>--%>
<%--    </ul>--%>


<%--</c:if>--%>
<form action="calculate" method="post">
    <input type = "text" name = "addend1" size = "2"  value = "${form.addend1}" />+
    <input type = "text" name = "addend2" value = "${form.addend2}" size = "2"/>=<input type = "text" name = "sum" value = ""  size = "2" readonly/><br/>
    <input type = "text" name = "multiplicand" value = "${form.multiplicand}" size = "2"/>*
    <input type = "text" name = "multiplier" value = "${form.multiplier}"  size = "2"/>=<input type = "text" name = "product" value = ""   size = "2" readonly/><br/>
    <input type = "submit" value = "Submit"/>

</form>
</body>
</html>