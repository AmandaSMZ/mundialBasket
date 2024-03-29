package mundialBasket;

public class Masajista extends Persona {
	String titulacion;
	int aniosExperiencia;
	
	public Masajista(int id, String nombre, String apellidos, String fechaNac, String titulacion,
			int aniosExperiencia) {
		super(id, nombre, apellidos, fechaNac);
		this.titulacion = titulacion;
		this.aniosExperiencia = aniosExperiencia;
	}

	protected String getTitulacion() {
		return titulacion;
	}

	protected void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	protected int getAniosExperiencia() {
		return aniosExperiencia;
	}

	protected void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	@Override
	public void viajar() {
		System.out.println("Viajando para preparar a los jugadores para el partido");
		
	}
	public void darMasaje() {
		System.out.println(this.nombre+" está dando un masaje");
	}

	@Override
	public String toString() {
		return "Masajista [titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia + ", id=" + id
				+ ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNac=" + fechaNac + "]";
	}

}
