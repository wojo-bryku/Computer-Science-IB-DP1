package DP2.Test2;
import java.util.Scanner;




public class ExerciseTwo {
    public static void main(String[] args) {
        
        
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scn.nextInt();
        System.out.println("isPrime: " + isPrime(n));
        System.out.println("Next Prime: " + findNextPrime(n));
        System.out.println("Previous Prime: " + findPreviousPrime(n));




       
        
    }
    //isPrime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    //findNextPrime
    public static int findNextPrime(int n) {
        int nextPrime = n + 1;
        while (true) 
        {
            if (isPrime(nextPrime)) 
            {
                return nextPrime;
            }
            nextPrime++;
        }
    }
    //findPreviousPrime
    public static int findPreviousPrime(int n) {
        int previousPrime = n - 1;
        while (true) 
        {
            if (isPrime(previousPrime)) 
            {
                return previousPrime;
            }
            previousPrime--;
        }
    }
}
