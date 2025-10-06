package Modulo4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Hola");
        lista.add("Adios");

        lista.forEach((String texto) -> { System.out.println(texto); });

        ArrayList<Equipo> equipos = new ArrayList<>();
        equipos.add(Equipo.obtenerEquipo("Real Madrid", new ArrayList<String>() {{
            add("Karim Benzema");
            add("Luka Modric");
            add("Toni Kroos");
        }}));
        equipos.add(Equipo.obtenerEquipo("FC Barcelona", new ArrayList<String>() {{
            add("Robert Lewandowski");
            add("Frenkie de Jong");
            add("Pedri");
        }}));

        CsvExporter.exportEquipos(equipos, "equipos.csv");

        Equipo fromCsv = CsvExporter.equipoFromCsv("Atletico de Madrid;Jan Oblak(1);Koke(6);Joao Felix(7)");
        System.out.println(fromCsv);

        ArrayList<Equipo> equipos2 = new CsvExporter().importEquipos("equipos_2.csv");
        for (Equipo e : equipos2) {
            System.out.println(e);
        }

        try {
            equipos2.getFirst().quitarJugadorConExcepciones("Paquito");
        } catch (EquipoSinJugadores ex) {
            System.out.println("El equipo no tenia jugadores: " + ex.getMessage());
        } catch (JugadorNoEncontrado ex) {
            System.out.println("No se ha encontrado el jugador: " + ex.nombreJugador);
            System.out.println("Ha ocurrido un error: " + ex.getMessage());
        }
    }
}
