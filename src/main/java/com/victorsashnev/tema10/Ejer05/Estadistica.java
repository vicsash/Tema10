package com.victorsashnev.tema10.Ejer05;

import com.victorsashnev.tema10.LibMethods;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class Estadistica{
    private final Random random = new Random();
    final private Paciente[] pacientes;
    private static int counter;
    Estadistica(int MAX_PAC){
        pacientes = new Paciente[MAX_PAC];
        counter =0;
    }

    /**
     * Methodo para crear pacientes aleatorios
     */
    private void randomPatients(){
        char sexo;
        for(int i = 0; i<pacientes.length; i++){

            GregorianCalendar calendar = LibMethods.dateWithRand();
            if(random.nextBoolean()){
               sexo = 'M';
            } else{
                sexo = 'F';
            }
            double weight = LibMethods.randomNumeberDouble(80,20);
            double height = LibMethods.randomNumeberDouble(2,0);
            pacientes[i] = new Paciente(calendar,sexo,weight,height);

        }
    }

    /**
     * Metodo para encontrar paciente con menor y mayor edad
     * @return
     */
    public int[] majorMenor(){
        int aray[] = new int[2];
        StringBuilder sb = new StringBuilder();
        GregorianCalendar calendar = (GregorianCalendar) Calendar.getInstance();
        GregorianCalendar calendarMin = pacientes[1].getCalendar();
        GregorianCalendar calendarMax = pacientes[1].getCalendar();
        int min = 0;
        int max = 0;
        calendar = pacientes[0].getCalendar();
        for(int i = 0; i < pacientes.length;i++){
            if(calendarMin.after(pacientes[i].getCalendar())){
                calendarMin=pacientes[i].getCalendar();
                min = i;
            }
            if(calendarMin.before(pacientes[i].getCalendar())){
                calendarMin=pacientes[i].getCalendar();
                max = i;
            }
        }
        aray[0]=min;
        aray[1]=max;
        return aray;
    }
    public String pacientsPerSexe(){
        StringBuilder sb = new StringBuilder();
        return sb.toString();
    }

    private void masaCorporal(){

    }

    private void Mensaje(){

    }
    //Static hace que no sea dependiente de clase principal
    //Sin static la clase esta condicionada por la clase principal
    public static class DateReturn{
        private int minDate;
        private int maxDate;
    }
}
