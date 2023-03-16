package com.victorsashnev.tema10.Ejer4;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<>(10);

        queue.add(55);
        queue.add(47);
        queue.add(87);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue.peek());
        queue.remove();
        System.out.println(queue);
    }
}
