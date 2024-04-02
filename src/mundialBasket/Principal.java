package mundialBasket;
	/**
	 * Clase principal (main) desde la que se realizan las gestiones de la seleccion
	 * @author amand
	 * @version 1.4
	 */
public class Principal {

	public static void main(String[] args) {
		Seleccion italia = new Seleccion();
		
		italia.aniadirIntegrante(new Jugador(25,"Pau","Gasol","1980-07-06",16,"Pivot"));
		italia.aniadirIntegrante(new Jugador(13,"David","García","1979-07-06",13,"Defensa"));
		italia.aniadirIntegrante(new Entrenador(456, "Juan","Rodriguez Vazquez", "1987-06-19", "Federacion de Madrid"));
		italia.aniadirIntegrante(new Masajista(166, "Lucia", "Sanchez", "1994-05-13","Grado Enfermería",5));
		
		italia.viajar("Madrid");
		italia.darMasaje();
		italia.dirigirEntrenamiento("2024-06-05");
		italia.jugarPartido();
		
		
	}

}
