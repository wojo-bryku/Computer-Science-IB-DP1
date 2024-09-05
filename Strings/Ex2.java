//Exercise 2: Write a Java program that takes a word from the user and spells it out, displaying each character sequentially.


import java.util.Scanner;


public class Ex2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = reader.next();

        for(int i = 0; i < word.length(); i++)
        {
            String singleChar = word.substring(i, i + 1);
            System.out.println(singleChar);
        }

    }
}