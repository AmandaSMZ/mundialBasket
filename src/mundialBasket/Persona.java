package mundialBasket;

import java.time.LocalDate;
import java.time.Period;

/**
 * Clase que representa a todos los integrantes de la selección
 * @author Amanda
 * @version 1.0
 * 
 */

public abstract class Persona {
	protected int id;
	protected String nombre;
	protected String apellidos;
	protected LocalDate fechaNac;
	
	 /**
     * Constructor de la clase Persona.
     *
     * @param id        El identificador de la persona.
     * @param nombre    El nombre de la persona.
     * @param apellidos Los apellidos de la persona.
     * @param fechaNac  La fecha de nacimiento de la persona en formato String (aaaa-mm-dd).
     */
	
	protected Persona(int id, String nombre, String apellidos, String fechaNac) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNac = LocalDate.parse(fechaNac);
	}
	
	/**
	 * Método que calcula la edad de la persona.
	 * @return Devuelve el número de años (int).
	 */
	public int calcularEdad() {
		Period periodo = Period.between(this.fechaNac, LocalDate.now());
		return periodo.getYears();
	}
	
	/**
	 * Método para obtener el número de ID
	 * @return un entero (ID)
	 */
	public int getId() {
		return id;
	}
	/**
	 * Método para modificiar el número de ID
	 * @param id Nuevo número de ID en formato int
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Método para obtener el nombre
	 * @return Nombre en formato String
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Método para cambiar el nombre
	 * @param nombre Nuevo nombre en formato String
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Método para obtener los apellidos
	 * @return Apellidos en formato String
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * Método para modificar los apellidos
	 * @param apellidos Nuevos apellidos en formato String
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * Método para obtener la fecha de nacimiento
	 * @return Fecha de nacimiento en formato LocalDate
	 */
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	/**
	 * Método común a todos los integrantes de la selección
	 * Imprime por pantalla un aviso de que se concentran antes de un partido
	 */
	public void concentrarse() {
		System.out.println("Concentrandose 2 días antes del partido.");
	}
	/**
	 * Método abstracto que implementan todos los integrantes de la selección
	 */
	public abstract void viajar();
	/**
	 * Método para mostrar por pantalla la información de la persona
	 */
	@Override
	public String toString() {
		return "ComponenteSeleccion [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNac="
				+ fechaNac + "]";
	}
	
}
