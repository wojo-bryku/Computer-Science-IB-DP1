//Write a program that prints the pattern below. The number of rows should depend on the user’s input.

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int r = reader.nextInt();

        for(int i = 0; i < r; i++)
        {
           
            for(int j = 0; j <= i; j++)
            {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
            
        }

    }

}
