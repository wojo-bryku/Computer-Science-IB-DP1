//Write a Java program that performs addition on a sequence of subsequent odd numbers and multiplication on a sequence of subsequent odd numbers, starting from 1 up to a user-defined upper limit (max 9). Printing of explanations is not required.


import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 9: ");
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                product *= i;
            } else {
                sum += i;
            }
        }
        System.out.println("Sum of odd numbers: " + sum);
        System.out.println("Product of even numbers: " + product);
  }
}
