package org.example;

import java.util.ArrayList;
import java.util.Scanner;

//4.İstifadəçidən sözlər daxil etməsini istəyin və onları bir ArrayList-də saxlayın.
// Siyahıda olan palindrom sözləri tapıb ayrı bir siyahıya əlavə edin.Palindrom misalı: "ana", "level", "radar".
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        System.out.println("Enter 5 words : ");
        for ( int i = 0 ; i < 5 ; i++){
            String word = scanner.next();
            words.add(word);
        }
        System.out.println("Palindrome words are :" + palindromeWords(words));
    }
    public static boolean palindrome (String word){
        int n = word.length();
        for ( int i = 0 ; i < n /2 ; i ++){
           if (word.charAt(i) != word.charAt(n - 1 - i)){
               return false;
           }
        }
        return true;
    }
    public static ArrayList<String> palindromeWords(ArrayList<String> words){
        ArrayList <String> palindromes = new ArrayList<>();
        for (String word : words ){
            if (palindrome(word)){
                palindromes.add(word);
            }
        }
        return palindromes;
    }
}
