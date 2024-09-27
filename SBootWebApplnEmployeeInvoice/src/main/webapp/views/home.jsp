<!DOCTYPE html>
<html lang="en">
<head>
    <title>home</title>
    <style>
        body{
            margin: 0;
            padding: 0;
            background-color: blanchedalmond;
        }
        .main
        {
            border: 2px solid;
            border-radius: 10px;
            width: fit-content;
            height: 300px;
            margin: auto;
            margin-top: 60px;
            padding: 20px;
        }
        h1{
            color: brown;
            text-align: center;
        }
        
        .navbar
         {
            border: 1px solid;
            width: 600px;
            display: flex;
            justify-content: space-evenly;
            background-color: rgb(231, 112, 112);
            padding: 15px;
         }
         .navbar a{
            text-decoration: none;
            font-size: large;
            color: black;
         }
         .navbar a:hover
         {
            background-color: rgb(231, 179, 114);
         }
    </style>
</head>
<body>
    <div class="main">
    <h1>EMPLOYEE INVOICE APPLICATION</h1>
        <div class="navbar">
            <a href="/addempUrl">AddEmployee</a>
            <a href="/viewAllUrl">ViewAllEmployee</a>
            <a href="/viewUrl">ViewOneEmployee</a>
        </div>
    </div>
</body>
</html>