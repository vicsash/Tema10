package com.victorsashnev.tema10.Ejer09;

import com.victorsashnev.tema10.Lib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Ejer09{
    private int numJugador = 10;
    private final HashMap<String,String> DefDiccio = new HashMap<>();
    private ArrayList<Jugador> jugador = new ArrayList<Jugador>();
    public Ejer09(){
        int menu;
        String valor;
        String usuario;
        int puntuacion;
        int game = 1;
        String key;
        do{
            menu();
            menu= Lib.scanInt();
            switch (menu){
                //New word
                case 1:
                    System.out.println("Introduce la palabra que qieres añadir al diccionario");
                    key = Lib.scanString();
                    //Confirmation to see if key existst
                    if(DefDiccio.containsKey(key)) {
                        System.out.println("Este palabra ya existe");
                    }else{
                        System.out.println("Introduce la definicion");
                        valor = Lib.scanString();
                        DefDiccio.put(key,valor);
                    }
                    break;
                //Modify word
                case 2:
                    System.out.println("Introduce la palabra que qieres modificar");
                    key = Lib.scanString();
                    //Confirmation to see if key existst
                    if(DefDiccio.containsKey(key)) {
                        System.out.println("Modifica la definicion");
                        valor = Lib.scanString();
                        DefDiccio.replace(key,valor);
                    }else{
                        System.out.println("Este palabra no existe");
                    }
                    break;
                //Eliminate word
                case 3:
                    System.out.println("Introduce la palabra que qieres eliminar del diccionario");
                    key = Lib.scanString();
                    //Confirmation to see if key existst
                    if(DefDiccio.containsKey(key)) {
                        DefDiccio.remove(key);
                    }else{
                        System.out.println("Este palabra no existe");
                    }
                    break;
                //Consult word
                case 4:
                    key = Lib.scanString();
                    //If key doesn't exist it prints out that there is no such word
                    System.out.println(DefDiccio.getOrDefault(key, "Este palabra no existe"));
                    break;
                // Show diccionary
                case 5:
                    System.out.println(DefDiccio.toString());
                    break;
                case 6:
                    System.out.println("Inroduce el nombre del jugador");
                    usuario = Lib.scanString();
                    game = 1;
                    HashMap<String,String> cloneTraductor = DefDiccio;
                    int counter = 0;
                    do{
                        puntuacion=0;
                        int numb = DefDiccio.size();
                        int rand = Lib.randomNumeber(numb,0);
                        System.out.println("Que es la traduccion de " + cloneTraductor.values().toArray()[numb]);
                        valor = Lib.scanString();
                        if(cloneTraductor.containsKey(valor)) {
                            System.out.println("Bien, has acertado la palabra");
                            puntuacion++;
                            cloneTraductor.remove(valor);
                        }else{
                            game = 0;
                            System.out.println("Ha perdido con" + puntuacion +"puntos");
                            jugador.add(valor,puntuacion);
                            cloneTraductor = null;
                        }
                    }while(game!=0);
                    break;
                case 7:
                    System.out.println(bestScore(jugador));
                    break;
                case 0:
                    break;
                default:
                    break;
            }

        }while(menu!=0);
    }

    private void menu(){
        System.out.println("Menu Principal");
        System.out.println("--------------");
        System.out.println("1. Introducir parejas de palabras.");
        System.out.println("2. Modificar palabra");
        System.out.println("3. Eliminar palabra");
        System.out.println("4. Consultar palabra");
        System.out.println("5. Mostrar diccionario");
        System.out.println("6. Jugar");
        System.out.println("7. Mejor Puntuacion");
        System.out.println("0. Salir de la aplicación.");
    }
//Getindex
    private String bestScore(ArrayList<Jugador> jugador) {
        int min = Integer.MIN_VALUE;
        int point;
        StringBuilder sb = new StringBuilder();
        //Collections.sort(jugador,Collections.reverseOrder());
        ArrayList<String>points = new ArrayList<String>();
        for(int i = 0; i < jugador.size();i++){
            for(int j = 0; j < jugador.size();j++){
                if(jugador[i])
            }
        }
        return sb.toString();
    }
}
