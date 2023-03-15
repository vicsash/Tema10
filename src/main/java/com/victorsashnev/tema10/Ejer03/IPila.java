package com.victorsashnev.tema10.Ejer03;
    public interface IPila<String> {
        String push(String e);
        String pop();
        int size();
        String top();
        boolean isEmpty();
    }

