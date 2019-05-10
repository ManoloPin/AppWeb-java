package webnews.controller.publicaciones;

import java.io.IOException;  
import java.io.PrintWriter;

import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

import webnews.model.publicaciones.*;

/*
 * 
 * GUARDAR DE PUBLICACION
 * 
 * */

@WebServlet("/GuardarPubli")  
public class GuardarPubli extends HttpServlet {  
	private static final long serialVersionUID = 1L;

	 public GuardarPubli() {
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
//        HttpSession session = request.getSession(true);
        
//        java.util.Date d = new java.util.Date();  
//        SimpleDateFormat plantilla = new SimpleDateFormat("dd/MM/yyyy H:mm");
//        
//        String tiempo = plantilla.format(d);
//        
        //java.sql.Date date2 = new java.sql.Date(d.getTime());       
        String Titulo = request.getParameter("txtTitulo"); 
        String URL    = request.getParameter("txtURL"); 
        
   //     String email= session.getAttribute("email").toString();
        
          
        Publicacion e=new Publicacion();  
        
        e.setTitulo(Titulo);
        e.setUrl(URL); 

           
          
        int status=publicacionDAO.save(e);
        if(status>0){    
            request.getRequestDispatcher("publicacion.jsp").include(request, response);
            out.print("<p>Registro guardado con éxito!</p>");
        }else{  
            out.println("¡Lo siento! incapaz de guardar el registro");  
        }  
          
        out.close();  
    }  
  
}  