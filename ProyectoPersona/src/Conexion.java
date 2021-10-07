import java.sql.*;

public class Conexion {
	public static Connection conectar() {
		Connection con = null;
		
		String password = "root";
		String usuario = "root";
		String url = "jdbc:mysql://localhost:3306/Persona?user=" + usuario
				+ "&password=" + password;
		try {
			con = DriverManager.getConnection(url);
			if (con != null) {
				System.out.println("Conectado");
			}
		} catch (SQLException e) {
			System.out.println("No se pudo conectar a la base de datos");
			e.printStackTrace();
		}
		return con;
	}
}
