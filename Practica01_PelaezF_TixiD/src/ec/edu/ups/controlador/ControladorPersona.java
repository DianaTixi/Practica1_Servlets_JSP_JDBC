package ec.edu.ups.controlador;

import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.dao.PersonaDAOImpl;
import ec.edu.ups.idao.PersonaDAO;
import ec.edu.ups.modelo.Persona;
import ec.edu.ups.vista.VistaPersona;

public class ControladorPersona {
	private VistaPersona vista = new VistaPersona();

	public ControladorPersona() {
		
	}
	//llama al DAO para guardar un cliente
		public void registar(Persona persona  ) {
			PersonaDAO dao= new PersonaDAOImpl();
			dao.registar(persona);
		}
		/**
		//llama al DAO para actualizar un cliente
		public void actualizar(Persona persona ) {
			IClienteDao dao= new  ClienteDaoImpl();
			dao.actualizar(cliente);
		}
		
		//llama al DAO para eliminar un cliente
		public void eliminar(Persona persona ) {
			IClienteDao dao= new  ClienteDaoImpl();
			dao.eliminar(cliente);
		}
		*/
		
		//llama al DAO para obtener todos los clientes y luego los muestra en la vista
		public void verPersonas(){
			List<Persona> persona = new ArrayList<Persona>();
			PersonaDAO dao= new PersonaDAOImpl();
			persona=dao.obtener();
			vista.verPersona(persona);
		}
	

}
