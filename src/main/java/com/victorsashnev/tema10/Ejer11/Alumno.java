package com.victorsashnev.tema10.Ejer11;

public class Alumno {
    private int id;
    private int counter = 0;
    private String nombre;
    private Grupo grupo;
    private Asignatura asignatura;

    public Alumno(int id, int counter, String nombre, Grupo grupo, Asignatura asignatura) {
        this.id = counter++;
        this.counter = counter;
        this.nombre = nombre;
        this.grupo = grupo;
        this.asignatura = asignatura;
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

    public Grupo getGrupo() {
        return grupo;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", counter=" + counter +
                ", nombre='" + nombre + '\'' +
                ", grupo=" + grupo +
                ", asignatura=" + asignatura +
                '}';
    }
}
