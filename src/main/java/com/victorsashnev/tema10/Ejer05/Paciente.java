package com.victorsashnev.tema10.Ejer05;

import java.util.GregorianCalendar;

public class Paciente {
    private final int id;
    private final GregorianCalendar calendar;
    private final char sexo;
    private final double altura;
    private final double peso;



    public int getId() {
        return id;
    }

    public GregorianCalendar getCalendar() {
        return calendar;
    }

    public char getSexo() {
        return sexo;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public Paciente(int id, GregorianCalendar calendar, char sexo,
                    double altura, double peso) {
        this.id = id;
        this.calendar = calendar;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", calendar=" + calendar +
                ", sexo=" + sexo +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
}
