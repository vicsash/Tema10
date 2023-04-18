package com.victorsashnev.tema10.Ejer11;

public class Aula {
    private String codigoIdentificador;
    private int counter = 0;
    private int metros;

    public Aula(String codigoIdentificador, int metros) {
        this.codigoIdentificador = codigoIdentificador;

        this.metros = metros;
    }
    public String getXodigoIdentificador() {
        return codigoIdentificador;
    }
    public int getMetros() {
        return metros;
    }
    @Override
    public String toString() {
        return "Aula{" +
                "codigoIdentificador=" + codigoIdentificador +
                ", metros='" + metros + '\'' +
                '}';
    }
}
