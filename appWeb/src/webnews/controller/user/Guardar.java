package webnews.controller.user;

import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse; 

import webnews.model.usuarios.*;

@WebServlet("/Guardar")  
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
         
        String email=request.getParameter("txtMail");
        String password=request.getParameter("txtPass");    
          
        user e=new user();  
        
        e.setCorreo(email);
        e.setPassword(password);  
           
          
        int status=registroDAO.save(e);  
        if(status>0){  
            out.print("<p>Registro guardado con éxito!</p>");  
            request.getRequestDispatcher("login.jsp").include(request, response);  
        }else{  
            out.println("Sorry!  incapaz de guardar el registro");  
        }  
          
        out.close();  
    }  
  
}  