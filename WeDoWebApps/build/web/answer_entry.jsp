<%-- 
    Document   : name_entry
    Created on : 02 May 2023, 20:01:28
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Name Entry</title>
    </head>
    <body>
        <h1>Provide an answer</h1>
        <p>Provide your answer below</p>
        
        <form action="ProcessingServlet.do" method="post">
            <table>
                <tr>
                    <td><label>Answer : </label> </td>
                    <td><input type="text" name="username" /> </td>      
                </tr>
               <tr>
                    <td><input type="submit" value="SUBMIT" />  </td>
                    <td> <input type="text" name="op" value="username" hidden="true" /></td>      
                </tr>    
            </table>
        </form>
    </body>
</html>
