package com.victorsashnev.tema10.Ejer06;

import com.victorsashnev.tema10.Ejer05.Ejer05;
import com.victorsashnev.tema10.Lib;

import java.util.HashMap;

public class Ejer06 {
    private HashMap<String,String>Traductor = new HashMap<>();
    public Ejer06(){
        int menu;
        int palabras;
        String key;
        String valor;
        do{
            menu();
            menu= Lib.scanInt();
            switch (menu){
                case 1:
                    System.out.println("¿Cuantas palabras deseas intruducir?");
                    palabras = Lib.scanInt();
                    //A loop to add new elements to hashmap
                    for (int i = 0; i < palabras; i++){
                        key = Lib.scanString();
                        valor = Lib.scanString();
                        Traductor.put(key,valor);
                    }
                    break;
                case 2:
                    key = Lib.scanString();
                    //If key doesn't exist it prints out that there is no such word
                    System.out.println(Traductor.getOrDefault(key, "No hay traduccion para este palabra"));
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
        System.out.println("1. Introducir parejas de palabras.");
        System.out.println("2. Traducir palabras.");
        System.out.println("0. Salir de la aplicación.");
    }
}
