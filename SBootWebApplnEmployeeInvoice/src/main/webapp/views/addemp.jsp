<!DOCTYPE html>
<html lang="en">
<head>
    <title>addemployee</title>
    <style>
        *
        {
            margin: 0;
            padding: 0;
            background-color: rgb(180, 243, 243);
        }
        .main
        {
            border: 2px solid;
            width: fit-content;
            margin: auto;
            padding: 40px;
            text-align: center;
            margin-top: 60px;
            background-color:rgb(233, 188, 132) ;
        }
        input{
            margin-top: 20px;
            font-size: large;
            box-sizing: 400px;
        }
        .sub
        {
            padding: 3px;
            background-color: rgb(203, 247, 163);
        }
    </style>
</head>
<body>
    <div class="main">
     <h1>Employee Registration</h1>
    <form action  = "/saveUrl" method  ="POST">
        <label>Employee Name:</label>
        <input type ="text" name ="empname"><p></p>
        <label>Salary:</label>&emsp;&emsp;&emsp;&emsp;
        <input type ="text" name ="salary"><p></p>
        <input type ="submit" value="AddInvoice" class="sub">
    </form>
   </div>
</body>
</html>