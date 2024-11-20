package org.example;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(6);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(7);
        list2.add(8);
        System.out.println(merge(list1, list2));

    }

    public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> list3 = new ArrayList<>(list1);
        list3.addAll(list2);
        return list3;
    }
}
