/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 818396
 */
public class arithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         String first = request.getParameter("first_num");
         String second = request.getParameter("second_num");
         
         
         if(first == null || first.equals("") || second ==null || second.equals("") || first.matches("[a-zA-Z-+ ]") || second.matches("[a-zA-Z-+ ]")){
             request.setAttribute("message", "Invalid");
             getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request,response); 
             return;
         }else {
             int first_ = Integer.parseInt(first);
             int second_ = Integer.parseInt(second);
             if( request.getParameter("operator").equals( "+")){
                 request.setAttribute("message", first_+second_);
             }else if(request.getParameter("operator").equals( "-")){
                 request.setAttribute("message", first_-second_);
             }else if(request.getParameter("operator").equals( "*")){
                 request.setAttribute("message", first_*second_);
             }else{
                 request.setAttribute("message", first_%second_);
             }
         }
         
       
          getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response); 
    }

}
