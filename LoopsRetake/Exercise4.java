// Write a Java program that converts a user specified decimal number (base 10) into its binary representation (base 2). The binary number should be stored in a String variable. Below you can find an example demonstrating how the conversion can be done for decimal number 13:
//

import java.util.Scanner;

public class Exercise4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");


    int n = sc.nextInt();
    String binary = "";


    while (n > 0) 
    {
      binary = (n % 2) + binary;
      n /= 2;
    }


    System.out.println("Base2: " + binary);

  }
}
