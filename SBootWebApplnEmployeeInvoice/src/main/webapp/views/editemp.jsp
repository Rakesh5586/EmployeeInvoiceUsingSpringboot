<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Spring MVC form tags</title>
<style>
    body
    {
        background-color: rgb(236, 192, 137);
    }
   input
   {
    margin: 10px;
    block-size: 30px;
   }
   .main
   {
    border: 1px solid;
    width: fit-content;
    margin: auto;
    padding: 10px;
    text-align: center;
    margin-top: 60px;
    font-size: x-large;
   }
   table{
     font-size: x-large;
   }
</style>
</head>
 
<body>
    <div class="main">
    <h2>Edit Emloyee Here</h2>
 
    <form:form action="/editsaveUrl" method = "GET" >
        <table>
            <tr>
                <td>Employee Id:</td>
                <td><form:input path="empid" /></td>
            </tr>
            <tr>
                <td>Employee Name:</td>
                <td><form:input path="empname" /></td>
            </tr>
            <tr>
                <td>Salary:</td>
                <td><form:input path="salary" /></td>
            </tr>
            <tr>
                <td></td>
                <td><input type = "submit" value = "EditSave"></td>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>