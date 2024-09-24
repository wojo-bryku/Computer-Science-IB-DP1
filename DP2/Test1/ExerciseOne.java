//package DP2.Test1;


import java.util.Scanner;


public class ExerciseOne {
    public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
     
      System.out.println("Enter number");
      int n = sc.nextInt();


      int count = 0;
      
      for(int i = 1; i <= n; i++)
      {
        if(n % i == 0)
        {
          count++;
        }
      }



      if(count == 2)
      {
        System.out.println(n + " Is a prime number");
      }


      else
      {
        System.out.println(n + " Is not a prime number");
        System.out.println("Divisors are: ");


        for(int i = 1; i <= n; i++)
        {
          if(n % i == 0)
          {
            System.out.println(i);
          }
        }
      }

      
        
      

    }
    
}
