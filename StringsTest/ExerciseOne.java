// EX1) Write a Java program that takes a word from the user and spells it out, displaying each character sequentially.
// Example: Input: Hello 
// Output: H e l l o

package StringsTest;

import java.util.Scanner; 



public class ExerciseOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = sc.next();

        for(int i = 0; i < word.length(); i++)
        {
            String singleChar = word.substring(i, i + 1);
            System.out.print(singleChar + "       ");
        }
        
        

    }

}
