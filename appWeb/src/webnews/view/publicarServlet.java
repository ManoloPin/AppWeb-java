package webnews.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class publicarServlet
 */
@WebServlet("/publicar.view")
public class publicarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public publicarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		   PrintWriter out = response.getWriter();
	        out.println (
	                  "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" +" +
	                      "http://www.w3.org/TR/html4/loose.dtd\">\n" +
	                  "<html> \n" +
	                    "<head> \n" +
	                      "<meta http-equiv=\"Content-Type\" content=\"text/html; " +
	                        "charset=ISO-8859-1\"> \n" +
	                      "<title> publicar  </title> \n" +
	                    "</head> \n" +
	                    "<body> \n" +
	                    "<h6> Publicar23 </h6>\n"+
	                        "<header>\n" + 
	                        "        	<div class=\"contenedor\">\n" + 
	                        "           <h1> Publicar </h1>\n"+
	                        "        	</div>\n" + 
	                        "</header>"+
	                        " <div class=\"publicacion\"\">\r\n" + 
	                        "      <form action=\"--------------FALTA------------------\" method=\"post\">\r\n" + 
	                        "      <table>\r\n" + 
	                        "        <tr><td>Titulo:</td><td><input  type=\"text\" name=\"Titulo\" placeholder=\"Titulo\" /> <br> </td></tr>\r\n" + 
	                        "        <tr><td>URL:</td><td><input type=\"text\" name=\"URL\" placeholder=\"URL\" /> <br><br> </td></tr>\r\n" + 
	                        "        <tr><td>Texto:</td><td><input type=\"textarea\" name=\"Texto\" placeholder=\"Texto\" /> <br><br> </td></tr>\r\n" + 
	                        "        <tr><td><input type=\"submit\" value=\"Enviar\"></td></tr>\r\n" + 
	                        "      </table>\r\n" + 
	                        "      </form>\r\n" + 
	                        "    \r\n" + 
	                        "    </div> "+
	                    "</body> \n" +
	                  "</html>" 
	                ); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
