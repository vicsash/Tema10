package com.victorsashnev.tema10.TestZone;

import com.victorsashnev.tema10.LibMethods;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Date {
    static GregorianCalendar calendar;
    static SimpleDateFormat sdfDate = new SimpleDateFormat("dd-MM-yyyy");
    public static void main(String[] args){
        for(int i = 0; i < 5;i++){
            calendar = LibMethods.dateWithRand();
            System.out.println(sdfDate.format(calendar.getTime()));
        }
        GregorianCalendar test = new GregorianCalendar();
        System.out.println(test.getTime());
    }
}
