//Write a program that prints the pattern below. The number of rows should depend on the user’s input.
//1
//2 3
//4 5 6
//7 8 9 10

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int r = reader.nextInt();

        int count = 1;

        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
            
        }

    }

}
