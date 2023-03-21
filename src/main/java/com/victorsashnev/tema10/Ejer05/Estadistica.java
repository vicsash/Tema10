package com.victorsashnev.tema10.Ejer05;

import com.victorsashnev.tema10.Lib;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class Estadistica {
    private final Random random = new Random();
    final private Paciente[] pacientes;
    private static int counter;
    Estadistica(int MAX_PAC){
        pacientes = new Paciente[MAX_PAC];
        counter =0;
    }

    private void randomPatients(){
        char sexo;
        for(int i = 0; i<pacientes.length; i++){
            int id =1;
            GregorianCalendar calendar = Lib.date();
            if(random.nextBoolean()){
               sexo = 'M';
            } else{
                sexo = 'F';
            }
            double weight = Lib.randomNumeberDouble(80,20);
            double height = Lib.randomNumeberDouble(2,0);
            pacientes[i] = new Paciente(id,calendar,sexo,weight,height);

        }
    }
    private void mayorMenorPaciente(){
        StringBuilder sb = new StringBuilder();
        Calendar calendar = Calendar.getInstance();
        for(int i = 0; i < pacientes.length;i++){

        }
    }
}
