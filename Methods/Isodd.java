// Introduction to methods JAVA
import java.util.Scanner;

public class Isodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // def scanner as sc


        System.out.println("Enter a number: ");
        int num = sc.nextInt();

       if (isOdd(num)) { //if isOdd is true
           System.out.println(num + " is an odd number"); //print
       } else { //if isOdd is false
           System.out.println(num + " is an even number"); //print
       }


    }
    public static boolean isOdd(int num) { //method to check if number is odd
        if(num % 2 == 0) { //if number is divisible by 2 && no reminder
            return false; 
        } else {
            return true;
        }
    }
    
}
