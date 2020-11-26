package ec.edu.ups.dao;


import java.util.ArrayList;
import java.util.List;

import java.sql.DriverManager; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection; 

import ec.edu.ups.conexion.*;
import ec.edu.ups.idao.PersonaDAO;
import ec.edu.ups.modelo.Empresa;
import ec.edu.ups.modelo.Persona;

public  class PersonaDAOImpl implements PersonaDAO{
 
	@Override
	public boolean registar(Persona persona) { 
		// TODO Auto-generated method stub
		boolean registar = false;
		Statement stm = null;
		Connection con= null;
		
		String sql = "INSERT INTO GES_Persona values (NULL,'"+persona.getPersonaCedula()+"','"+persona.getPersonaNombre()+"','"+persona.getPersonaApellido()+"','"+persona.getPersonaRol()
		+"','"+persona.getPersonaTelfono()+"','"+persona.getPersonaDireccion()+"','"+"','"+persona.getPersonaEmail()+"','"+"','"+persona.getPersonaContrasena()+"','"+persona.getEmpresa().getEmpresaId()+"')";
		
		try {
			con= Conexion.conectar();
			stm= con.createStatement();
			stm.execute(sql);
			registar=true;
			stm.close();
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return registar; 
	}

	@Override
	public List<Persona> obtener() {
		// TODO Auto-generated method stub
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM GES_Personas ORDER BY ID";
		
		List<Persona> listaPersona= new ArrayList<Persona>();
		
		try {			
			co= Conexion.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Persona p =new Persona();
				p.setPersonaId(rs.getInt(1));
				p.setPersonaCedula(rs.getString(2));
				p.setPersonaNombre(rs.getString(3));
				p.setPersonaApellido(rs.getString(4));
				p.setPersonaRol(rs.getString(5));
				p.setPersonaTelfono(rs.getString(6));
				p.setPersonaDireccion(rs.getString(7));
				p.setPersonaEmail(rs.getString(8));
				p.setPersonaContrasena(rs.getString(9));
				listaPersona.add(p);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método obtener");
			e.printStackTrace();
		}
		
		return listaPersona;
	}

	@Override
	public boolean actualizar(Persona persona) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminar(Persona persona) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
