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

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}
	public void concentrarse() {
		System.out.println("Concentrandose 2 días antes del partido.");
	}
	
	public abstract void viajar();

	@Override
	public String toString() {
		return "ComponenteSeleccion [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNac="
				+ fechaNac + "]";
	}
	
}
