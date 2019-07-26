<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Add Product Form</title>
    <style type="text/css">@import url(css/main.css);</style>
</head>
<body>

<div id="global">
    <spring:url var="product" value="/product"/>
    <form:form modelAttribute="product" action="${product}">
        <%--    <form action="product" method="post">--%>
        <fieldset>
            <legend>Add a product</legend>
            <p>
                    <%--                <label for="category">Category </label>--%>
                <label for="category"><spring:message code="product.category"/></label>
                        <form:select id="id" path="category.id" items="${categories}"
                                     itemLabel="name" itemValue="id" />
<%--                <select name="category.id">--%>
<%--                    <option value="-"> --Select Category--</option>--%>

<%--                    <c:forEach var="category" items="${categories}">--%>
<%--                        <option value="${category.id}"> ${category.name}</option>--%>
<%--                    </c:forEach>--%>
<%--                </select>--%>
            </p>

            <p>
                    <%--                <label for="name">Product Name: </label>--%>
                <label for="name"><spring:message code="product.name"/> </label>
                        <input type="text" id="name" name="name"
                       tabindex="1">
            </p>
            <p>
                    <%--                <label for="description">Description: </label>--%>
                <label for="description"><spring:message code="product.description"/> </label>
                <form:input id="description" path="description"/>
                    <%--                <input type="text" id="description" value="${product.description}"--%>
                    <%--                       name="description" tabindex="2">--%>
            </p>
            <p>
                    <%--                <label for="price">Price: </label>--%>
                <label for="price"><spring:message code="product.price"/> </label>
                <form:input id="price" path="price"/>
<%--                        <input type="text" id="price" name="price"--%>
<%--                tabindex="3">--%>
            </p>
            <p id="buttons">
                <input id="reset" type="reset" tabindex="4">
                <input id="submit" type="submit" tabindex="5"
                       value="Add Product">
            </p>
        </fieldset>
    </form:form>
    <%--    </form>--%>

</div>
</body>
</html>
