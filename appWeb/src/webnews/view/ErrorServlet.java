package webnews.view;

import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import webnews.model.usuarios.Error;

/**
 * Servlet implementation class ErrorServlet
 */
@WebServlet("/Error.view")
public class ErrorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ErrorServlet() {

        super();
        // TODO Auto-generated constructor stub
    }
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//        PrintWriter out = response.getWriter();
//		
//		HttpSession session = request.getSession();
//		List<Error> errors = (List<Error>)session.getAttribute("errors");
//		
//		try {
//			out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Error</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Error! :D</h1>");
//            
//            for(Error e : errors){
//                out.println("["+e.getId()+"] "+e.getDescription());
//            }
//            
//            out.println("<a href='index.jsp'>Volver</a>");
//            
//            out.println("</body>");
//            out.println("</html>");
//		}finally {
//			out.close();
//		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
