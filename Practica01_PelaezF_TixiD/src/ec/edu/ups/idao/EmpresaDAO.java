package ec.edu.ups.idao;

import java.util.List;

import ec.edu.ups.modelo.Empresa;

public interface EmpresaDAO {
	public boolean registarE(Empresa empresa);
	public List<Empresa> obtener();
	public boolean actualizar (Empresa empresa);
	public boolean eliminar(Empresa empresa);
	

}
