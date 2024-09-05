//Exercise 11: Write a program to print Fibonacci series up to n terms and their sum.

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the number of terms for the Fibonacci series: ");
        int n = reader.nextInt();

        int[] fib = new int[n];

        fib[0] = 0;
        fib[1] = 1;

        System.out.println("Fibonacci series to: " + n + " terms");
        System.out.println(fib[0] + " + " + fib[1]);

        int sum = fib[0] + fib[1];


        for(int i = 2; i < n; i++)
        {
            fib[i] = fib[i-1] + fib[i-2];
            System.out.println(fib[i]);
            sum += fib[i];
            System.out.println("Sum: " + sum);
        }



    }
}
