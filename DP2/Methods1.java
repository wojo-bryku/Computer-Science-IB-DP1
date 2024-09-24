//Exercise 1: Write a method that reads an integer and checks if it is even or odd.

package DP2;
import java.util.Scanner;


public class Methods1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");

        int num = sc.nextInt();

        checkEvenOdd(num);
        

    }

    public static void checkEvenOdd(int num) {
        if(num % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
    
}
