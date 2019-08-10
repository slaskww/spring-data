<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <title>First Web Application</title>
    <%@ include file="header.jsp" %>

    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
</head>

<body>

<div class="container">
    <table class="table table-striped">
        <tr>
            <th>Firstname</th>
            <th>LastName</th>
            <th>Birth Date</th>
            <th>Email</th>
            <th>Actions</th>
        </tr>
        <c:forEach items="${users}" var="user">
            <tr>
                <td>${user.firstName}</td>
                <td>${user.lastName}</td>
                <td>${user.birthDate}</td>
                <td>${user.email}</td>
                <td>
                    <form action="/deleteUser" method="post" onclick="return confirm('Are you sure you want to delete user?');">
                        <input hidden name="id" value="${user.id}">
                        <button>
                            <i class="fas fa-trash"></i>
                        </button>
                    </form>
                    <form action="/editUser" method="post" >
                        <input hidden name="id" value="${user.id}">
                        <button>
                            <i class="fas fa-cog"></i>
                        </button>
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>

</html>