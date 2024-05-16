//Write a program that triples every second letter in a user-specified.
//Example:
//Input: banana Output: baaanaaanaaa Input: cactus Output: caaactttusss

package StringsTest;

import java.util.Scanner;

public class ExerciseThree{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a word: ");
		String word = sc.next();

		String newWord = "";
		for(int i = 0; i < word.length(); i++)
		{
			String singleChar = word.substring(i, i + 1);
			if(i % 2 == 1)
			{
				newWord += singleChar + singleChar + singleChar;
			}
			else
			{
				newWord += singleChar;
			}
		}
		System.out.println(newWord);






	}
	








}