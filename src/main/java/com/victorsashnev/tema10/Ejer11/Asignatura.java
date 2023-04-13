package com.victorsashnev.tema10.Ejer11;

public class Asignatura {
    private int id;
    private int counter = 0;
    private String nombre;
    private Profesor profesor;

    public Asignatura(int id, int counter, String nombre, Profesor profesor) {
        this.id = counter++;
        this.counter = counter;
        this.nombre = nombre;
        this.profesor = profesor;
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

    public Profesor getProfesor() {
        return profesor;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "id=" + id +
                ", counter=" + counter +
                ", nombre='" + nombre + '\'' +
                ", profesor=" + profesor +
                '}';
    }
}
