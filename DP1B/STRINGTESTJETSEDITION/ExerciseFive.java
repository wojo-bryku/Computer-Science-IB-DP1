//5. Write a program that checks how many trailing characters (characters at the end of a word) have to be removed from a string entered by the user to form a palindrome. The program should also output which characters need to be removed.
//Example:
//Input: madam Output: 0 Input: rotatorab Output: 2 (ab needs to be removed)

package STRINGTESTJETSEDITION; // bez tego mi compilator wysadza :/

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) 
        {
            reversed += input.substring(i, i + 1);
        }

        int charsToRemove = 0;
        while (!input.substring(0, input.length() - charsToRemove).equals(reversed.substring(charsToRemove))) 
        {
            charsToRemove++;

            
        }

        System.out.println("Number of characters to remove: " + charsToRemove);

        if (charsToRemove > 0) 
        {
            System.out.println("Characters to remove: " + input.substring(input.length() - charsToRemove));


        }




        
    }
}