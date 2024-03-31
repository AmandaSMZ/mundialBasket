package mundialBasket;

import java.time.LocalDate;
import java.time.Period;

/**
 * Clase que representa a todos los integrantes de la seleccion
 * @author Amanda
 * @version 2.0
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
	 * Metodo para calcular la edad
	 * @return edad en años (int)
	 * @since 1.0
	 * @deprecated replaced by {@link #calcularEdad()}
	 */
	public int calcularEdadAnios() {
		int edad = this.fechaNac.getYear() - LocalDate.now().getYear();
		return edad;
	}
	
	/**
	 * Metodo que calcula la edad de la persona.
	 * @return Devuelve el numero de años (int).
	 * @since 1.3
	 */
	public int calcularEdad() {
		Period periodo = Period.between(this.fechaNac, LocalDate.now());
		return periodo.getYears();
	}
	
	/**
	 * Metodo para obtener el numero de ID
	 * @return un entero (ID)
	 */
	public int getId() {
		return id;
	}
	/**
	 * Metodo para modificiar el numero de ID
	 * @param id Nuevo numero de ID en formato int
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Metodo para obtener el nombre
	 * @return Nombre en formato String
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Metodo para cambiar el nombre
	 * @param nombre Nuevo nombre en formato String
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Metodo para obtener los apellidos
	 * @return Apellidos en formato String
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * Metodo para modificar los apellidos
	 * @param apellidos Nuevos apellidos en formato String
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * Metodo para obtener la fecha de nacimiento
	 * @return Fecha de nacimiento en formato LocalDate
	 */
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	/**
	 * Metodo comun a todos los integrantes de la seleccion
	 * Imprime por pantalla un aviso de que se concentran antes de un partido
	 */
	public void concentrarse() {
		System.out.println("Concentrandose 2 días antes del partido.");
	}
	/**
	 * Metodo abstracto que implementan todos los integrantes de la seleccion
	 */
	public abstract void viajar();
	@Override
	/**
	 * Metodo para mostrar por pantalla la informacion de la persona
	 * @return devuelve un String con toda la informacion de la persona
	 */
		
	public String toString() {
		return "ComponenteSeleccion [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNac="
				+ fechaNac + "]";
	}
	
}
