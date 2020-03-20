import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(
    name = "LogInPage",
    urlPatterns = {"/login1"}
)
public class LogInPage extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) 
      throws IOException, ServletException {

    response.setContentType("text/html");
    response.setCharacterEncoding("UTF-8");
    PrintWriter out=response.getWriter();

   
    String name= request.getParameter("name");
    String password= request.getParameter("password");
    boolean result=Validation.valid(name,password);
 

    
    if(result)
    {
    	
    	
    	    HttpSession session = request.getSession();

 	       session.setAttribute("name", name);
 	       response.sendRedirect("Todopage");
    }
    
    else
    {
    	
   	   request.setAttribute("result1","invalid credentials");
       RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
 	   dispatcher.include(request,response);
 	  
 	  
    } 
  }}  																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
   	   																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													