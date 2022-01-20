<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="post">
            <table>
                <tr>
                    <td> <label for="age">Enter your age </label></td>
                    <td> <input type="text" name="age" id="age" placeholder="enter number"> </td>
                </tr>
                <tr>
                    <td> </td>
                    <td> <input type="submit" value="Age next Birthday"> </td>
                </tr>
            </table>
        </form>
        
        <p>${agecalcmessage}</p>
        <a href="arithmetic">Arithmetic Calculator </a>

    </body>
</html>
