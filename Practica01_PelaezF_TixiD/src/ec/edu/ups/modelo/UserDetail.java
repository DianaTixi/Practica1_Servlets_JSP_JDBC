package ec.edu.ups.modelo;

import java.io.Serializable;

public class UserDetail implements Serializable{
	
	/**
	 * Atributo necesario para el envio de objetos a traves de una comunicacion
	 * hacia la base de datos
	 */
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String detail;
	private User user;
	
	//Creamos la SuperClase
	public UserDetail() {
		super();
		
	}
	
	// Generar Setter and Getter
	public UserDetail(int id, String detail) {
		super();
		this.id= id;
		this.detail=detail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserDetail [id=" + id + ", detail=" + detail + ", user=" + user + "]";
	}

	
	

}
