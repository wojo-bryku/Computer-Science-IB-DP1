//Write a program that accepts an integer and checks, whether it consists of four digits. If it does, the program should print them in opposite order. The task should be solved without using any additional external libraries or methods.
import java.util.Scanner;


public class Excersise5{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Setting up the scanner

        System.out.println("Enter number"); //prompt user
        int num = reader.nextInt(); //read input

        reader.close(); //closing scanner - saving memory

        if(999 < num && 10000 > num) //if num is in the range consisting of four digits
        {
            System.out.println("The number does consist of four digits."); 
// the program should print them in opposite order. The task should be solved without using any additional external libraries or methods.
            int num1 = num / 1000; //first digit
            int num2 = (num % 1000) / 100; //second digit
            int num3 = (num % 100) / 10; //third digit
            int num4 = num % 10; //fourth digit

            System.out.println(num4 + "" + num3 + "" + num2 + "" + num1); //print in opposite order
        

        }
        else
        {
            System.out.println("The number does not consist of four digits."); //if num is not in the range consisting of four digits
        }


    }
}