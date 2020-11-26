package ec.edu.ups.idao;

import java.util.List;

import ec.edu.ups.modelo.Persona;

public interface PersonaDAO {
	public boolean registar (Persona persona);
	public List<Persona>obtener();
	public boolean actualizar(Persona persona);
	public boolean eliminar(Persona persona);

}
