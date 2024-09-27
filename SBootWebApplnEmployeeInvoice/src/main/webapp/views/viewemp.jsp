<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form" %>
<%@ taglib uri  = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>viewAllEmployee</title>
    <style>
        body{
            margin: 0;
            padding: 0;
            background-color: rgb(247, 247, 186);
        }
        .main
        {
            border: 1px solid;
            height: 400px;
            margin: auto;
            padding: 5px;
            text-align: center;
        }
    table
        {
            margin: auto;
            padding: 40px;
            text-align: center;
            font-size: large;
            border-collapse: collapse;
        }
        a{
            text-decoration: none;
            color: brown;
            background-color: aquamarine;
        }
    </style>
</head>
<body>
    <div class="main">
    <h1>Display All Employees Details</h1>
    <table border="1">
    <tr>
        <th>EMPLOYEE ID</th>
        <th>EMPLOYEE NAME</th>
        <th>SALARY</th>
        <th>TA</th>
        <th>DA</th>
        <th>HRA</th>
        <th>PF</th>
        <th>GROSS SALARY</th>
        <th>NET SALARY</th>
        <th colspan="2">Action</th>
    </tr>
    <c:forEach var = "empl" items = "${employees}">
        <tr>
            <td>${empl.empid}</td>
            <td>${empl.empname}</td>
            <td>${empl.salary}</td>
            <td>${empl.ta}</td>
            <td>${empl.da}</td>
            <td>${empl.hra}</td>
            <td>${empl.pf}</td>
            <td>${empl.gross_salary}</td>
            <td>${empl.net_salary}</td>
            <div class="nav">
                <td><a href="/editUrl/${empl.empid}">Edit</a></td>
                <td><a href="/deleteUrl/${empl.empid}">Delete</a></td>
            </div>
        </tr>
    </c:forEach>
    </table>
    </div>
</body>
</html>