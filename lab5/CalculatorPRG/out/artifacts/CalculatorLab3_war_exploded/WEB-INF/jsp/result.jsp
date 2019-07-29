<%--
  Created by IntelliJ IDEA.
  User: Jorge
  Date: 2019-07-23
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${errors != null}">

    <p id="errors">
        Error(s)!
    <ul>
        <c:forEach var="error" items="${errors}">
            <li>${error}</li>
        </c:forEach>
    </ul>


</c:if>
<form action="calculate" method="post">
    <input type = "text" name = "addend1" size = "2"  value = "${calculation.addend1}" />+
    <input type = "text" name = "addend2" value = "${calculation.addend2}" size = "2"/>=<input type = "text" name = "sum" value = "${calculation.sum}"  size = "2" readonly/><br/>
    <input type = "text" name = "multiplicand" value = "${calculation.multiplicand}" size = "2"/>*
    <input type = "text" name = "multiplier" value = "${calculation.multiplier}"  size = "2"/>=<input type = "text" name = "product" value = "${calculation.product}"   size = "2" readonly/><br/>
    <input type = "submit" value = "Submit"/>

</form>

</body>
</html>