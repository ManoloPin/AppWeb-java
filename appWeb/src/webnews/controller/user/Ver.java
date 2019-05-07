package webnews.controller.user;

import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.List;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

import webnews.model.usuarios.*;

@WebServlet("/Ver")  
public class Ver extends HttpServlet {  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)   
               throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println("<a href='index.jsp'>Add New Employee</a>");  
        out.println("<h1>Employees List</h1>");  
          
        List<user> list=registroDAO.getAllUsers();  
          
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>Id</th><th>Email</th><th>Password</th> <th>Edit</th><th>Delete</th></tr>");  
        for(user e:list){  
         out.print("<tr><td>"+e.getId()+
        		 "</td><td>"+e.getCorreo()+
        		 "</td><td>"+e.getPassword()+
        		 "</td><td><a href='Editar?id="+e.getId()+"'>edit</a></td>  <td><a href='Borrar?id="+e.getId()+"'>delete</a></td></tr>");  
        }  
        out.print("</table>");  
          
        out.close();  
    }  
}  
