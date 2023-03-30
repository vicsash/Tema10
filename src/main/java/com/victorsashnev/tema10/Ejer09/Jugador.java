package com.victorsashnev.tema10.Ejer09;

public class Jugador {
    private final String name;
    private final int puntuacion;

    public String getName() {
        return name;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public Jugador(String name, int puntuacion) {
        this.name = name;
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "name='" + name + '\'' +
                ", puntuacion=" + puntuacion +
                '}';
    }
}
