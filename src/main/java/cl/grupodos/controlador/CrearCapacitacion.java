package cl.grupodos.controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.grupodos.implementacion.ImplementacionCapacitacion;
import cl.grupodos.interfaces.ICapacitacion;
import cl.grupodos.modelo.Capacitacion;

/**
 * Servlet implementation class CrearCapacitacion
 */
@WebServlet("/CrearCapacitacion")
public class CrearCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearCapacitacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/views/Capacitacion.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
				
		String id = request.getParameter("id");
		String nombreCapacitacion = request.getParameter("nombreCapacitacion");
		String lugar = request.getParameter("lugar");
		String hora = request.getParameter("hora");	
		
		ICapacitacion capacitaciones = new ImplementacionCapacitacion();
		capacitaciones.addCapacitacion(new Capacitacion(id, nombreCapacitacion, lugar, hora));
		
		pw.println("<html><body>");
		pw.println("<h1>Capacitacion Creada </h1>");		
		pw.println("<p> ID Capacitacion: " + id + "</p>");
		pw.println("<p> Capacitacion: " + nombreCapacitacion + "</p>");
		pw.println("<p> Fecha: " + lugar + "</p>");	
		pw.println("<p> Lugar: " + hora + "</p>");
		pw.println("<p>"+ "Su capacitacion fue agregada exitosamente" +"</p>");
		pw.println("</body><html>");
		
		pw.close();
	}
	

}
