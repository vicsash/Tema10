package com.victorsashnev.tema10.Hashmap;

public class HashMap {
    private ??? [] data;
    public class Node<K,V>{
        private final K key;
        private final V value;
        private final int hash;
        public Node(K key,V value,int hash){
            this.key = key;
            this.value = value;
            this.hash = hash;
        }
    }

}
