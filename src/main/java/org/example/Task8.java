package org.example;

import java.util.LinkedList;
import java.util.Random;

//8.	Təsadüfi ədədlərlə doldurulmuş bir LinkedList yaradın.
// Siyahının uzunluğunu hesablayın və
// ortadakı elementi tapın.
// Uzunluq təkdirsə, tam ortadakı elementi göstərin.
// Uzunluq cütdürsə, iki orta elementi göstərin
public class Task8 {
    public static void main(String[] args) {
        Random random = new Random();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10));
        }
        System.out.println(list);

        if (list.size() % 2 == 1) {
            int index = list.size() / 2;
            System.out.println("ortadaki eded : " + list.get(index));
        } else {
            int index1 = list.size()/2;
            int index2 = list.size() / 2 - 1;
            System.out.println("ortadaki elementler : "+ list.get(index1) + " " + list.get(index2));
        }
    }
}
