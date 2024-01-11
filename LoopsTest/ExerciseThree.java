//Write a Java program that calculates the factorial of a user specified number. Apart from the result, the expression for calculating the product should also be printed by the program. Use a while loop to complete this task.

import java.util.Scanner;


public class ExerciseThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int factorial = 1;
        int i = 1;
        while (i <= num) 
        {
            factorial *= i;
            i++;
        }
        System.out.println("The factorial of " + num + " is " + factorial);

        //the expression for calculating the product
        System.out.println("The expression for calculating the product is: ");
        int j = 1;
        while (j <= num) 
        {
            if (j == num) 
            {
                System.out.print(j);
            } else 
            {
                System.out.print(j + " * ");
            }
            j++;
        }

    }
} 
