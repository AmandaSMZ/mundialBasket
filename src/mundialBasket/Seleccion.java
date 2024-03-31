/**
 * 
 */
package mundialBasket;

import java.util.ArrayList;
/**
 * Clase que contiene una lista con los integrantes de la seleccion (Pueden ser de las clases que heredan de Persona)
 * Actualmente (31-03-2024) no se controla la cantidad de integrantes en total ni por tipo (Pueden añadirse infinitos integrantes)
 * @author amand
 * @version 2.0
 */

public class Seleccion {
	/**
	 * ArrayList en la que se almacenan todos los integrantes de la seleccion
	 * Pueden ser Jugador, Masajista o Entrenador
	 * Aun no se controla la cantidad de cada uno que puede haber en cada seleccion
	 */
	private ArrayList <Persona> integrantes;

	/**
	 * Constructor de la clase Seleccion que crea una Seleccion vacia (Sin integrantes)
	 */
	public Seleccion() {
		super();
		this.integrantes = new ArrayList<>();
	}
	
	/**
	 * Metodo para añadir integrante a la Seleccion
	 * @param integrante Puede ser Jugador, Entrenador o Masajista
	 */
	public void aniadirIntegrante(Persona integrante) {
		this.integrantes.add(integrante);
	}

	@Override
	public String toString() {
		return "Seleccion [integrantes=" + integrantes + "]";
	}
	/**
	 * Metodo que solo utilizan los integrantes de tipo Jugador para jugar partido
	 * @see Jugador#jugarPartido()
	 */
	public void jugarPartido() {
        for (Persona persona : integrantes) {
            if (persona instanceof Jugador) {
                ((Jugador) persona).jugarPartido();
            }
        }
    }
	/**
	 * Metodo que solo utilizan los integrantes de tipo Jugador para entrenar
	 * @see Jugador#entrenar()
	 */

    public void realizarEntrenamiento() {
        for (Persona persona : integrantes) {
            if (persona instanceof Jugador) {
                ((Jugador) persona).entrenar();
            }
        }
    }
    
    /**
     * Metodo que utilizan los integrantes de tipo Entrenador para dirigir partido
     * @see Entrenador#dirigirPartido(String)
     */
    public void dirigirPartido(String fecha) {
        for (Persona persona : integrantes) {
            if (persona instanceof Entrenador) {
                ((Entrenador) persona).dirigirPartido(fecha);
            }
        }
    }
    /**
     * Metodo que utilizan los integrantes de tipo Entrenador para dirigir entrenamiento
     * @see Entrenador#dirigirEntrenamiento(String)
     */

    public void dirigirEntrenamiento(String fecha) {
        for (Persona persona : integrantes) {
            if (persona instanceof Entrenador) {
                ((Entrenador) persona).dirigirEntrenamiento(fecha);
            }
        }
    }
    
    /**
     * Metodo que utilizan los integrantes de tipo Masajista
     * @see Masajista#darMasaje()
     */
    public void darMasaje() {
        for (Persona persona : integrantes) {
            if (persona instanceof Masajista) {
                ((Masajista) persona).darMasaje();
            }
        }
    }
	
	
	
}
