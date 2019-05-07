package webnews.controller.comentarios;

import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.List;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

import webnews.model.comentarios.*;

@WebServlet("/VerComentario")  
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
          
        List<comentario> list=ComentariosDAO.getAllEmployees();  
          
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>Id</th><th>Email</th><th>Password</th> <th>Edit</th><th>Delete</th></tr>");  
        for(comentario e:list){  
         out.print("<tr><td>"+e.getId_Comentario()+
        		 "</td><td>"+e.getId_usu()+
        		 "</td><td>"+e.getIDNoticia()+
        		 "</td><td>"+e.getDescripcion()+
        		 "</td><td><a href='Editar?id="+e.getId_Comentario()+"'>edit</a></td>  <td><a href='Borrar?id="+e.getId_Comentario()+"'>delete</a></td></tr>");  
        }  
        out.print("</table>");  
          
        out.close();  
    }  
}  
