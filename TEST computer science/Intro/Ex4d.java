// Write a program that calculates the sum and the average of the first n natural numbers divisible by 7. The value of n should be entered by the user as the input. Use a for loop.
import java.util.Scanner;


public class Ex4d {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Setting up the scanner

        System.out.println("Enter n"); //prompt user
        int n = reader.nextInt(); //read input

        reader.close(); //closing scanner - saving memory

        int sum = 0;
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 7 == 0) {
                sum += i;
                count++;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum / count));
    }
}
