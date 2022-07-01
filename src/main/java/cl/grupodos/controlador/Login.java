package cl.grupodos.controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try (PrintWriter out = response.getWriter()){
			String usuario = "admin";
            String clave = "1234";
            String user=request.getParameter("usuario");
            String pass=request.getParameter("clave");
            
            if(user.length() > 0){
                if( usuario.equals(user)){
                    if(pass.length() > 0){
                        if(pass.equals(clave)){                           
                            out.println("<script>alert(\"siii\");</script>");                       
                            getServletContext().getRequestDispatcher("/views/Formulario.jsp").forward(request, response);
                           
                        }else{ 
                        	getServletContext().getRequestDispatcher("/views/validacion.jsp").forward(request, response);
                        	out.println("<script type=\"text/javascript\">\r\n" + "    alert('ContraseÃ±a Incorrecta');\r\n"
                        			+ "</script>");
                            
                            
                           
                        }
                    }else{                            
                            out.println("Debe ingresar una contraseÃ±a");                            
                            getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);
                           
                    }
                }else{
                   ;
                    out.println("Usuario incorrecta");                   
                    getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);
                    
                }
            }else{
                
                out.println("Debe ingresar un usuario");                
                getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);
                
            }
		}
	}

}
