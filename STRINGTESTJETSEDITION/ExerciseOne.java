// EX1) Write a Java program that takes a word from the user and spells it out, displaying each character sequentially.
// Example: Input: Hello 
// Output: H e l l o

//package STRINGTESTJETSEDITION; // bez tego mi compilator wysadza :/ womp womp

import java.util.Scanner;

public class ExerciseOne{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        
        for (int i = 0; i < word.length(); i++) 
        {
            System.out.print(word.substring(i, i + 1) + "   ");

        }

    }




}
