package com.victorsashnev.tema10.TestZone;

import com.victorsashnev.tema10.Lib;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class Date {
    static GregorianCalendar calendar;
    static SimpleDateFormat sdfDate = new SimpleDateFormat("dd-MM-yyyy");
    public static void main(String[] args){
        for(int i = 0; i < 5;i++){
            calendar = Lib.dateWithRand();
            System.out.println(sdfDate.format(calendar.getTime()));
        }
        GregorianCalendar test = new GregorianCalendar();
        System.out.println(test.getTime());
    }
}
