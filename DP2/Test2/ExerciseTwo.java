package DP2.Test2;
import java.util.Scanner;

//Write a method that checks whether a number is prime or not. Then, write a program that uses this method to find the first prime number that’s greater than a user specified number and the first one that’s less than a user specified number.
//Example 1
//input: Array: [3, 8, 1, 6, 2, 9] Value to find: 6
//output: 3
//Example 2
//input: Array: [7, 4, 5, 11, 14, 19] Value to find: 10
//output: -1

public class ExerciseTwo {
    public static void main(String[] args) {
        
        
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scn.nextInt();
        System.out.println("isPrime: " + isPrime(number));
        System.out.println("Next Prime: " + findNextPrime(number));
        


       
        
    }
    //isPrime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    //findNextPrime
    public static int findNextPrime(int number) {
        int nextPrime = number + 1;
        while (true) 
        {
            if (isPrime(nextPrime)) 
            {
                return nextPrime;
            }
            nextPrime++;
        }
    }
}
