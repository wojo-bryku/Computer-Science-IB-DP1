//Write a program that prints a Pascal’s triangle. The number of rows should depend on the user’s input.

import java.util.Scanner;



public class Ex17 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int r = reader.nextInt();

        int count = 1;
        int space = r - 1;

        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < space; j++)
            {
                System.out.print(" ");
            }
            space--;

            for(int j = 0; j <= i; j++)
            {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
            
        }

        



    }
}
