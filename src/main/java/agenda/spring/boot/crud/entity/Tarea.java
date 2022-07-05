package agenda.spring.boot.crud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tareas")
public class Tarea {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nombre;
	private Boolean realizado;
	
	public Tarea(Integer id, String nombre,Boolean realizado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.realizado=realizado;
		
	}
	
	public Tarea() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	public Tarea(String nombre, Boolean realizado) {
		super();
		this.nombre = nombre;
		this.realizado = realizado;
	}

	public Boolean getRealizado() {
		return realizado;
	}

	public void setRealizado(Boolean realizado) {
		this.realizado = realizado;
	}
}
