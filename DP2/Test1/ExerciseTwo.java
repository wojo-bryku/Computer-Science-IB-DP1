//package DP2.Test1;

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) 
    {
        for(int i = 1; i <= 50; i++)
        {
            int sum = 0;
            int num = i;

            while(num > 0)
            {
                sum += num % 10;
                num /= 10;
            }

            if(sum % 5 != 0)
            {
                System.out.println(i + " " + sum);
            }
        }

    }
}