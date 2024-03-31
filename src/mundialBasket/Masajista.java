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
	 * Metodo para obtener la titulacion
	 * @return tipo de titulacion (String)
	 */
	public String getTitulacion() {
		return titulacion;
	}
	/**
	 * Metodo para cambiar la titulacion
	 * @param titulacion Nombre de la nueva titulacion (String)
	 */
	protected void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	/**
	 * Metodo para obtener los años de experiencia
	 * @return años de experiencia (int)
	 */
	protected int getAniosExperiencia() {
		return aniosExperiencia;
	}
	/**
	 * Metodo para cambiar los años de experiencia
	 * @param aniosExperiencia Años de experiencia (int)
	 */
	protected void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	/**
	 * Metodo para viajar heredado de Persona
	 * Muestra un mensaje por pantalla
	 */
	@Override
	public void viajar() {
		System.out.println("Viajando para preparar a los jugadores para el partido");
		
	}
	/**
	 * Metodo para dar masaje
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
