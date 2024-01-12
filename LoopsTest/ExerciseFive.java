//Write a Java program that checks whether a user specified number consists of all even numbers or of all odd numbers (0 is an even number).

import java.util.Scanner;


public class ExerciseFive{
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        //Write a Java program that checks whether a user specified number consists of all even numbers or of all odd numbers (0 is an even number).
        int even = 0;
        int odd = 0;
        int i = 0;
        while (i < num) //loop until i is less than num
        {
            if (i % 2 == 0) //even number 
            {
                even++; //increment 
            }
            else //odd number
            {
                odd++; //increment  
            }
            i++; //increment 
        }
        if (even == num)
        {
            System.out.println(num + " - the number consists of all even numbers");
        }
        else if (odd == num)
        {
            System.out.println(num + " - the number consists of all odd numbers");
        }
        else
        {
            System.out.println(num + " - the number consists of both even and odd numbers");
        }
        
       


  }
        


}
