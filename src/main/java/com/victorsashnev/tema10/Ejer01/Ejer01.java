package com.victorsashnev.tema10.Ejer01;

import com.victorsashnev.tema10.Lib;

import java.util.ArrayList;

public class Ejer01 {
    public Ejer01(){

        int[] aray = new int[10];

        aray =Lib.fillArrayRandomInt(aray,50,0);

        ArrayList<Integer>list = arayList(aray);
        System.out.println(list);
    }

    /**
     * The method to convert the array into arraylist
     * where even numbers come first and then the odd numbers
     * @param aray receives array with random numbers
     * @return an arrayList
     */
    public ArrayList<Integer> arayList (int[] aray){
        ArrayList<Integer> arayList =  new ArrayList<Integer>(aray.length);
        for (int j : aray) {
            if (j % 2 == 0) {
                arayList.add(j);
            }
        }
        for (int j : aray) {
            if (j % 2 != 0) {
                arayList.add(j);
            }
        }
        return arayList;
    }
}
