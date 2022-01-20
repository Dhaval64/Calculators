
package ca.sait.calculators.servlets;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;



public class AgeCalculatorServlet extends HttpServlet {
   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
         
    }
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int age;
        try {
            if (request.getParameter("age") != null){             
                String ageNumber = request.getParameter("age");
                age = Integer.parseInt(ageNumber);
                age++;
                
                request.setAttribute("agecalcmessage", "Your age next birthday will be  " + age);
            }      
                           
        } catch (NumberFormatException ex){     
            request.setAttribute("agecalcmessage", "You must give your current age");                    
        }                  
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }
}
