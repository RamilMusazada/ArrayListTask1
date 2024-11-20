package org.example;

import java.util.ArrayList;
import java.util.Random;

//3.ArrayList yaradın və təsadüfi olaraq 20 rəqəm (1-dən 100-ə qədər) əlavə edin.Siyahını artan sırada sıralayın.
//Ən böyük və ən kiçik rəqəmi tapıb göstərin.
public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        Random random = new Random();
        for ( int i = 0 ; i < 20 ; i++) {
            number.add(random.nextInt(1, 99));
        }
        System.out.println("Normal list :"+ number);
        bubbleSort(number);
        System.out.println("Sorted list :"+number);

    }
    public static void bubbleSort(ArrayList<Integer> number){
        for ( int i = 0 ; i < number.size()-1 ; i++){
            for (int j = 0 ; j < number.size()-i-1;j++)
                if (number.get(j)>number.get(j+1)){
                    int temp = number.get(j);
                    number.set(j,number.get(j+1));
                    number.set(j+1,temp);

            }
        }
    }
}
