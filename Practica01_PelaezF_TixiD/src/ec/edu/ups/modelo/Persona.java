package ec.edu.ups.modelo;

public class Persona {
	private int personaId;
	private String personaCedula;
	private String personaNombre;
	private String personaApellido;
	private String personaRol;
	private String personaTelfono;
	private String personaDireccion;
	private String personaEmail;
	private String personaContrasena;
	private Empresa empresa;
	
	public int getPersonaId() {
		return personaId;
	}
	public void setPersonaId(int personaId) {
		this.personaId = personaId;
	}
	public String getPersonaCedula() {
		return personaCedula;
	}
	public void setPersonaCedula(String personaCedula) {
		this.personaCedula = personaCedula;
	}
	public String getPersonaNombre() {
		return personaNombre;
	}
	public void setPersonaNombre(String personaNombre) {
		this.personaNombre = personaNombre;
	}
	public String getPersonaApellido() {
		return personaApellido;
	}
	public void setPersonaApellido(String personaApellido) {
		this.personaApellido = personaApellido;
	}
	public String getPersonaRol() {
		return personaRol;
	}
	public void setPersonaRol(String personaRol) {
		this.personaRol = personaRol;
	}
	public String getPersonaTelfono() {
		return personaTelfono;
	}
	public void setPersonaTelfono(String personaTelfono) {
		this.personaTelfono = personaTelfono;
	}
	public String getPersonaDireccion() {
		return personaDireccion;
	}
	public void setPersonaDireccion(String personaDireccion) {
		this.personaDireccion = personaDireccion;
	}
	public String getPersonaEmail() {
		return personaEmail;
	}
	public void setPersonaEmail(String personaEmail) {
		this.personaEmail = personaEmail;
	}
	public String getPersonaContrasena() {
		return personaContrasena;
	}
	public void setPersonaContrasena(String personaContrasena) {
		this.personaContrasena = personaContrasena;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	
}
