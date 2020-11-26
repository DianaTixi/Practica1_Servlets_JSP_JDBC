package ec.edu.ups.conexion;

import java.sql.DriverManager; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection; 

public class Conexion { /**
	public static void main(String[] args) {
		Connection conexion = null;
		Statement sentencia = null;
		ResultSet result = null;
		
		String url = "jdbc:mysql://localhost:3306/GESTION_COMPRAS?serverTimezone=UTC";
		String user = "root";
		String pass = "DFTUrptu9799";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(url, user, pass);
			sentencia = conexion.createStatement();
			System.out.println("ConexionExitosa");
		
		} catch (ClassNotFoundException e) {
			System.out.println("Imposible cargar el driver: " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("No se pudo conectar a la base de datos");
			e.printStackTrace();
		}
	}*/

	public static Connection conectar() {
		Connection con = null;
		
		String password = "DFTUrptu9799";
		String usuario = "root";
		String url = "jdbc:mysql://localhost:3306/GESTION_COMPRAS?user=" + usuario
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
		return  con;
	}

}
