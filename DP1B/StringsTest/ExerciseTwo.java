// Write a program that counts the number of occurrences of a user-specified letter in a given word (two separate input values).
// Example:
// Input: a and banana Output: 3 Input: c and cactus Output: 2 Input: e and book Output: 0


package StringsTest;

import java.util.Scanner;


public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = sc.next();

        System.out.println("Enter a letter: ");
        String letter = sc.next();

        int count = 0;
        for(int i = 0; i < word.length(); i++)
        {
            String singleChar = word.substring(i, i + 1);
            if(singleChar.equals(letter))
            {
                count++;
            }
        }
        System.out.println("letter " + letter + " appears " + count + " times in the word " + word);
    }
    
}
