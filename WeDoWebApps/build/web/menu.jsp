<%-- 
    Document   : menu
    Created on : 02 May 2023, 20:26:35
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h1>Main Menu</h1>
        <p>Please select the test category you wish to write</p>
        
        <or>
        <ol>
            
           <li>      
        <form action="ProcessingServlet.do" method="post">
               <td><input type="submit" value="Click Here To Do Addition" />  </td>
               <td><input type="text" name="op" value="addition" hidden="true" /></td>      
        </form>
           </li> <br>
            
            <li>      
        <form action="ProcessingServlet.do" method="post">
               <td><input type="submit" value="Click Here To Do Subtraction" />  </td>
               <td><input type="text" name="op" value="subtraction" hidden="true" /></td>      
        </form>
            </li> <br>
            
            <li>      
        <form action="ProcessingServlet.do" method="post">
               <td><input type="submit" value="Click Here To Do Division" />  </td>
               <td><input type="text" name="op" value="division" hidden="true" /></td>      
        </form>
            </li> <br>

            <li>      
        <form action="ProcessingServlet.do" method="post">
               <td><input type="submit" value="Click Here To Do Multiplication" />  </td>
               <td><input type="text" name="op" value="multiplication" hidden="true" /></td>      
        </form>
            </li>
        </ol>

    </body>
</html>
