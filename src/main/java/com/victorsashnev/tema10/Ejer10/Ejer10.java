package com.victorsashnev.tema10.Ejer10;

import com.victorsashnev.tema10.Lib;

public class Ejer10 {
    public Ejer10(){
        int numMenu;
        int numSubMenu;
        int num;
        Management manage = new Management();
        do {
            System.out.println(menu());
            numMenu = Lib.scanInt();
            switch (numMenu){
                    // Nuevo empleado
                case 1:
                    System.out.println("Entra 1 si tiene un hijo 0 si no.");
                    num = Lib.scanInt();
                    manage.newWorker(num);
                    break;
                    //Nuevo hijo
                case 2:
                    break;
                    //Modificar sueldo
                case 3:
                    break;
                    //Borrar empleado
                case 4:
                    break;
                    // Borrar hijo
                case 5:
                    break;
                    // Consultas
                case 6:
                    do {
                        numSubMenu = Lib.scanInt();
                        System.out.println(subMenuConsultas());
                        switch (numSubMenu) {
                            //  Buscar por NIF
                            case 1:
                                break;
                            // Buscar por nombre
                            case 2:
                                break;
                            // Buscar por rango de edad.
                            case 3:
                                break;
                            //Buscar por rango de sueldo.
                            case 4:
                                break;
                            // Buscar por hijos menores de edad
                            case 5:
                                break;
                            //Salir
                            case 0:
                                break;
                            default:
                                break;
                        }

                    }while(numSubMenu != 0);
                    break;
                    //Salir
                case 0:
                    break;
                default:
                    break;
            }

        }while(numMenu != 0);
    }

    public String menu(){
        StringBuilder sb = new StringBuilder();
        sb.append("*********************\n");
        sb.append("**Gestion Empleados**\n");
        sb.append("*********************\n");
        sb.append("1. Nuevo empleado\n");
        sb.append("2. Nuevo hijo\n");
        sb.append("3. Modificar sueldo\n");
        sb.append("4. Borrar empleado\n");
        sb.append("5. Borrar hijo\n");
        sb.append("6. Consultas\n");
        sb.append("----------------------\n");
        sb.append("0. Salir\n");
        return sb.toString();
    }

    public String subMenuConsultas(){
        StringBuilder sb = new StringBuilder();
        sb.append("*********************\n");
        sb.append("** CONSULTAS EMPLEADOS**\n");
        sb.append("*********************\n");
        sb.append("1. Buscar por NIF\n");
        sb.append("2. Buscar por nombre\n");
        sb.append("3. Buscar por rango de edad. \n");
        sb.append("4. Buscar por rango de sueldo.\n");
        sb.append("5. Buscar por hijos menores de edad\n");
        sb.append("----------------------\n");
        sb.append("0. Volver al menú principal\n");
        return sb.toString();
    }

}
