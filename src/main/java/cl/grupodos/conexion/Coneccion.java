package cl.grupodos.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Coneccion {
private static Connection conn;
	
	private Coneccion()	{
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/asesorias", "root", "be03jo30");
			System.out.println("Existe");
			
		} catch (Exception e) {
			System.out.println("No Existe");	
		
		}
	}
		

	/** *if (conn != null) {
		System.out.println("ConexiÃ³n correcta!");
	} else {
		System.out.println("Fallo en la conexiÃ³n!");
	}
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}catch (SQLException e) {
	e.printStackTrace();
	}
	
	}*/
	

	public static Connection getInstance() {
		if(conn ==null) {
			new Coneccion();
		}
		return conn;
	}

}
