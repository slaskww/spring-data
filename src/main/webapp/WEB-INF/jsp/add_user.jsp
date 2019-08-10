<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<head>
    <title>Adding User</title>
    <%@ include file="header.jsp" %>
</head>

<body>
<div class="container">
    <form:form method="POST"
               action="/user" modelAttribute="userDto">
            <form:input class="form-control" path="id" hidden="true"/>

            <div class="form-group">
                <form:label path="firstName">Name</form:label>
                <form:input class="form-control" path="firstName" required="true"/>
            </div>
            <div class="form-group">
                <form:label path="lastName">Lastname</form:label>
                <form:input class="form-control" path="lastName" required="true"/>
            </div>
            <div class="form-group">
                <form:label path="birthDate">Birthdate</form:label>
                <form:input class="form-control" type="date" path="birthDate" required="true"/>
            </div>
            <div class="form-group">
                <form:label path="email">Email</form:label>
                <form:input class="form-control" type="email" path="email" required="true"/>
            </div>

            <form:input class="form-control" path="addressId" hidden="true"/>
            <div class="form-group">
                <form:label path="street">Stret</form:label>
                <form:input class="form-control" path="street" required="true"/>
            </div>
            <div class="form-group">
                <form:label path="city">City</form:label>
                <form:input class="form-control" path="city" required="true"/>
            </div>
            <div class="form-group">
                <form:label path="houseNumber">House Number</form:label>
                <form:input class="form-control" path="houseNumber" required="true"/>
            </div>
            <div class="form-group">
                <form:label path="apartmentNumber">Apartment Number</form:label>
                <form:input class="form-control" path="apartmentNumber"/>
            </div>
            <form:button class="btn btn-primary" type="submit" value="Submit">Submit</form:button>
    </form:form>
</div>
</body>

</html>