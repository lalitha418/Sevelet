

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Todopage")
public class Todopage extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	  	 //response.getWriter().print("welcome");
		 ArrayList<String> list =new ArrayList<>();
		 
	       list.add("name1");
	      list.add("name2");
	       request.setAttribute("list", list);
	       HttpSession session = request.getSession();

	       if(session.getAttribute("name")==(null))
	       {
	     	response.sendRedirect("Login.jsp");
	     				}
	       

		 RequestDispatcher dispatcher = request.getRequestDispatcher("Todo.jsp");
	 	   dispatcher.forward(request,response);
	}

}
