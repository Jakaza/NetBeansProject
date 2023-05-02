<%-- 
    Document   : selection_outcome
    Created on : 02 May 2023, 21:32:03
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
        <%
        String option = (String)request.getAttribute("option");
        %>
        <h1>You Chose to do <%= option %> test.</h1>
        <p>Please click <a href="answer_entry.jsp">here</a> to start the test</p>
    </body>
</html>
