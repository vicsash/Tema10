package com.victorsashnev.tema10.Ejer02;

import java.util.ArrayList;

public class ArrayListEstadistica implements  IEstadisticas{

    public ArrayListEstadistica(int[] aray){
        ArrayList<Integer> list = arayList(aray);

    }
    public ArrayList<Integer> arayList (int[] aray){
        ArrayList<Integer> arayList =  new ArrayList<Integer>();
        for (int j : aray) {
           arayList.add(j);
        }
        return arayList;
    }


    @Override
    public double minimo() {
        return 0;
    }

    @Override
    public double maximo() {
        return 0;
    }

    @Override
    public double sumatorio() {
        return 0;
    }

    @Override
    public double media() {
        return 0;
    }

    @Override
    public double moda() {
        return 0;
    }
}
