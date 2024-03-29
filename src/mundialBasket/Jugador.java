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
	 * Método para obtener el numero de dorsal
	 * @return número de dorsal (int)
	 */
	protected int getDorsal() {
		return dorsal;
	}
	/**
	 * Método para cambiar el dorsal
	 * @param dorsal (Nuevo número de dorsal)
	 */
	protected void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	protected String getDemarcacion() {
		return demarcacion;
	}

	protected void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	@Override
	public void viajar() {
		System.out.println("Viajando para jugar el partido.");
		
	}
	public void jugarPartido() {
		System.out.println(this.nombre+" está jugando un partido.");
	}
	public void entrenar() {
		System.out.println(this.nombre+" está entrenando.");
	}

	@Override
	public String toString() {
		return "Jugador [dorsal=" + dorsal + ", demarcacion=" + demarcacion + ", id=" + id + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", fechaNac=" + fechaNac + "]";
	}
	
}
