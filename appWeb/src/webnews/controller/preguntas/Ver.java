package webnews.controller.preguntas;

import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.List;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

import webnews.model.preguntas.*;

@WebServlet("/VerPregunta")  
public class Ver extends HttpServlet {  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)   
               throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        request.getRequestDispatcher("index.jsp").include(request, response); 
        List<pregunta> list=PreguntasDAO.getAllEmployees();  
          
        out.print("<table  width='100%'");  
      //  out.print("<tr><th>Id</th><th>Email</th><th>Password</th> <th>Edit</th><th>Delete</th></tr>");  
        for(pregunta e:list){  
         out.print("<tr><td>"+e.getTexto()+"<br></td></tr>");
        		// "</td><td><a href='Editar?id="+e.getId_pregunta()+"'>edit</a></td>  <td><a href='Borrar?id="+e.getId_pregunta()+"'>delete</a></td></tr>");  
        }  
        out.print("</table>");  
          
        out.close();  
    }  
}  
