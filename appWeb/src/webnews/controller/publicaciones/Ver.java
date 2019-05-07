package webnews.controller.publicaciones;

import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.List;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

import webnews.model.publicaciones.*;

/*
 *  VER PUBLICACION
 *  
 * */
@WebServlet("/VerPubli")  
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
          
        List<Publicacion> list=publicacionDAO.getAllEmployees();  
          
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>Id</th><th>Email</th><th>Password</th> <th>Edit</th><th>Delete</th></tr>");  
        for(Publicacion e:list){  
         out.print("</td><td>"+e.getTitulo()+
        		 "</td><td>"+e.getUrl()+
        		 "</td><td>"+e.getId_user()+
        		 "</td><td>"+e.getFecha()+
        		 "</td><td>"+e.getNComen()+
        		 "</td><td><a href='Editar?id="+e.getIDNoticia()+"'>edit</a></td>  <td><a href='Borrar?id="+e.getIDNoticia()+"'>delete</a></td></tr>");  
        }  
        out.print("</table>");  
          
        out.close();  
    }  
}  
