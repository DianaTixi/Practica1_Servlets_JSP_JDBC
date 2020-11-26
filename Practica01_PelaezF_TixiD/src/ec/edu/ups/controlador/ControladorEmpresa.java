package ec.edu.ups.controlador;

import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.dao.EmpresaDAOImpl;
import ec.edu.ups.idao.EmpresaDAO;
import ec.edu.ups.modelo.Empresa;
import ec.edu.ups.vista.VistaEmpresa;

public class ControladorEmpresa {
	private VistaEmpresa vistaE = new VistaEmpresa();

	public ControladorEmpresa() {
	}	
	//llama al DAO para guardar un Empresa
	public void registrarE(Empresa empresa ) {
		EmpresaDAO dao= new  EmpresaDAOImpl();
		dao.registarE(empresa);
	}
	
	//llama al DAO para obtener datos de la empresa 
	public void verEmpresa() {
		List<Empresa> empresa = new ArrayList<Empresa>();
		EmpresaDAO dao = new EmpresaDAOImpl();
		empresa= dao.obtener();
		vistaE.verEmpresa(empresa);
	}
	
	

}
