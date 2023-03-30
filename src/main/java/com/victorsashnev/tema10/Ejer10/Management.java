package com.victorsashnev.tema10.Ejer10;
import com.victorsashnev.tema10.Lib;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Management {
    private ArrayList<Empleado>empleados = new ArrayList<Empleado>();
    private ArrayList<Hijo>hijos = new ArrayList<Hijo>();
    public Management(){
        empleados = new ArrayList<>();
        hijos = new ArrayList<>();
    }

    public void newWorker(int num){
        String nie = Lib.scanString();
        String nombre = Lib.scanString();
        String apellido = Lib.scanString();
        GregorianCalendar fechaNaci = Lib.dateWithRand();
        double sueldo = Lib.scanDouble();
        String nombreHijo ="No tiene hijo";
        int edadHijo = 0;
            if( num == 1) {
                nombreHijo = Lib.scanString();
                edadHijo = Lib.scanInt();
                //hijos.add(new Hijo(nombreHijo,edadHijo));
            }
        empleados.add(new Empleado(nie,nombre,apellido,fechaNaci,sueldo,hijos.add(new Hijo(nombreHijo,edadHijo))));
    }

}
