//Write a Java program that allows the user to enter a string and then the program should shift the characters of this string by a user-specified number of positions. This operation is called 'rotating the string'. When characters are shifted past the last position, they should reappear at the beginning of the string.
//Example: Input (string): hello Input (shift): 2 Output: lohel
//Input (string): hello Input (shift): 5 Output: hello


package StringsTest;

import java.util.Scanner;

public class ExerciseFour{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a word: ");
		String word = sc.next();
		String newWord = "";

		System.out.println("Enter a number to shift the word: ");
		int shift = sc.nextInt();

		for(int i = 0; i < word.length(); i++){
			newWord += word.charAt((i + shift) % word.length());
		}

		System.out.println(newWord);

		
		
	
	}

}
