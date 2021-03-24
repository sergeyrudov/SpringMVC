<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Employee, you are welcome!!!</h2>
<br>
<br>
<br>

Your name: ${employee.name}
<br>
<br>
Your surname: ${employee.surname}
<br>
<br>
Your salary: ${employee.salary}
<br>
<br>
Your department: ${employee.department}
<br>
<br>
Your drive license status: ${employee.driveLicense}
<br>
<br>
Your car: ${employee.carBrand}
<br>
<br>
Your equipment:
<ul>
    <c:forEach var="eq11" items="${employee.equipment}">
    <li>${eq11}</li>
    </c:forEach>
</ul>
<br>
<br>
Your phone number: ${employee.phoneNumber}
<br>
<br>
Your email: ${employee.email}
</body>

</html>