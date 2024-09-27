<!DOCTYPE html>
<html lang="en">
<head>
    <title>viewOneEmployee</title>
    <style>
        body{
            background-color: aquamarine;
        }
        .main
        {
            border: 1px solid;
            width: fit-content;
            margin: auto;
            text-align: center;
            padding: 20px;
            margin-top: 60px;
            background-color: rgb(117, 143, 134);
        }
        input
        {
            margin: 10px;
            block-size: 30px;
            font-size: large;
        }
        td{
            font-size: x-large;
        }
        
    </style>
</head>
<body>
    <div class="main">
    <form action = "/viewOneUrl" method = "GET" >
        <table>
            <tr>
                <td>Employee Id:</td>
                <td><input type = "text" name="empid"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type = "submit" value = "ViewOne"></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>