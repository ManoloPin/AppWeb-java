package webnews.controller.preguntas;

import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse; 

import webnews.model.preguntas.*;

@WebServlet("/GuardarPregunta")  
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
         
        String Texto=request.getParameter("Texto");
        //String password=request.getParameter("txtPass");    
          
        pregunta e=new pregunta();  
        
        e.setTexto(Texto); 
           
          
        int status=PreguntasDAO.save(e);  
        if(status>0){  
             
            request.getRequestDispatcher("publicacion.jsp").include(request, response);  // corregir
            out.print("<p>Registro guardado con éxito!</p>");
        }else{  
        	request.getRequestDispatcher("publicacion.jsp").include(request, response);  // corregir
            out.println("Sorry!  incapaz de guardar el registro");  
        }  
          
        out.close();  
    }  
  
}  