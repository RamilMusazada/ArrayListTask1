package org.example;

import java.util.ArrayList;
import java.util.Scanner;

//Bir ArrayList yaradın və
//7 rəqəm əlavə edin.
//İstifadəçidən bir rəqəm daxil etməsini istəyin.
//Bu rəqəm siyahıda varsa,
//"Tapıldı" mesajını göstərin. Yoxdursa, "Tapılmadı" yazın.
public class Task5 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(11);
        list.add(13);
        list.add(15);
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (list.contains(a)){
            System.out.println("Tapildi");
        }
        else
            System.out.println("Tapilmadi");
    }
}
