package aplicacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConexion {
	
	public static Connection getSQLConexion() {
		String url = "jdbc:sqlserver://(localdb)\\MSSQLLocalDB:1433;"
				+ "database=Sistema de Cooperativa;"
				+ "user=DESKTOP-H3UEIMG\\victo;";

		try {
			Connection con = DriverManager.getConnection(url);
			return con;
		} catch (SQLException e) {
			System.out.println(e.toString());
			return null;
		}
	}
}
