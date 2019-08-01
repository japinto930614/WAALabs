<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Save Employee</title>
<link rel="stylesheet" type="text/css" href="<c:url value="/css/main.css"/>">
</head>
<body>
<div id="global">
    <h4>The employee details have been saved.</h4>
    <p>
        <h5>Details:</h5>
    <div>
        <img alt="${employee.firstName }" src="<c:url value="/img/${employee.id }.png"></c:url>" style="width:100%"/>
    </div>
        First Name: ${employee.firstName}<br/>
        Last Name: ${employee.lastName}<br/>
        Date of birth: ${employee.birthDate}
    </p>
</div>
</body>
</html>