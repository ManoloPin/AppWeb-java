package webnews.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MenuServlet
 */
@WebServlet("/menu.view")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("hola Mundo 2: ").append(request.getContextPath());
        
        PrintWriter out = response.getWriter();
        out.println (
                  "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" +" +
                      "http://www.w3.org/TR/html4/loose.dtd\">\n" +
                  "<html> \n" +
                    "<head> \n" +
                      "<meta http-equiv=\"Content-Type\" content=\"text/html; " +
                        "charset=ISO-8859-1\"> \n" +
                      "<title> Login  </title> \n" +
                    "</head> \n" +
                    "<body> \n" +
                    "<h1>si conecto</h1>"+
                        "<header>\n" + 
                        "        	<div class=\"contenedor\">\n" + 
                        "        		<nav>\n" + 
                        "        			<ul>\n" + 
                        "        				<li class=\"menu.view\"><a href=\"\">Inicio</a></li>\n" + 
                        "        				<li><a href=\"longboard.html\">Comentarios</a></li>\n" + 
                        "        				<li><a href=\"dsjffdfg.jsp\">Preguntas</a></li>\n" + 
                        "        				<li><a href=\"dsjffdfg.jsp\">Publicar</a></li>\n" + 
                        "        				<li><a href=\"\">salir</a></li>\n" + 
                        "        				\n" + 
                        "        			</ul>\n" + 
                        "        		</nav>\n" + 
                        "        	</div>\n" + 
                        "</header>"+    
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
