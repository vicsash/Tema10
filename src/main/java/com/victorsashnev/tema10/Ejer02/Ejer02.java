package com.victorsashnev.tema10.Ejer02;

import com.victorsashnev.tema10.Lib;

import java.util.ArrayList;

public class Ejer02 {
    private static int[]aray;
    public Ejer02(){
        aray = new int[10];
        aray = Lib.fillArrayRandom(aray,50,0);
        ArrayListEstadistica arrayListEstadistica = new ArrayListEstadistica();
        ArrayList<Double>list = arrayListEstadistica.arayList(aray);


    }
}
