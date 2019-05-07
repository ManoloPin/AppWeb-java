package webnews.controller.comentarios;

import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;

import webnews.model.comentarios.*;

@WebServlet("/EditarComentario2")  
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
        
        String Descripcion=request.getParameter("txtDes");  
          
          
        comentario e=new comentario();  
        e.setId_Comentario(id);  
        e.setDescripcion(Descripcion);
         
    
        int status=ComentariosDAO.update(e);  
        if(status>0){  
            response.sendRedirect("Ver");  
        }else{  
            out.println("Sorry! unable to update record");  
        }  
          
        out.close();  
    }  
  
} 