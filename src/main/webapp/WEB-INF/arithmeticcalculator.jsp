<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            <table>
                <tr>
                    
                    <td> <label>First </label> </td>
                    <td> <input type="text" id="first" name="first" placeholder="enter number" value="${first}" min="0" > </td>
                </tr>
                <tr>
             <td> <label>Second </label> </td>
             <td> <input type="text" id="second" name="second"  placeholder="enter number" value="${second}" min="0"> </td>
            </tr>
            <tr>
                <td> </td>
                <td> 
            <input type="submit" name="calc" id="addition" value="+" >
            <input type="submit" name="calc" id="subtraction" value="-" >
            <input type="submit" name="calc" id="multiplication" value="*">
            <input type="submit" name="calc" id="division" value="/" >
                </td>
            </tr>
            </table>
        </form>
        <p>${message}</p>
        <a href="age">Age Calculator </a>
    </body>
</html>
