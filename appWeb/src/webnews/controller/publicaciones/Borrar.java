package webnews.controller.publicaciones;

import java.io.IOException;  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;

import webnews.model.publicaciones.*;

/*
 * BORRAR PUBLICACION
 * */
@WebServlet("/BorrarPublic")  

public class Borrar extends HttpServlet {  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)   
             throws ServletException, IOException {  
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
        publicacionDAO.delete(id);  
        response.sendRedirect("Ver");  
    }  
}  