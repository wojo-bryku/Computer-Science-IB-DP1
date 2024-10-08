package DP2.Test2;
import java.util.Scanner;



public class ExerciseOne {
    public static void main(String[] args) {
        
        //isEven
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scn.nextInt();
        System.out.println("isEven: " + isEven(number));

    
    }
    

    public static boolean isEven(int number) {
        while (number > 0) 
        {
            int digit = number % 10;
            if (digit % 2 != 0) 
            {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}
