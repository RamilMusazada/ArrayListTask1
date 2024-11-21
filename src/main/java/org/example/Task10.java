package org.example;

import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.Vector;

public class Task10 {
    public static void main(String[] args) {
        Vector < Integer > numbers = new Vector<>();
        Random random = new Random();
        for ( int i = 0 ; i< 10 ; i++){
            numbers.add(random.nextInt(100));
        }
        Collections.sort(numbers);
        System.out.println("Artan sira : ");
        System.out.println(numbers);
    }
}
