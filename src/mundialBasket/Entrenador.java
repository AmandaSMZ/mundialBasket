package mundialBasket;

/**
 * <h3>Clase que representa a los entrenadores de la seleccion (hereda de Persona)</h3>
 * @author amand
 * @version 1.5
 */

public class Entrenador extends Persona{
	/**
	 * Nombre de la federacion a la que pertenece el entrenador
	 */
	String federacion;
	/**
	 * Constructor clase Entrenador
	 * @param id Numero de identificacion personal (DNI sin letra)
	 * @param nombre Nombre completo del entrenador
	 * @param apellidos Todos los apellidos del entrenador
	 * @param fechaNac Fecha de nacimiento en formato String (aaaa-mm-dd)
	 * @param federacion Nombre de la federacion en la que se titulo el entrenador
	 */
	public Entrenador(int id, String nombre, String apellidos, String fechaNac, String federacion) {
		super(id, nombre, apellidos, fechaNac);
		this.federacion = federacion;
	}
	/**
	 * Metodo para obtener la federacion
	 * @return Nombre de la federacion en formato String
	 */
	public String getFederacion() {
		return federacion;
	}
	/**
	 * Metodo para cambiar la federacion
	 * @param federacion Nombre de la nueva federacion
	 */
	public void setFederacion(String federacion) {
		this.federacion = federacion;
	}
	
	@Override
	/**
	 * Método abstracto de la clase persona
	 * Muestra un mensaje por pantalla
	 */
	public void viajar() {
		System.out.println("Viajando para dirigir al equipo en el partido ");
		
	}
	/**
	 * Metodo para dirigir partido
	 * @param fecha Fecha en la que se celebra el partido en formato String
	 * Muestra por pantalla un mensaje
	 */
	public void dirigirPartido(String fecha) {
		System.out.println(this.nombre+ " está dirigiendo un partido el día "+fecha);
	}
	/**
	 * Metodo para dirigir entrenamiento
	 * @param fecha Fecha en la que se realiza el entrenamiento en formato String
	 * Muestra por pantalla un mensaje
	 */
	public void dirigirEntrenamiento(String fecha) {
		System.out.println(this.nombre+ " está dirigiendo un entrenamiento el día "+fecha);
	}

	@Override
	/**
	 * Metodo que devuelve en formato String todos los atributos propios de Entrenador y ademas los heredados de persona
	 */
	public String toString() {
		return super.toString()+ "Entrenador [federacion=" + federacion + ", id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", fechaNac=" + fechaNac + "]";
	}

}
