// Write a program that counts the numbers divisible by 3 and also counts the numbers divisible by 5 separately in an interval (inclusive) specified by the user. Use a while loop.

import java.util.Scanner;


public class Excersise4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Setting up the scanner

        System.out.println("Enter beggining number"); //prompt user
        int numB = reader.nextInt(); //read input

        System.out.println("Enter ending number"); //prompt user
        int numE = reader.nextInt(); //read input

        reader.close(); //closing scanner - saving memory


// counts the numbers divisible by 3 and also counts the numbers divisible by 5 separately in an interval (inclusive) specified by the user
        int count3 = 0;
        int count5 = 0;
        int i = numB;
        while(i <= numE) //while i is in the interval
        {
            if(i % 3 == 0) //if i is divisible by 3
            {
                count3++; // count3 = count3 +1; adding one to var each step
            }
            if(i % 5 == 0) //if i is divisible by 5 
            {
                count5++; // count5 = count5 +1; adding one to var each step
            }
            i++; // i = i +1; adding one to var each step
        }

//print results
        System.out.println("Numbers divisible by 3: " + count3);
        System.out.println("Numbers divisible by 5: " + count5);


    }
}