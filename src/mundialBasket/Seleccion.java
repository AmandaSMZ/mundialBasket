/**
 * Paquete que contiene las clases que representan a una seleccion
 */
package mundialBasket;

import java.util.ArrayList;
/**
 * Clase que contiene una lista con los integrantes de la seleccion (Pueden ser de las clases que heredan de Persona)
 * @author amand
 * @version 2.0
 */

public class Seleccion {
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
     */
    public void darMasaje() {
        for (Persona persona : integrantes) {
            if (persona instanceof Masajista) {
                ((Masajista) persona).darMasaje();
            }
        }
    }
	
	
	
}
