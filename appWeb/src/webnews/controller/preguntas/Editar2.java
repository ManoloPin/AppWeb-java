package webnews.controller.preguntas;

import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;

import webnews.model.preguntas.*;

@WebServlet("/EditarPregunta2")  
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
        
        String Texto=request.getParameter("txtTexto");
       // String password=request.getParameter("txtPass");  
          
  
          
        pregunta e=new pregunta();  
        e.setId_pregunta(id);  
        e.setTexto(Texto);
         
    
        int status=PreguntasDAO.update(e);  
        if(status>0){  
            response.sendRedirect("Ver");  
        }else{  
        	request.getRequestDispatcher("publicacion.jsp").include(request, response);
            out.println("Sorry! unable to update record");  
        }  
          
        out.close();  
    }  
  
} 