package ec.edu.ups.vista;

import java.util.List;

import ec.edu.ups.modelo.Empresa;

public class VistaEmpresa {
	
	public void verEmpresa(Empresa empresa) {
		//System.out.println("Datos de la Empresa: "+empresa);
	}
	
	public void verEmpresa(List<Empresa> empresa) {
		for (Empresa empresas : empresa) {
			System.out.println("Datos del Empresa: "+empresas);
		}		
	}

}
