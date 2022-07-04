package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SqlreservarHora extends conexion  {

		public boolean registrar(reservarHora usr)
		{
			PreparedStatement ps = null;
			Connection con = getConexion();
			
			String sql = "INSERT INTO reservarHora(rutDueño, nombreMascota, hora, fecha) VALUES(?,?,?,?)";
			
			
			try {
				ps = con.prepareStatement(sql);
				ps.setString(1, usr.getRutDueño());
				ps.setString(2, usr.getNombreMascota());
				ps.setString(3, usr.getHora());
				ps.setString(4, usr.getFecha());
				ps.execute();
				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} return false;
			
			
		}
	
}
