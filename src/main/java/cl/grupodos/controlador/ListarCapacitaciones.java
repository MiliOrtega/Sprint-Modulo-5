package cl.grupodos.controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.grupodos.lista.CapacitacionService;
import cl.grupodos.modelo.Capacitacion;

/**
 * Servlet implementation class ListarCapacitaciones
 */
@WebServlet("/ListarCapacitaciones")
public class ListarCapacitaciones extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarCapacitaciones() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
CapacitacionService capacitacion = new CapacitacionService();
		
		
		
		ArrayList<Capacitacion> c = (ArrayList<Capacitacion>)capacitacion.getAll();
		
		request.setAttribute("capacitacion", c);
		
		/** *try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Existe");
			
		} catch (Exception e) {
			System.out.println("No Existe");
		}*/
		
		getServletContext().getRequestDispatcher("/views/ListarCapacitacion.jsp").forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
