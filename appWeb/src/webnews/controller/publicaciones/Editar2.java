package webnews.controller.publicaciones;

import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;

import webnews.model.publicaciones.*;

@WebServlet("/EditarPublic2")  
public class Editar2 extends HttpServlet {  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)   
          throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
        
        String Titulo = request.getParameter("txtTitulo");
        String URL    = request.getParameter("txtURL");  
          
  
          
        Publicacion e=new Publicacion();  
        e.setIDNoticia(id);  
        e.setTitulo(Titulo);
        e.setUrl(URL);  
         
    
        int status=publicacionDAO.update(e);  
        if(status>0){  
            response.sendRedirect("Ver");  
        }else{  
            out.println("¡Lo siento! incapaz de actualizar el registro");  
        }  
          
        out.close();  
    }  
  
} 