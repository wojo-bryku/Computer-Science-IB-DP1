// Write a program that takes a person's age as input and prints whether they are a child (0-12), teenager (13-19), adult (20-59) or senior (60 and above). If the age is less than 20, the program should also print the number of years it will take for the person to become an adult. If the age is more than 20, the program should display how many years have passed since the person became an adult.

import java.util.Scanner;

public class Excersise2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Setting up the scanner
        System.out.println("Enter age"); //prompt user
        int age = reader.nextInt(); //read input

        reader.close(); //closing scanner - saving memory

        if(age >= 0 && age <= 12)
        {
            System.out.println("You are a child"); 
            System.out.println("You will become an adult in " + (20 - age) + " years"); 
        } 
        else if(age >= 13 && age <= 19)
        {
            System.out.println("You are a teenager");
            System.out.println("You will become an adult in " + (20 - age) + " years");
        } 
        else if(age >= 20 && age <= 59){
            System.out.println("You are an adult");
            System.out.println("You became an adult " + (age - 20) + " years ago");
        } 
        else if(age >= 60)
        {
            System.out.println("You are a senior");
            System.out.println("You became an adult " + (age - 20) + " years ago");
        } 
        else 
        {
            System.out.println("Invalid age");
        }

        
        


    }
}
