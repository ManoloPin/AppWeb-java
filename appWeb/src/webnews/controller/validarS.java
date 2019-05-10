package webnews.controller;

//import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
//import java.io.PrintWriter;
//import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import com.mysql.cj.xdevapi.Statement;

//import webnews.model.usuarios.Error;
import webnews.model.usuarios.registroDAO;
import webnews.model.usuarios.user;

/**
 * Servlet implementation class validarS
 */
@WebServlet("/validarS.do")
public class validarS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public validarS() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at hola mundo: ").append(request.getContextPath());

		// TODO Auto-generated method stub
		//response.getWriter().append("Served at hola mundo: ").append(request.getContextPath());
        
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter(); 
		
        String email=request.getParameter("txtMail");
        String password=request.getParameter("txtPass");
		
        user e = registroDAO.validate(email,password);
          
	        
        HttpSession session = request.getSession();
	    if(e != null) {
	    	
	    	/*Menu*/
	    	session.setAttribute("user", e);
	        request.getRequestDispatcher("index.jsp").forward(request, response);// cambiar
	    	
	    }else {
	    	  
	    	/*Enviar a error.view (Lista errores)*/
            //List<Error> errors =e.getErrors();
            session.setAttribute("user", e);
            request.getRequestDispatcher("login.jsp").forward(request, response);
	    }
        
        out.close();
	        	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
