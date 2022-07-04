package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

	private final String base = "clinica";
	private final String user = "root";
	private final String password = "";
	private final String url = "jdbc:mysql://localhost:3306/" + base;
	private Connection con = null;
	
public Connection getConexion() {
		
	
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	
	 
	return con;
	}
}
