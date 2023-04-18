package com.victorsashnev.tema10.Ejer11;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.io.IOException;

public class Centro {
    private  ArrayList<Alumno>alumno = new ArrayList<Alumno>();
    private  ArrayList<Asignatura> asignaturas = new ArrayList<>();
    private  ArrayList<Aula>aulas = new ArrayList<>();
    private  ArrayList<Grupo>grupos = new ArrayList<>();
    private  ArrayList<Profesor>profesors = new ArrayList<>();
    Faker faker = new Faker();


    protected Centro(){
        alumno = new ArrayList<>();
        asignaturas = new ArrayList<>();
        aulas = new ArrayList<>();
        grupos = new ArrayList<>();
        profesors = new ArrayList<>();
    }

    protected String altaAlumno()throws IOException{
        System.out.println("Error");
        StringBuilder sb = new StringBuilder();
        String nombre = Input.inputName();
        if(comprobarAlumno(nombre) == 0 ){
            return sb.append("Este alumno ya existe").toString();
        }
        String nombreGrupo = Input.inputName();
        int id = comprobarGrupo(nombreGrupo);
        if(id == 0){
            String [] asignaturas = Input.inputStringArray();
            if(comprobarAsignaturas(asignaturas)==0)
                return sb.append("Una de las asignaturas no existe").toString();
            alumno.add(new Alumno(nombre,grupos.get(id),asignaturas));
        }else{
        return sb.append("El grupo no existe").toString();
        }
        return sb.toString();
    }
    protected int comprobarAlumno(String nombre){
        for (int i = 0; i < alumno.size(); i++){
            if(alumno.get(i).getNombre().equalsIgnoreCase(nombre))
                return i;
        }
        return 1;
    }
    protected  int comprobarGrupo(String nombre){
        for (int i = 0; i < alumno.size(); i++){
            if(alumno.get(i).getGrupo().getNombre().equalsIgnoreCase(nombre))
                return i;
        }
        return 0;
    }
    protected int comprobarAsignaturas(String [] aray){
        int contador = 0 ;
        for (Asignatura asignatura : asignaturas) {
            for (String s : aray) {
                if (s.equalsIgnoreCase(asignatura.getNombre()))
                    contador++;
                if (contador == aray.length)
                    return 1;
            }
        }
        return 0;
    }

    protected int comprobarAsignaturas(String nombre){
        for (Asignatura asignatura : asignaturas) {
            if (asignatura.getNombre().equalsIgnoreCase(nombre))
                return 1;
        }
        return 0;
    }

    protected int comprobarProfesor(String nombre){
        for (int i = 0; i < alumno.size(); i++){
            if(profesors.get(i).getNombre().equalsIgnoreCase(nombre))
                return i;
        }
        return 0;
    }

    protected int comprobarAula(String codigo){
        for (int i = 0; i <aulas.size();i++){
            if(aulas.get(i).getXodigoIdentificador().equalsIgnoreCase(codigo))
                return i;
        }
        return 0;
    }

    protected String altaAsignatura() throws IOException {
        StringBuilder sb = new StringBuilder();
        String nombre = Input.inputName();
        if (comprobarAsignaturas(nombre)==0){
            return sb.append("Este asignatura ya existe").toString();
        }
        String nombreProfesor =Input.inputName();
        int id =comprobarProfesor(nombreProfesor);
        String codigoDeIdnetificacion = Input.inputName();
        if(id == 0)
            return sb.append("Este profesor no existe").toString();
        asignaturas.add(new Asignatura(codigoDeIdnetificacion,nombre,profesors.get(id)));
        return sb.append("Nueva asignatura añadida").toString();
    }

    protected String altaAula() throws IOException {
        StringBuilder sb = new StringBuilder();
        String codIden = Input.idenCode();
        if(comprobarAula(codIden) == 1){
            int metros =  Input.inputInteger();
            aulas.add(new Aula(codIden,metros));
            return sb.append("Alta dada").toString();
        }

        return sb.append("Este aula ya existe").toString();
    }

    protected String altaGrupo() throws IOException{
        StringBuilder sb = new StringBuilder();
        String codIden = Input.idenCode();
        if(comprobarGrupo(codIden) == 1){
            String nombre = Input.inputName();
            String codAula = Input.idenCode();
            int idAula = comprobarAula(codAula);
            if(idAula==0)
                return sb.append("Este aula no existe").toString();
            grupos.add(new Grupo(codIden,nombre,aulas.get(idAula)));
            return sb.append("Alta dada").toString();
        }
        return sb.append("Este grupo ya existe").toString();
    }

    protected String altaProfesor()throws IOException{
        StringBuilder sb = new StringBuilder();
        String dni = Input.idenCode();
        String nombre = Input.inputName();
        if(comprobarProfesor(nombre) != 0){
            String sueldo = Input.idenCode();
            profesors.add(new Profesor(dni,nombre,sueldo));
            return sb.append("Alta dada").toString();
        }
        return sb.append("Este profesor existe").toString();
    }

    protected String consultAlumno()throws IOException{
        StringBuilder sb = new StringBuilder();
        String nombre = Input.inputName();
        int idAlu =comprobarAlumno(nombre);
        if(idAlu != 1)
            return sb.append(alumno.get(idAlu)).toString();
        return sb.append("Este alumno no existe").toString();
    }

    protected String consultGrupo()throws IOException{
        StringBuilder sb = new StringBuilder();
        String nombreGrup = Input.inputName();
        if(comprobarGrupo(nombreGrup) == 0)
            return sb.append("Este grupo no existe").toString();
        for(int i = 0; i < alumno.size();i++ ){
            if(alumno.get(i).getGrupo().getNombre().equalsIgnoreCase(nombreGrup)){
                sb.append(alumno.get(i));
            }
        }
        if(sb.isEmpty())
            return sb.append("Este grupo es vaccio").toString();
        return sb.toString();
    }

    protected String consultProfesor()throws IOException{
        StringBuilder sb = new StringBuilder();
        String nombre = Input.inputName();
                for (int i = 0; i <profesors.size();i++){
                    if (profesors.get(i).getNombre().equalsIgnoreCase(nombre))
                        sb.append(profesors.get(i));
                }
                if(sb.isEmpty())
                    sb.append("Este profesor no existe");
        return sb.toString();
    }

    protected String exit(){
        StringBuilder sb = new StringBuilder();
        return sb.append("Fin").toString();
    }

    protected String consulta(){
        StringBuilder sb = new StringBuilder();
        return sb.append("Consultas").toString();
    }
}
