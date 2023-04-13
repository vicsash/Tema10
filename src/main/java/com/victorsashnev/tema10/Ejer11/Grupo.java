package com.victorsashnev.tema10.Ejer11;

public class Grupo {
    private int id;
    private int counter = 0;
    private String nombre;
    private Aula aula;

    public Grupo(int id, int counter, String nombre, Aula aula) {
        this.id = counter++;
        this.counter = counter;
        this.nombre = nombre;
        this.aula = aula;
    }

    public int getId() {
        return id;
    }

    public int getCounter() {
        return counter;
    }

    public String getNombre() {
        return nombre;
    }

    public Aula getAula() {
        return aula;
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "id=" + id +
                ", counter=" + counter +
                ", nombre='" + nombre + '\'' +
                ", aula=" + aula +
                '}';
    }
}
