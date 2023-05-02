package za.ac.tut.controller;

import jakarta.ejb.EJB;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import za.ac.tut.ejb.bl.ArithmeticSB;
import za.ac.tut.ejb.bl.ArithmeticSBLocal;

/**
 *
 * @author Student
 */
public class ProcessingServlet extends HttpServlet {
    @EJB
    private ArithmeticSBLocal asb;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = "selection_outcome.jsp";
        String option = request.getParameter("op");
        char operator;
        
        if(option.equals("username"))
        {
            String username = request.getParameter("username");
            asb.initUsername(username);
            url = "menu.jsp";
            
        }else if(option.equals("addition")){
           asb.initChoosenTest(option);
           request.setAttribute("option", option);
           
        }else if(option.equals("subtraction")){
            asb.initChoosenTest(option);
            request.setAttribute("option", option);
            
        }else if(option.equals("division")){
            asb.initChoosenTest(option);
            request.setAttribute("option", option);
            
        }else if(option.equals("multiplication")){
            asb.initChoosenTest(option);
            request.setAttribute("option", option);
        }else{
            
            
            
            
            
            
            
        }
         
        
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(url);
        requestDispatcher.forward(request, response);
    }

}
