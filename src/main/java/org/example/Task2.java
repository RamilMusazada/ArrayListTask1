package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("10 eded daxil edin : ");
        ArrayList < Integer > numbers = new ArrayList<>();

        for (int i = 0 ; i < 10 ; i++){
            numbers.add(scanner.nextInt());
        }
        ArrayList <Integer> diffNumbers  = deleteDublicates(numbers);
        System.out.println("Unikal elementlerden ibaret olan list : "+ diffNumbers);
    }
    public static ArrayList<Integer> deleteDublicates(ArrayList<Integer> list){
        ArrayList <Integer> samesList = new ArrayList<>();
        for(Integer number : list){
            if(!samesList.contains(number)){
                samesList.add(number);
            }
        }
        return samesList;
    }
}
