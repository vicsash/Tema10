package com.victorsashnev.tema10.Ejer11;
import com.victorsashnev.tema10.LibMethods;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.sql.Array;

public class Input {
    static OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
    public static String inputName() throws IOException {
        streamWriter.write("Escibe el nombre");
        streamWriter.flush();
        String nombre = LibMethods.scanString();
        return nombre;
    }

    public static String idenCode() throws IOException {
        streamWriter.write("Escibe el codigo");
        streamWriter.flush();
        String nombre = LibMethods.scanString();
        return nombre;
    }

    public static String[] inputStringArray() throws IOException{
        String[]asingaturas = new String[5];
        int loop = 1;
        streamWriter.write("Intoduce 5 asignaturas para matricular");
        streamWriter.flush();
        for (int i = 0; i < 5; i++){
            do {
                asingaturas[i] = LibMethods.scanString();
                for (String asingatura : asingaturas) {
                    if (asingatura.equalsIgnoreCase(asingaturas[i])) {
                        streamWriter.write("Este asignatura ya esta entrada");
                        streamWriter.flush();
                    } else
                        loop = 0;
                }
            }while(loop == 1);

        }
        return asingaturas;
    }
    public static int inputInteger(){
        return LibMethods.scanInt();
    }

}
