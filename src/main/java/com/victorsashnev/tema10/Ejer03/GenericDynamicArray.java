package com.victorsashnev.tema10.Ejer03;

/*public class GenericDynamicArray <T> implements  IPila<T>{
    private static final double ERROR = Double.NEGATIVE_INFINITY;
    //Static is used because they will not be extracted to other classes ¿?¿?¿?¿?¿?¿?¿?
    private static final int DEAULT_CAPACITY = 10;
    private static final float GROW_FACTOR = 2f;
    private double[] data;
    private int size;

    public Stack(){
        this(DEAULT_CAPACITY);
    }
    public void Stack(int capacity){
        data = new double[capacity];
        size = 0;
    }

    @Override
    public T push(T e) {
        if(isFull()){
            resize();
        }
        data[size] = value;
        size++;
        return true;
    }

    public T pop(){
        double result = ERROR;
        if(isEmpty()){
            result = data[size- 1];
            size--;
        }
        return result;
    }

    @Override
    public T size() {
        return 0;
    }

    public T top(){
        double result =ERROR;
        if(!isEmpty()){
            result = data[size-1];
        }
        return result;
    }
    private T resize(){
        double[] array = new double[Math.round(data.length * GROW_FACTOR)];
        for(int i = 0; i < data.length;i++){
            array[i] = data[i];
        }
        return (T) (data = array);
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return  size == data.length;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i<size;i++){
            sb.append(String.format("%.2f",data[i])).append(" ");
        }
        sb.append("]");
        return "Stack{" +
                "data=" + sb +
                ", size=" + size +
                '}';
    }
}
*/