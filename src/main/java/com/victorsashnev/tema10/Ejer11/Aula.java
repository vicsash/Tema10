package com.victorsashnev.tema10.Ejer11;

public class Aula {
    private int id;
    private int counter = 0;
    private String metros;

    public Aula(int id, int counter, String metros) {
        this.id = counter++;
        this.counter = counter;
        this.metros = metros;
    }

    public int getId() {
        return id;
    }

    public int getCounter() {
        return counter;
    }

    public String getMetros() {
        return metros;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "id=" + id +
                ", counter=" + counter +
                ", metros='" + metros + '\'' +
                '}';
    }
}
