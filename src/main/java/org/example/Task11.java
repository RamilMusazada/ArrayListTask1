package org.example;

import java.util.Vector;

public class Task11 {
    public static void main(String[] args) {
        Vector < Integer > numbers = new Vector<>(10);
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        System.out.println("Ededler : "+ numbers.size());
        System.out.println("Capacity: "+ numbers.capacity());
        numbers.trimToSize();
        System.out.println("Metod sonrasi ededler : "+ numbers.size());
        System.out.println("Metod sonraso capacity: "+ numbers.capacity());
    }
}
