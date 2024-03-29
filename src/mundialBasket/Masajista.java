package mundialBasket;
	/**
	 * Hereda de Persona
	 * @author amand
	 * @version 2.0
	 */
public class Masajista extends Persona {
	String titulacion;
	int aniosExperiencia;
	
	/**
	 * Constructor Masajista
	 * @param id
	 * @param nombre
	 * @param apellidos
	 * @param fechaNac
	 * @param titulacion
	 * @param aniosExperiencia
	 */
	public Masajista(int id, String nombre, String apellidos, String fechaNac, String titulacion,
			int aniosExperiencia) {
		super(id, nombre, apellidos, fechaNac);
		this.titulacion = titulacion;
		this.aniosExperiencia = aniosExperiencia;
	}
	/**
	 * Método para obtener la titulacion
	 * @return tipo de titulación (String)
	 */
	public String getTitulacion() {
		return titulacion;
	}
	/**
	 * Método para cambiar la titulación
	 * @param titulacion Nombre de la nueva titulación (String)
	 */
	protected void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	/**
	 * Método para obtener los años de experiencia
	 * @return años de experiencia (int)
	 */
	protected int getAniosExperiencia() {
		return aniosExperiencia;
	}
	/**
	 * Método para cambiar los años de experiencia
	 * @param aniosExperiencia Años de experiencia (int)
	 */
	protected void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	
	@Override
	public void viajar() {
		System.out.println("Viajando para preparar a los jugadores para el partido");
		
	}
	/**
	 * Método para dar masaje
	 * Muestra un mensaje por pantalla
	 */
	public void darMasaje() {
		System.out.println(this.nombre+" está dando un masaje");
	}

	@Override
	public String toString() {
		return "Masajista [titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia + ", id=" + id
				+ ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNac=" + fechaNac + "]";
	}

}
