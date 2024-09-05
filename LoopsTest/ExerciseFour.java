//Write a Java program that converts a user specified decimal number (base 10) into its binary representation (base 2). The binary number should be stored in a String variable. Below you can find an example demonstrating how the conversion can be done for decimal number 13:

import java.util.Scanner; 

public class ExerciseFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int remainder;
        String binary = "";
        while (num > 0) 
        {
            remainder = num % 2;
            binary = remainder + binary;
            num /= 2;
        }
        
        System.out.println("The binary representation of the number is: " + binary);
    }
}

