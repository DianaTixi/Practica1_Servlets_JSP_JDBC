package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorEmpresa;
import ec.edu.ups.controlador.ControladorPersona;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ControladorPersona controlPersona = new ControladorPersona();
		
		controlPersona.verPersonas();*/
		ControladorEmpresa controlE = new ControladorEmpresa();
		controlE.verEmpresa();
	}

}
