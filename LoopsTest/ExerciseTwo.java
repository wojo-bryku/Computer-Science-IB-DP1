//Using basic java Write a Java program that reads 10 numbers from the user. Use a for loop to complete this task. The line responsible for reading in a number should appear only once in your code. The program should then find the sum and average of the entered numbers. The program should also display the largest and smallest numbers entered.

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter third number: ");
        int num3 = sc.nextInt();

        System.out.println("Enter fourth number: ");
        int num4 = sc.nextInt();

        System.out.println("Enter fifth number: ");
        int num5 = sc.nextInt();

        System.out.println("Enter sixth number: ");
        int num6 = sc.nextInt();

        System.out.println("Enter seventh number: ");
        int num7 = sc.nextInt();

        System.out.println("Enter eighth number: ");
        int num8 = sc.nextInt();

        System.out.println("Enter ninth number: ");
        int num9 = sc.nextInt();

        System.out.println("Enter tenth number: ");
        int num10 = sc.nextInt();


        int sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
        int average = sum / 10;
        
        System.out.println("The sum of the numbers is: " + sum + " and the average is: "+ average);
        

        ///The program should also display the largest and smallest numbers entered; use whie/for

        
        int largest = num1;
        int smallest = num1;

        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        if (num4 > largest) {
            largest = num4;
        }
        if (num5 > largest) {
            largest = num5;
        }
        if (num6 > largest) {
            largest = num6;
        }
        if (num7 > largest) {
            largest = num7;
        }
        if (num8 > largest) {
            largest = num8;
        }
        if (num9 > largest) {
            largest = num9;
        }
        if (num10 > largest) {
            largest = num10;
        }

        
        






        System.out.println("The largest number is: " + largest + " and the smallest number is: " + smallest);

        




    }
    
}
