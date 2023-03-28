package com.victorsashnev.tema10.Ejer08;

import com.victorsashnev.tema10.Lib;

import java.util.HashMap;

public class Ejer08 {
    private final HashMap<String,String> traductor = new HashMap<>();
    public Ejer08(){
        int menu;
        String key;
        String valor;
        do{
            menu();
            menu= Lib.scanInt();
            switch (menu){
                //New word
                case 1:
                    System.out.println("Introduce la palabra que qieres añadir al diccionario");
                    key = Lib.scanString();
                    //Confirmation to see if key existst
                    if(traductor.containsKey(key)) {
                        System.out.println("Este traduccion ya existe");
                    }else{
                        valor = Lib.scanString();
                        traductor.put(key,valor);
                    }
                    break;
                    //Modify word
                case 2:
                    System.out.println("Introduce la palabra que qieres modificar");
                    key = Lib.scanString();
                    //Confirmation to see if key existst
                    if(traductor.containsKey(key)) {
                        System.out.println("Introduce el valor modificado");
                        valor = Lib.scanString();
                        traductor.replace(key,valor);
                    }else{
                        System.out.println("Este palabra no existe");
                    }
                    break;
                    //Eliminate word
                case 3:
                    System.out.println("Introduce la palabra que qiereseliminar del diccionario");
                    key = Lib.scanString();
                    //Confirmation to see if key existst
                    if(traductor.containsKey(key)) {
                        traductor.remove(key);
                    }else{
                        System.out.println("Este palabra no existe");
                    }
                    break;
                    //Consult word
                case 4:
                    key = Lib.scanString();
                    //If key doesn't exist it prints out that there is no such word
                    System.out.println(traductor.getOrDefault(key, "Este palabra no existe"));
                    break;
                    // Show diccionary
                case 5:
                    System.out.println(traductor.toString());
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
        System.out.println("2. Modificar palabra");
        System.out.println("3. Eliminar palabra");
        System.out.println("4. Consultar palabra");
        System.out.println("5. Mostrar diccionario");
        System.out.println("0. Salir de la aplicación.");
    }
}

