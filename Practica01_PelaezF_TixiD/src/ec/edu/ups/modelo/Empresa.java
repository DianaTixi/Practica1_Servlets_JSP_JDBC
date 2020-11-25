package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.*;

public class Empresa {
	private int empresaId;
	private String empresaNombre;
	private String empresaRuc;
	private String empresaDireccion;
	private String empresaTelefono;
	private String empresaEmail;
	private List<Producto> producto = new ArrayList<>();
	private List<Persona> persona = new ArrayList<>();
	
	public int getEmpresaId() {
		return empresaId;
	}
	public void setEmpresaId(int empresaId) {
		this.empresaId = empresaId;
	}
	public String getEmpresaNombre() {
		return empresaNombre;
	}
	public void setEmpresaNombre(String empresaNombre) {
		this.empresaNombre = empresaNombre;
	}
	public String getEmpresaRuc() {
		return empresaRuc;
	}
	public void setEmpresaRuc(String empresaRuc) {
		this.empresaRuc = empresaRuc;
	}
	public String getEmpresaDireccion() {
		return empresaDireccion;
	}
	public void setEmpresaDireccion(String empresaDireccion) {
		this.empresaDireccion = empresaDireccion;
	}
	public String getEmpresaTelefono() {
		return empresaTelefono;
	}
	public void setEmpresaTelefono(String empresaTelefono) {
		this.empresaTelefono = empresaTelefono;
	}
	public String getEmpresaEmail() {
		return empresaEmail;
	}
	public void setEmpresaEmail(String empresaEmail) {
		this.empresaEmail = empresaEmail;
	}
	public List<Producto> getProducto() {
		return producto;
	}
	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}
	public List<Persona> getPersona() {
		return persona;
	}
	public void setPersona(List<Persona> persona) {
		this.persona = persona;
	}
	
	
}
