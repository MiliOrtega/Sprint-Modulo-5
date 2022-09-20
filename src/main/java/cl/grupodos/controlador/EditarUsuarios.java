package cl.grupodos.controlador;

import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import cl.grupodos.implementacion.ImplementacionUsuario;
import cl.grupodos.interfaces.IUsuario;

/**
 * Servlet implementation class EditarCliente
 */
@WebServlet("/EditarUsuarios")
public class EditarUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private IUsuario usuario = new ImplementacionUsuario();
    		
    		
    public EditarUsuarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String id = request.getParameter("id");
		System.out.println("Funciona");
		if (id == null) {
			request.setAttribute("ListarUsuarios", usuario.getAll());
			getServletContext().getRequestDispatcher("/views/ListarUsuarios.jsp").forward(request, response);	
		} else {
			
			getServletContext().getRequestDispatcher("/views/EditarUsuarios.jsp").forward(request, response);
			
		}
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("Id");
		String name = request.getParameter("name");
		
		EditarUsuarios editarUsuarios= new EditarUsuarios();
		
	    usuario.actualizarUsuario();
		
		request.setAttribute("ListarUsuarios", usuario.getAll());
		getServletContext().getRequestDispatcher("/views/ListarUsuarios.jsp").forward(request, response);
		
		
		
		
	}

}
