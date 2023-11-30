//Write a Java program that converts a temperature given in Celsius to both Fahrenheit and Kelvin. The program should print the results.
import java.util.Scanner;

public class Excersise1{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Setting up the scanner
        System.out.println("Enter temperature in C");
        int tmpC = reader.nextInt(); //read input
        
        reader.close(); //closing scanner - saving memory

        double tmpF = tmpC * 1.8 + 32; //convert to Fahrenheit
        double tmpK = tmpC + 273.15; //convert to Kelvin
        
        //reader.remove(); //removing scanner to save memory

        System.out.println("Termperature in Fahrenheit is: " + tmpF); // output of temp in Fahrenheit
        System.out.println("And temperature in Kelvin is: " + tmpK); // output of temp in Kelvin

        

    }




}
