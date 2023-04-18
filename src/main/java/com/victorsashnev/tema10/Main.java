package com.victorsashnev.tema10;
import com.victorsashnev.tema10.Ejer01.Ejer01;
import com.victorsashnev.tema10.Ejer02.Ejer02;
import com.victorsashnev.tema10.Ejer06.Ejer06;
import com.victorsashnev.tema10.Ejer07.Ejer07;
import com.victorsashnev.tema10.Ejer08.Ejer08;
import com.victorsashnev.tema10.Ejer10.Ejer10;
import com.victorsashnev.tema10.Ejer11.Ejer11;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //Ejer01 ejer01 = new Ejer01();
        //Ejer02 ejer02 = new Ejer02();
        //Ejer07 ejer07 = new Ejer07();
        //Ejer08 ejer08 = new Ejer08();
        //Ejer10 ejer10 = new Ejer10();
        Ejer11 ejer11 = new Ejer11();
    }
}

/*
// // Type your code here, or load an example.
//class Square {
//    public static void main(String [] args) {
//        Persona p1 = new Persona(6,"Juan");
//        Persona p2 = new Persona(6,"Pedro");
//
//        System.out.println(p1.equals(p2));
//
//        System.out.println(p1.hashCode());
//        System.out.println(p2.hashCode());
//    }
//        public static class Persona{
//            private int dni;
//            private String nombre;
//
//            public Persona(int dni, String nombre){
//                this.dni=dni;
//                this.nombre=nombre;
//            }
//            public int getDni(){
//                return dni;
//            }
//
//            public String getNombre(){
//                return nombre;
//            }
//        @Override
//        public boolean equals(Object o){
//            if(this == o)
//            return true;
//            if(o == null || getClass() != o.getClass())
//            return false;
//            Persona p =(Persona)o;
//            return this.dni ==p.dni && this.nombre.equals(p.nombre);
//        }
//
//        @Override
//        public int hashCode(){
//            int result = nombre.hashCode();
//            return 31 * result +dni;
//        }
//    }
//}
 */