<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>


<body>

<h2>Dear Employee, Please enter your details</h2>

<form:form action = "showDetails" modelAttribute="employee">
    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br>
    <br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br>
    <br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br>
    <br>
    Department 
    <form:select path="department">
        <%--<form:option value="Information technology" label="IT"/>
        <form:option value="Human resources" label="HR"/>
        <form:option value="Sales manager" label="Sales"/>--%>
        <form:options items="${employee.departments}"/>
    </form:select>
    <br>
    <br>
    Do you have drive license?
    <form:radiobutton path="driveLicense" value="true" label="Yes"/>
    <form:radiobutton path="driveLicense" value="false" label="No"/>
    <br>
    <br>
    Which car you want?
   <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br>
    <br>
    Which equipments do you want?
   <form:checkboxes path="equipment" items="${employee.equipments}"/>
    <br>
    <br>
    Your phone number:
    <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br>
    <br>
    Your phone email:
    <form:input path="email"/>
    <form:errors path="email"/>
    <br>
    <br>
                            
    <input type="submit" value="OK">
</form:form>

</body>

</html>