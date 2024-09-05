//Using basic java Write a Java program that reads 10 numbers from the user. Use a for loop to complete this task. The line responsible for reading in a number should appear only once in your code. The program should then find the sum and average of the entered numbers. The program should also display the largest and smallest numbers entered.

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ///The program should also display the largest and smallest numbers entered; use whie/fors loops
        int i = 0;
        int sum = 0;
        int largest = -2147483648; //smallest possible int
        int smallest = 2147483647; //largest possible int
        int avg = 0;
        while(i<10)
        {
            System.out.println("Enter a " + i + " number: ");
            int num = sc.nextInt();
            sum = sum + num;

            if (num>largest)
            {
                largest = num;
            }
            if (num<smallest)
            {
                smallest = num;
            }
            i++;

        }
        
        avg = sum / 10;





        System.out.println("The sum of the numbers is: " + sum + " and the average is: "+ avg);
        System.out.println("The largest number is: " + largest + " and the smallest number is: " + smallest);

        




    }
    
}
