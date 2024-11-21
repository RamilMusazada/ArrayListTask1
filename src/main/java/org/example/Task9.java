package org.example;

import java.util.LinkedList;
import java.util.Scanner;

//Bir LinkedList yaradın
//və istifadəçidən 10 rəqəm daxil etməsini istəyin.
//Siyahıdakı təkrarlanan elementləri silərək yalnız unikal elementləri saxlayan metod yazın.
public class Task9 {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 10 numbers : ");
        for ( int i = 0 ; i < 10 ; i++){
            list.add(scanner.nextInt());
        }
        removeDublicates(list);
        System.out.println(list);

    }
    public static void removeDublicates(LinkedList<Integer> list ){
        for ( int i = 0 ; i < list.size() ; i++){
            for (int j = i +1 ; j < list.size() ; j ++){
                if ( list.get(i).equals(list.get(j))){
                    list.remove(j);
                    j--;
                }
            }
        }
    }
}
