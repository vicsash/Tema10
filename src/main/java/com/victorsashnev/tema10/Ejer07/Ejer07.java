package com.victorsashnev.tema10.Ejer07;

import com.victorsashnev.tema10.Lib;

import java.util.HashMap;

public class Ejer07 {
    HashMap<String,Double>currency = new HashMap<>();
    public  Ejer07(){
        currency.put("USD",1.08);
        currency.put("GBP",0.88);
        currency.put("INR",88.89);
        currency.put("AUD",1.62);
        currency.put("CAD",1.48);
        currency.put("ARS",224.29);
        currency.put("BOB",7.47);
        currency.put("CLP",871.81);
        currency.put("VEZ",5057.31);
        currency.put("CRC",584.91);
        currency.put("CUP",54.94);
        currency.put("DOP",59.20);
        currency.put("MXN",19.85);

        int menu;
        String moneda;
        Double euros;
            do{
            menu();
            menu= Lib.scanInt();
            switch (menu){
                case 1:
                    System.out.println("Introduce la modena a cual quieres convertir el euro");
                    moneda = Lib.scanString();
                    System.out.println("Introduce la cantidad en euros");
                    euros = Lib.scanDouble();
                    if(currency.containsKey(moneda)){
                        System.out.println(currency.get(moneda)*euros);
                    }else
                        System.out.println("Este moneda no existe");
                    break;
                case 0:
                    break;
                default:
                    break;
            }

        }while(menu!=0);
    }

        public void menu(){
            System.out.println("Menu Principal");
            System.out.println("--------------");
            System.out.println("1.Convertir euro");
            System.out.println("0. Salir de la aplicación.");
        }
}
