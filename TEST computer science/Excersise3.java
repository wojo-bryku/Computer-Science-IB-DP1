// Write a program that accepts three numbers from the user and then prints them in ascending order.

import java.util.Scanner;


public class Excersise3 
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);  // Setting up the scanner

        System.out.println("Enter 1'st number"); //prompt user
        int num1 = reader.nextInt(); //read input

        System.out.println("Enter 2'nd number"); //prompt user
        int num2 = reader.nextInt(); //read input

        System.out.println("Enter 3'rd number"); //prompt user
        int num3 = reader.nextInt(); //read input

        reader.close(); //closing scanner - saving memory

        if(num1 > num2 && num1 > num3) //if num1 is the largest
        {
            if(num2 > num3) //if num 2 second largest
            {
                System.out.println(num3 + " " + num2 + " " + num1);
            } 
            else 
            {
                System.out.println(num2 + " " + num3 + " " + num1);
            }
        } 
        else if(num2 > num1 && num2 > num3) //if num2 is the largest
        {
            if(num1 > num3) //if num1 second largest
            {
                System.out.println(num3 + " " + num1 + " " + num2);
            } 
            else 
            {
                System.out.println(num1 + " " + num3 + " " + num2);
            }
        } 
        else if(num3 > num1 && num3 > num2) //if num3 is the largest
        {
            if(num1 > num2) //if num1 second largest
            {
                System.out.println(num2 + " " + num1 + " " + num3);
            } 
            else 
            {
                System.out.println(num1 + " " + num2 + " " + num3);
            }
        } 
        else 
        {
            System.out.println("Invalid input");
        }
        



    }
}
