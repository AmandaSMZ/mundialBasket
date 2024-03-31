package mundialBasket;

/**
 * Clase que hereda de Persona.
 * @author amand
 * @version 1.0
 */

public class Jugador extends Persona{
	private int dorsal;
	private String demarcacion;
	
	/**
	 * Constructor clase Jugador
	 * @param id ID (int)
	 * @param nombre (String)
	 * @param apellidos (String)
	 * @param fechaNac (String)
	 * @param dorsal (int)
	 * @param demarcacion (String)
	 */
	public Jugador(int id, String nombre, String apellidos, String fechaNac, int dorsal, String demarcacion) {
		super(id, nombre, apellidos, fechaNac);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}
	/**
	 * Metodo para obtener el numero de dorsal
	 * @return numero de dorsal (int)
	 */
	protected int getDorsal() {
		return dorsal;
	}
	/**
	 * Metodo para cambiar el dorsal
	 * @param dorsal (Nuevo numero de dorsal)
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
	 * @param demarcacion String
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
	/**
	 * Metodo para jugar un partido
	 * Muestra un mensaje por pantalla
	 */
	}
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
	public String toString() {
		return "Jugador [dorsal=" + dorsal + ", demarcacion=" + demarcacion + ", id=" + id + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", fechaNac=" + fechaNac + "]";
	}
	
}
