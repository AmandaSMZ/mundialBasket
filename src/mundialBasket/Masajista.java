package mundialBasket;
	/**
	 * <h3>Clase que representa a los jugadores de la seleccion (hereda de Persona)</h3>
	 * @author amand
	 * @version 2.0
	 */
public class Masajista extends Persona {
	String titulacion;
	int aniosExperiencia;
	
	/**
	 * Constructor Masajista
	 * @param id Numero de identificacion personal del Masajista (DNI sin letra)
	 * @param nombre Nombre completo en formato String
	 * @param apellidos Apellidos en formato String
	 * @param fechaNac Fecha de nacimiento en formato String (aaaa-mm-dd)
	 * @param titulacion Titulo que posee el masajista en formato String
	 * @param aniosExperiencia Anios que lleva el masajista trabajando con selecciones
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
	/**
	 * Metodo que devuelve un String con todos los atributos de Masajista y ademas los de la clase Persona
	 */
	public String toString() {
		return super.toString()+ "Masajista [titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia + ", id=" + id
				+ ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNac=" + fechaNac + "]";
	}

}
