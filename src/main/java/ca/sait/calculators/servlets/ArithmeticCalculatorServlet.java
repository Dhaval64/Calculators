
package ca.sait.calculators.servlets;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;


public class ArithmeticCalculatorServlet extends HttpServlet {

       
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
              request.setAttribute("message", "Result: ---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String firstvalue = request.getParameter("first");
            String secondvalue = request.getParameter("second");
        try{    
            int firstNumber  = Integer.parseInt(firstvalue);
            int secondNumber  = Integer.parseInt(secondvalue);
                       
            int total= 0;
                        
            switch(request.getParameter("calc")){
                case "+": 
                    total = firstNumber + secondNumber;
                    break;
                case "-": 
                    total = firstNumber - secondNumber;
                    break;
                case "*": 
                   total = firstNumber * secondNumber;
                    break;
                case "/": 
                    total = firstNumber / secondNumber;
                    break;
            }            
            String finalTotal = Integer.toString(total);            
            request.setAttribute("message", "Result: " + finalTotal);
            }
            catch (NumberFormatException ex){
                request.setAttribute("message", "Result: " + "Invalid" );
            }
             
            request.setAttribute("first", firstvalue);
            request.setAttribute("second", secondvalue);      
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
}

    