package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

//Bir ArrayList və bir LinkedList yaradın.  Hər ikisinə 1 milyona qədər təsadüfi rəqəm əlavə edin.
//Hər birinin əlavəetmə sürətini ölçün və müqayisə edin.İpucu: System.nanoTime() istifadə edə bilərsiniz.
public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        long ArrayListTime = System.nanoTime();
        ArrayList < Integer > list1 = new ArrayList<>();
        for ( int i = 0 ; i < 1000000 ; i ++){
            list1.add(random.nextInt());
        }
        long ArrayListTime2 = System.nanoTime();
        long LinkedListTime1= System.nanoTime();
        LinkedList < Integer > list2= new LinkedList<>();
        for (int i = 0 ; i < 1000000 ; i ++){
            list2.add(random.nextInt());
        }
        long LinkedListTime2 = System.nanoTime();
        System.out.println("ArrayList: " + (ArrayListTime2-ArrayListTime));
        System.out.println("LinkedList: "+ (LinkedListTime2-LinkedListTime1));

    }
}
