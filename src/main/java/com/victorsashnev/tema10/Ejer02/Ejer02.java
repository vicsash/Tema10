package com.victorsashnev.tema10.Ejer02;

import java.util.Random;

public class Ejer02 {
    static Random rand = new Random();
    public Ejer02(){
        Double[] aray = new Double[10];
        aray = fillArrayRandomDouble(aray, 50.0, (double) 0);
        ArrayListEstadistica arrayListEstadistica = new ArrayListEstadistica();
        arrayListEstadistica.add(55.5);
        System.out.println(arrayListEstadistica.maximo());
        System.out.println(arrayListEstadistica.minimo());
        System.out.println(arrayListEstadistica.media());
        System.out.println(arrayListEstadistica.moda());
    }
    public static double randomNumeberDouble(double max, double min){
        double numb;
        return numb= rand.nextDouble()*max+min;
    }

    public static Double[] fillArrayRandomDouble(Double[] aray, Double MAX, Double MIN){
        Random rand = new Random();
        for(int i=0; i<aray.length;i++){

            aray[i] = randomNumeberDouble(MAX,MIN);
        }

        return aray;
    }
}
