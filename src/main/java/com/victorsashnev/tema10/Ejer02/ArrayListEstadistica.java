package com.victorsashnev.tema10.Ejer02;

import java.util.ArrayList;

public class ArrayListEstadistica implements  IEstadisticas{
    public ArrayList<Double> arayList (int[] aray){
        ArrayList<Double> arayList =  new ArrayList<Double>();
        for (double j : aray) {
           arayList.add(j);
        }
        return arayList;
    }


    @Override
    public double minimo() {
        double max = Double.MAX_VALUE;
        double minimo;
        for (double j :list){
            if(j<max) {
                minimo = j;
                max =j;
            }
        }
        return 0;
    }

    @Override
    public double maximo() {
        double max = Double.MAX_VALUE;
        double minimo;
        for (double j :list){
            if(j<max) {
                minimo = j;
                max =j;
            }
        }
        return 0;
    }

    @Override
    public double sumatorio() {
        double sum = 0;

        for (double j :list){
            sum = sum + j;
        }

        return 0;
    }

    @Override
    public double media() {
        double sum =0;
        double counter = 0;
        for (double j :list){
            sum = sum + j;
            counter++;
        }
        double ave = sum / counter;
        return 0;
    }

    @Override
    public double moda() {
        return 0;
    }
}
