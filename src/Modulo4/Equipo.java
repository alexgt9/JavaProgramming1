package Modulo4;

import java.util.ArrayList;
import java.util.Objects;

public class Equipo {
    String nombre;
    ArrayList<Jugador> jugadores = new ArrayList<>();

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public void agregarJugador(Jugador j) {
        jugadores.add(j);
    }

    public boolean quitarJugador(String nombreJugador) {
        Jugador jugadorEncontrado = jugadores.stream().filter(jugador -> jugador.nombre.equals(nombreJugador)).findFirst().orElse(null);

        if (jugadorEncontrado != null) {
            jugadores.remove(jugadorEncontrado);
            return true;
        } else {
            System.out.println("Jugador no encontrado: " + nombreJugador);
            return false;
        }
    }

    public void quitarJugadorConExcepciones(String nombreJugador) {
        if (jugadores.isEmpty()) {
            throw new EquipoSinJugadores("No hay jugadores en el equipo.");
        }

        Jugador jugadorEncontrado = jugadores.stream().filter(jugador -> jugador.nombre.equals(nombreJugador)).findFirst().orElse(null);

        if (jugadorEncontrado == null) {
            System.out.println("Jugador no encontrado: " + nombreJugador);
            throw new JugadorNoEncontrado(nombreJugador);
        }

        jugadores.remove(jugadorEncontrado);
    }

    static public Equipo obtenerEquipo(String nombre, ArrayList<String> jugadores) {
        Equipo equipo = new Equipo(nombre);
        int dorsal = 1;
        for (String j : jugadores) {
            equipo.agregarJugador(new Jugador(j, dorsal++));
        }
        return equipo;
    }

    public String toString() {
        return "Equipo: " + nombre + ", Jugadores: " + jugadores.size();
    }
}
