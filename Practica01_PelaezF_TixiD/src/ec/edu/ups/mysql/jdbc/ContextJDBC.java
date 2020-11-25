package ec.edu.ups.mysql.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sun.jdi.connect.spi.Connection;

import ec.edu.ups.mysql.jdbc.ContextJDBC;

public class ContextJDBC {
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/GESTION_COMPRAS?serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASS = "DFTUrptu9799";
	private static ContextJDBC jdbc1 = null;
	private Statement statement = null;
	
	
	public ContextJDBC() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected static ContextJDBC gettJDBC1() {
		//Creacion de la conexion solo si no se ha creado de diseño singleton
		if (jdbc1 == null) {
			jdbc1 = new ContextJDBC();			
		}
		return jdbc1;
	}
	
	/**
	 * Metodo Connect
	 * Conexion a la base a traves de JDBC
	 */
	public void connect() {
		try {
			Class.forName(DRIVER);
			java.sql.Connection connection = DriverManager.getConnection(URL,USER,PASS);
			this.statement = connection.createStatement();
		} catch (ClassNotFoundException e) {
			System.out.println("---WARMING (JDBC: CONNECT)...problemas del driver\n " + e.getMessage());
		}catch (SQLException e) {
			System.out.println("---WARMING (JDBC: CONNECT)...problemas con la BD\n " + e.getMessage());
		}
	}
	
	/**
	 * Metodo Query
	 * Sentencia Select a la base 
	 */
	public ResultSet query(String sql) {
		try {
			return this.statement.executeQuery(sql);
		} catch (SQLException e) {
			// TODO: handle exception
		}return null;

	}

	/**
	 * Metodo Update
	 * Puede realizar una sentencia de agregar, modificar, eliminar, listar 
	 */
	
	public boolean update(String sql) {
		try {
			this.statement.executeUpdate(sql);
			return true;
		} catch (SQLException e) {
			System.out.println("WARNING (JDBC:update)... actualizacion: ---" + sql + "---" + e);
			return false;
		}
		
		
		
	}
	

}
