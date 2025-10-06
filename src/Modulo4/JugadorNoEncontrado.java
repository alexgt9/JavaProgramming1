package Modulo4;

public class JugadorNoEncontrado extends RuntimeException {
    String nombreJugador;
    public JugadorNoEncontrado(String nombreJugador) {
        super("Jugador con nombre " + nombreJugador + " no encontrado.");
        this.nombreJugador = nombreJugador;
    }
}
