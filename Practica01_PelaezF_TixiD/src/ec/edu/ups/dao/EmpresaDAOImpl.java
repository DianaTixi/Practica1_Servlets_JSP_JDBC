package ec.edu.ups.dao;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.ResultSet;

import ec.edu.ups.conexion.Conexion;
import ec.edu.ups.idao.EmpresaDAO;
import ec.edu.ups.modelo.Empresa;

public class EmpresaDAOImpl implements EmpresaDAO {
	Statement stm = null;
	Connection con = null;
	ResultSet rs= null;

	@Override
	public boolean registarE(Empresa empresa) {
		boolean registarE = false; 
		String sql = "INSERT INTO cliente values (NULL,'"+empresa.getEmpresaNombre()+"','"+empresa.getEmpresaRuc()+"','"+empresa.getEmpresaDireccion()+
													"','"+empresa.getEmpresaTelefono()+"','"+empresa.getEmpresaEmail()+"')";
		try {
			con = Conexion.conectar();
			stm= con.createStatement();
			stm.execute(sql);
			registarE=true;
			stm.close();
			con.close();
		} catch (Exception e) {
			System.out.println("Error: Clase ClienteDaoImple, método registrar");
			e.printStackTrace();
		}
		return registarE;
	}

	@Override
	public List<Empresa> obtener() {
		String sql = "Select * from GES_Empresas";
		List <Empresa> listarEmpresa = new ArrayList<Empresa>();
		
		try {
			con = Conexion.conectar();
			stm = con.createStatement();
			rs= stm.executeQuery(sql);
			while (rs.next()) {
				Empresa e = new Empresa();
				e.setEmpresaId(rs.getInt(1));
				e.setEmpresaNombre(rs.getString(2));
				e.setEmpresaRuc(rs.getString(3));
				e.setEmpresaDireccion(rs.getString(4));
				e.setEmpresaTelefono(rs.getString(5));
				e.setEmpresaEmail(rs.getString(6));
				listarEmpresa.add(e);
				//System.out.println(e);
			}
			stm.close();
			rs.close();
			con.close();
		} catch (Exception e) {
			System.out.println("Error: Clase ClienteDaoImple, método obtener");
			e.printStackTrace();
		}
		return listarEmpresa;
	}

	@Override
	public boolean actualizar(Empresa empresa) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminar(Empresa empresa) {
		// TODO Auto-generated method stub
		return false;
	}

}
