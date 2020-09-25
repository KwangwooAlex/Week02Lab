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
public class ageCalculatorServlet extends HttpServlet {

    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         String age = request.getParameter("your_age");
         
         
         if(age == null || age.equals("")){
             request.setAttribute("message", "You must give your current age");
             getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request,response); 
             return;
         }else if(age.matches("[a-zA-Z-+ ]")){
            request.setAttribute("message", "You must enter a number.");
             getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request,response); 
             return;
         }
         else {
             int next_age = Integer.parseInt(age)+1;
             request.setAttribute("message", "your age next will be" + next_age);
         }
         
       
          getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response); 
    }

}
