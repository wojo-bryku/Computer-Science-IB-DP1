// Write a Java program that calculates the factorial of a user specified number. Apart from the result, the expression for calculating the product should also be printed by the program. Use a for loop to complete this task.
// Example:
// Input: 5 Output: 5! = 5 * 4 * 3 * 2 * 1 = 120
//

import java.util.Scanner;

public class Exercise3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = sc.nextInt();
    int product = 1;
    System.out.print(n + "! = ");
    for (int i = n; i > 0; i--) 
    {
      product *= i;
      if (i == 1) 
      {
        System.out.print(i);
      } else 
      {
        System.out.print(i + " * ");
      }
    }
    System.out.println(" = " + product);
  }
}
