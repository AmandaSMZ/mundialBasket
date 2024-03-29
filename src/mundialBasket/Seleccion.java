package mundialBasket;

import java.util.ArrayList;
/**
 * Clase que contiene una lista con los integrantes de la selección (Pueden ser de las clases que heredan de Persona)
 * @author amand
 * @version 2.0
 */

public class Seleccion {
	private ArrayList <Persona> integrantes;

	/**
	 * Constructor de la clase Selección que crea una Selección vacía (Sin integrantes)
	 */
	public Seleccion() {
		super();
		this.integrantes = new ArrayList<>();
	}
	
	/**
	 * Método para añadir integrante a la Seleccion
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
	 * Método que solo utilizan los integrantes de tipo Jugador para jugar partido
	 */
	public void jugarPartido() {
        for (Persona persona : integrantes) {
            if (persona instanceof Jugador) {
                ((Jugador) persona).jugarPartido();
            }
        }
    }
	/**
	 * Método que solo utilizan los integrantes de tipo Jugador para entrenar
	 */

    public void realizarEntrenamiento() {
        for (Persona persona : integrantes) {
            if (persona instanceof Jugador) {
                ((Jugador) persona).entrenar();
            }
        }
    }
    
    /**
     * Método que utilizan los integrantes de tipo Entrenador para dirigir partido
     */
    public void dirigirPartido(String fecha) {
        for (Persona persona : integrantes) {
            if (persona instanceof Entrenador) {
                ((Entrenador) persona).dirigirPartido(fecha);
            }
        }
    }
    /**
     * Método que utilizan los integrantes de tipo Entrenador para dirigir entrenamiento
     */

    public void dirigirEntrenamiento(String fecha) {
        for (Persona persona : integrantes) {
            if (persona instanceof Entrenador) {
                ((Entrenador) persona).dirigirEntrenamiento(fecha);
            }
        }
    }
    

    public void darMasaje() {
        for (Persona persona : integrantes) {
            if (persona instanceof Masajista) {
                ((Masajista) persona).darMasaje();
            }
        }
    }
	
	
	
}
