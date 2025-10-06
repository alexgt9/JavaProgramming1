package Modulo4;

import java.util.ArrayList;

public class CsvExporter {
    public static String equipoToCsv(Equipo equipo) {
        StringBuilder sb = new StringBuilder();
        sb.append(equipo.nombre);
        for (Jugador j : equipo.jugadores) {
            sb.append(";").append(j.nombre).append("(").append(j.numero).append(")");
        }
        return sb.toString();
    }

    public static Equipo equipoFromCsv(String csv) {
        String[] partes = csv.split(";");
        Equipo equipo = new Equipo(partes[0]);
        for (int i = 1; i < partes.length; i++) {
            String jugadorStr = partes[i];
            String nombre = jugadorStr.substring(0, jugadorStr.indexOf('('));
            int numero = Integer.parseInt(jugadorStr.substring(jugadorStr.indexOf('(') + 1, jugadorStr.indexOf(')')));
            equipo.agregarJugador(new Jugador(nombre, numero));
        }
        return equipo;
    }

    public static void exportEquipos(ArrayList<Equipo> equipos, String filename) {
        StringBuilder sb = new StringBuilder();
        for (Equipo e : equipos) {
            sb.append(equipoToCsv(e)).append("\n");
        }
        saveCsvToFile(sb.toString(), filename);
    }

    public ArrayList<Equipo> importEquipos(String filename) {
        ArrayList<Equipo> equipos = new ArrayList<>();
        try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                equipos.add(equipoFromCsv(line));
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return equipos;
    }

    public static void saveCsvToFile(String csv, String filename) {
        try (java.io.FileWriter writer = new java.io.FileWriter(filename)) {
            writer.write(csv);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
