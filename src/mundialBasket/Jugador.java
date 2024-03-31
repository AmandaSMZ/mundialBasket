package mundialBasket;

/**
 * Clase que hereda de Persona.
 * @author amand
 * @version 1.3
 */

public class Jugador extends Persona{
	/**
	 * Numero de dorsal con el que juega los partidos el jugador
	 */
	private int dorsal;
	/**
	 * Posicion principal en la que juega
	 */
	private String demarcacion;
	
	/**
	 * Constructor clase Jugador
	 * @param id ID Numero de identificacion personal del jugador (DNI sin letra)
	 * @param nombre Nombre completo del jugador en formato String
	 * @param apellidos Apellidos del jugador en formato String
	 * @param fechaNac Fecha de nacimiento en formato String (aaaa-mm-dd)
	 * @param dorsal Numero de dorsal con el que juega en formato int
	 * @param demarcacion Posicion en la que juega en formato String
	 */
	public Jugador(int id, String nombre, String apellidos, String fechaNac, int dorsal, String demarcacion) {
		super(id, nombre, apellidos, fechaNac);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}
	/**
	 * Metodo para obtener el numero de dorsal
	 * @return numero Numero de dorsal en formato int
	 */
	protected int getDorsal() {
		return dorsal;
	}
	/**
	 * Metodo para cambiar el dorsal
	 * @param dorsal Nuevo numero de dorsal del jugador en formato int
	 */
	protected void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	/**
	 * Metodo para obtener la demarcacion
	 * @return String con la posicion del jugador
	 */
	protected String getDemarcacion() {
		return demarcacion;
	}
	/**
	 * Metodo para cambiar la demarcacion
	 * @param demarcacion Nueva demarcacion del jugador en formato String
	 */
	protected void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}
	/**
	 * Metodo heredado de la clase Persona
	 * Muestra un mensaje por pantalla
	 */
	@Override
	public void viajar() {
		System.out.println("Viajando para jugar el partido.");
	}
	
	/**
	 * Metodo para jugar un partido
	 * Muestra un mensaje por pantalla
	 */
	public void jugarPartido() {
		System.out.println(this.nombre+" está jugando un partido.");
	}
	/**
	 * Metodo para entrenar
	 * Muestra un mensaje por pantalla
	 */
	public void entrenar() {
		System.out.println(this.nombre+" está entrenando.");
	}

	@Override
	/**
	 * Metodo que devuelve un String con toda la informacion propia del jugador y de la clase Persona
	 */
	public String toString() {
		return super.toString()+"Jugador [dorsal=" + dorsal + ", demarcacion=" + demarcacion + ", id=" + id + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", fechaNac=" + fechaNac + "]";
	}
	
}
