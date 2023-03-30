package com.victorsashnev.tema10.Ejer10;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Empleado {
    private final String nie;
    private final String nombre;
    private final String apellido;
    private final GregorianCalendar fechaNaci;
    private double sueldo;
    private final boolean hijo;

    public String getNie() {
        return nie;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public GregorianCalendar getFechaNaci() {
        return fechaNaci;
    }

    public double getSueldo() {
        return sueldo;
    }

    public boolean getHijo() {
        return hijo;
    }

    public Empleado(String nie, String nombre, String apellido, GregorianCalendar fechaNaci, double sueldo, boolean hijo) {
        this.nie = nie;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNaci = fechaNaci;
        this.sueldo = sueldo;
        this.hijo = hijo;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdfDate = new SimpleDateFormat("dd--MM-yyyy");
        return "Empleado{" +
                "nie='" + nie + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNaci=" + sdfDate.format(fechaNaci.getTime()) +
                ", sueldo=" + sueldo +
                ", hijo=" + hijo +
                '}';
    }
}
