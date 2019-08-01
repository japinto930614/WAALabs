<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE HTML>
<html>
<head>
    <meta charset="utf-8">
    <%--    <title>Add Employee Form</title>--%>
    <title><spring:message code="addEmployee.form.addEmployeeForm.label"/></title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/main.css"/>">
</head>
<body>

<section>
    <div class="pull-right" style="padding-right:50px">
        <a href="?language=en">English</a>|<a href="?language=es">Español</a>
    </div>
</section>

<div id="global">
    <form:form modelAttribute="employee" action="employee_save" method="post">
        <fieldset>
                <%--				<legend>Add an employee</legend>--%>
            <legend><spring:message code="addEmployee.form.addEmployee.label"/></legend>
            <p>
                <form:errors path="*" cssStyle="color : red;"/>
            </p>
            <p>
                    <%--					<label for="id">ID: </label>--%>
                <label for="id"><spring:message code="addEmployee.form.id.label"/></label>
                    <form:input path="id" id="id"/>
            <div style="text-align: center;">
                <form:errors path="id" cssStyle="color : red;"/>
            </div>
            </p>
            <p>
                    <%--					<label for="firstName">First Name: </label>--%>
                <label for="firstName"><spring:message code="addEmployee.form.firstName.label"/></label>
                    <form:input path="firstName"/>
            <div style="text-align: center;">
                <form:errors path="firstName" cssStyle="color : red;"/>
            </div>
            </p>
            <p>
                    <%--					<label for="lastName">Last Name: </label>--%>
                <label for="firstName"><spring:message code="addEmployee.form.lastName.label"/></label>
                    <form:input path="lastName"/>
            <div style="text-align: center;">
                <form:errors path="lastName" cssStyle="color : red;"/>
            </div>
            </p>

            <p>
                    <%--					<label for="birthDate">Date Of Birth: </label>--%>
                <label for="firstName"><spring:message code="addEmployee.form.birthDate.label"/></label>
                <form:input path="birthDate" id="birthDate"/>
                <form:errors path="birthDate" cssStyle="color : red;"/>
            </p>
            <p>
                    <%--					<label for="salaryLevel">Salary: </label>--%>
                <label for="firstName"><spring:message code="addEmployee.form.salary.label"/></label>
                    <form:input path="salaryLevel" id="salaryLevel"/>
            <div style="text-align: center;">
                <form:errors path="salaryLevel" cssStyle="color : red;"/>
            </div>
            </p>
                <%--            <h4>Address:</h4>--%>
            <h4><spring:message code="addEmployee.form.address.label"/></h4>
            <p>
                    <%--					<label for="street">Street: </label>--%>
                <label for="firstName"><spring:message code="addEmployee.form.street.label"/></label>
                    <form:input path="address.street" id="street"/>
            <div style="text-align: center;">
                <form:errors path="address.street" cssStyle="color : red;"/>
            </div>
            </p>
            <p>
                    <%--					<label for="state">State: </label>--%>
                <label for="firstName"><spring:message code="addEmployee.form.state.label"/></label>
                    <form:input path="address.state" id="state"/>
            <div style="text-align: center;">
                <form:errors path="address.state" cssStyle="color : red; "/>
            </div>
            </p>
            <p>
                    <%--					<label for="zipCode">Zip: </label>--%>
                <label for="firstName"><spring:message code="addEmployee.form.zipcode.label"/></label>
                    <form:input path="address.zipCode" id="zipCode"/>
            <div style="text-align: center;">
                <form:errors path="address.zipCode" cssStyle="color : red; "/>
            </div>
            </p>

            <p>
                    <%--					<label for="zipCode">Zip: </label>--%>
                <label for="firstName"><spring:message code="addEmployee.form.image.label"/></label>
                    <form:input path="employeeImage" id="employeeImage"
                                type="file" class="form:input-large"/>
            <div style="text-align: center;">
                <form:errors path="employeeImage" cssStyle="color : red; "/>
            </div>
            </p>
            <p id="buttons">
                <input id="reset" type="reset" tabindex="4"
                       value="<spring:message code="addEmployee.form.reset.button"/>">
                <input id="submit" type="submit" tabindex="5"
                       value="<spring:message code="addEmployee.form.AddEmployee.button"/>">
            </p>
        </fieldset>
    </form:form>
</div>
</body>
</html>
