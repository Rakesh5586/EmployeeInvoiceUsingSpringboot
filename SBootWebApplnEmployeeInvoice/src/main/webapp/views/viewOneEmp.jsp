<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form" %>
<%@ taglib uri  = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<head>
    <style>
        body{
            background: #eea6a6;
        }
        table
        {
            font-size: x-large;
            border-collapse: collapse;
        }
        td{
            block-size: 50px
        }
        .main
        {
            border: 1px solid;
            width: 100%;
            height: 100%;
            margin: auto;
            text-align: center;
        }
        table{
            margin: auto;
            margin-top: 30px;
        }
    </style>
</head>
<div class="main">
<h1>Display One Employee Details</h1>
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
    <tr>
        <td>${emps.empid}</td>
        <td>${emps.empname}</td>
        <td>${emps.salary}</td>
        <td>${emps.ta}</td>
        <td>${emps.da}</td>
        <td>${emps.hra}</td>
        <td>${emps.pf}</td>
        <td>${emps.gross_salary}</td>
        <td>${emps.net_salary}</td>
        <td><a href="/editUrl/${emps.empid}">Edit</a></td>
        <td><a href="/deleteUrl/${emps.empid}">Delete</a></td>
    </tr>
</table>
</div>