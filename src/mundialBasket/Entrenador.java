package mundialBasket;

/**
 * Clase que hereda de Persona
 * @author amand
 * @version 1.5
 */

public class Entrenador extends Persona{
	String federacion;
	/**
	 * Constructor clase Entrenador
	 * @param id Numero ID
	 * @param nombre 
	 * @param apellidos
	 * @param fechaNac formato String
	 * @param federacion
	 */
	public Entrenador(int id, String nombre, String apellidos, String fechaNac, String federacion) {
		super(id, nombre, apellidos, fechaNac);
		this.federacion = federacion;
	}
	/**
	 * Método para obtener la federación
	 * @return Nombre federación
	 */
	public String getFederacion() {
		return federacion;
	}
	/**
	 * Método para cambiar la federación
	 * @param federacion
	 */
	public void setFederacion(String federacion) {
		this.federacion = federacion;
	}
	
	@Override
	public void viajar() {
		System.out.println("Viajando para dirigir al equipo en el partido en");
		
	}
	/**
	 * Método para dirigir partido
	 * @param fecha (String)
	 * Muestra por pantalla un mensaje
	 */
	public void dirigirPartido(String fecha) {
		System.out.println(this.nombre+ " está dirigiendo un partido el día "+fecha);
	}
	/**
	 * Método para dirigir entrenamiento
	 * @param fecha (String)
	 * Muestra por pantalla un mensaje
	 */
	public void dirigirEntrenamiento(String fecha) {
		System.out.println(this.nombre+ " está dirigiendo un entrenamiento el día "+fecha);
	}

	@Override
	public String toString() {
		return "Entrenador [federacion=" + federacion + ", id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", fechaNac=" + fechaNac + "]";
	}

}
