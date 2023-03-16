package com.victorsashnev.tema10.Ejer02;

import java.util.ArrayList;

public class ArrayListEstadistica extends ArrayList<Double> implements  IEstadisticas{
// Devolver constructor si recibe array entero
    @Override
    public double minimo() {
        double max = Double.MAX_VALUE;
        double minimo = 0;
        for (double j : this){
            if(j<max) {
                minimo = j;
                max =j;
            }
        }
        return minimo;
    }

    @Override
    public double maximo() {
        double max = 0;
        double min = Double.MIN_VALUE;
        for (double j : this){
            if(j>min) {
                max = j;
                min =j;
            }
        }
        return max;
    }

    @Override
    public double sumatorio() {
        double sum = 0;

        for (double j : this){
            sum = sum + j;
        }

        return sum;
    }

    @Override
    public double media() {
        double sum =0;
        double counter = 0;
        for (double j : this){
            sum = sum + j;
            counter++;
        }
        double ave = sum / counter;
        return ave;
    }

    @Override
    public double moda() {
        double repeat =0;
        double min = Double.MIN_VALUE;
        for(double j : this){
            double num = j;
            double counter = 0;
            for(double i : this){
                if(num==i) {
                    counter++;
                }
            }
            if(counter>min){
                repeat = num;
                min = counter;
            }
        }
        return repeat;
    }

    public ArrayList<Double> arayToAraylistDouble(Double[] aray){
        ArrayList<Double> arayList =  new ArrayList<Double>();
        for (double j : aray) {
            if (j % 2 == 0) {
                arayList.add(j);
            }
        }
        for (double j : aray) {
            if (j % 2 != 0) {
                arayList.add(j);
            }
        }
        return arayList;
    }

}
