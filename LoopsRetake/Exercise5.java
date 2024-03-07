// ..Write a Java program that checks whether a user specified number consists of all even numbers or of all odd numbers (0 is an even number) and produces an appropriate output.

import java.util.Scanner;


public class Exercise5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter num");
    int n = sc.nextInt();
    int even = 0;
    int odd = 0;
    while (n > 0) 
    {
      int digit = n % 10;
      if (digit % 2 == 0) 
      {
        even++;
      } 
      else 
      {
        odd++;
      }
      n /= 10;
    }
    if (even == 0) 
    {
      System.out.println("All odd");
    } else if (odd == 0) 
    {
      System.out.println("All even");
    } else 
    {
      System.out.println("Mixed");
    }

    
    System.out.println("Even: " + even);


  }
}
