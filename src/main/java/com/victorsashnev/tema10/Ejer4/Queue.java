package com.victorsashnev.tema10.Ejer4;

import com.victorsashnev.tema10.Ejer4.ICola;
import java.util.ArrayList;
import java.util.Arrays;

public class Queue<T> implements ICola<T> {

    private ArrayList<T> data;

    public Queue(int capacity) {
        data = new ArrayList<T>(capacity);

    }

    /**
     * Add element
     * @param e
     * @return
     */
    @Override
    public boolean add(T e) {
       return data.add(e);
    }

    /**
     * Remove element
     * @return
     */
    @Override
    public T remove() {
        if(data.size()>0)
            return data.remove(0);
        return null;
    }

    /**
     * get size of arraylist
     * @return
     */
    @Override
    public int size() {
       return data.size();
    }

    /**
     * peek at who is first in queue
     * @return
     */
    @Override
    public T peek() {
        if(data.size()>0)
            return data.get(0);
        return null;
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public String toString() {
        return "Queue{" +
                "data=" + data +
                '}';
    }
}
