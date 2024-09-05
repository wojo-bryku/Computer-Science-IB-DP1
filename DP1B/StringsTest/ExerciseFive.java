//String class
//----------------
//+ for concatenation
//.equals(String)
//.substring(startPos, endPos)
//.length()
//.indexOf(String)
//.compareTo(String)
//.toUpperCase()
//.toLowerCase()

//5. Write a program that checks how many trailing characters (characters at the end of a word) have to be removed from a string entered by the user to form a palindrome. The program should also output which characters need to be removed.
//Example:
//Input: madam Output: 0 Input: rotatorab Output: 2 (ab needs to be removed)

package STRINGTESTJETSEDITION;

import java.util.Scanner;

public class ExerciseFive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = sc.nextLine();

        int count = 0;

        //Input: madam Output: 0 Input: rotatorab Output: 2 (ab needs to be removed)

        
        for (int i = 0; i < word.length(); i++) 
        {
            if (word.substring(i, i + 1).equals(word.substring(word.length() - i - 1, word.length() - i))) 
            {
                count++;
            }
        }

        //System.out.println("Number of trailing characters to be removed: " + (word.length() - count)); // not working
        //System.out.println("Characters to be removed: " + word.substring(word.length() - count, word.length())); //not working
        

        





        




        

    }
}