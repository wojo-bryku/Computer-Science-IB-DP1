//Write a Java program that reads 10 numbers from the user. Use a while loop to complete this task. The line responsible for reading in a number should appear only once in your code. The program should then find the sum and average of the entered numbers. The program should also display the largest and smallest numbers entered.

import java.util.Scanner;


public class ExerciseTwo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double sum = 0;
    int count = 0;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    while (count < 10) 
    {
      System.out.println("Enter a number: ");
      int n = sc.nextInt();
      sum += n;
      count++;
      if (n > max) 
      {
        max = n;
      }
      if (n < min) 
      {
        min = n;
      }
    }
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + (sum / 10));
    System.out.println("Max: " + max);
    System.out.println("Min: " + min);

   


  }






}
