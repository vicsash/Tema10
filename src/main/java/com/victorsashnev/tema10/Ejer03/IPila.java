package com.victorsashnev.tema10.Ejer03;
    public interface IPila<T> {
        T push(String e);
        T pop();
        T size();
        T top();
        boolean isEmpty();
    }

