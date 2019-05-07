package webnews.controller.publicaciones;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;  

import webnews.model.publicaciones.*;
  
/*
 * EDITAR PUBLICACION
 * 
 * */
@WebServlet("/EditarPublic")  
public class Editar extends HttpServlet {  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)   
           throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println("<h1>Update Employee</h1>");  
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
          
        Publicacion e=publicacionDAO.getEmployeeById(id);  
          
        out.print("<form action='Editar2' method='post'>");  
        out.print("<table>");  
        out.print("<tr><td></td><td><input type='hidden' name='id' value='"+e.getIDNoticia()+"'/></td></tr>");  
        out.print("<tr><td>Titulo:</td><td><input type='text' name='txtTitulo' value='"+e.getTitulo()+"'/></td></tr>");
        out.print("<tr><td>URL:</td><td><input type='textarea' name='txtURL' value='"+e.getUrl()+"'/> </td></tr>");    
        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
        out.print("</table>");  
        out.print("</form>");  
          
        out.close();  
    }  
}  