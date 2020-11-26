package ec.edu.ups.vista;

import java.util.List;

import ec.edu.ups.modelo.Persona;

public class VistaPersona {
	
	// ver clientes
			
	public void verPersona(Persona persona) {
		System.out.println("Datos de la Persona: "+persona);
	}
	
	public void verPersona(List<Persona> persona) {
		for (Persona personas : persona) {
			System.out.println("Datos del Cliente: "+persona);
		}		
	}

}
