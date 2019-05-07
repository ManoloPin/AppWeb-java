package webnews.controller.publicaciones;

import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse; 

import webnews.model.publicaciones.*;

/*
 * 
 * GUARDAR DE PUBLICACION
 * 
 * */

@WebServlet("/GuardarPubli")  
public class Guardar extends HttpServlet {  
	private static final long serialVersionUID = 1L;

	 public Guardar() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)   
         throws ServletException, IOException {  
		
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
         
        String Titulo = request.getParameter("txtTitulo"); 
        String URL    = request.getParameter("txtURL");     
          
        Publicacion e=new Publicacion();  
        
        e.setTitulo(Titulo);
        e.setUrl(URL);  
           
          
        int status=publicacionDAO.save(e);  
        if(status>0){  
            out.print("<p>Registro guardado con éxito!</p>");  
            request.getRequestDispatcher("login.jsp").include(request, response);  
        }else{  
            out.println("¡Lo siento! incapaz de guardar el registro");  
        }  
          
        out.close();  
    }  
  
}  