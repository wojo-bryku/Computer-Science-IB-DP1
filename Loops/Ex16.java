///Exercise 16: Write a program that prints the pattern below. The number of rows should depend on the user’s input. The trunk (the base) should always be centred and should consist of two rows.
//    *
//   ***
//  *****
// *******
//   ***
//   ***
import java.util.Scanner;


public class Ex16 {
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
                System.out.print("* ");
            }
            System.out.println();
            
        }
        //////Exercise 16: Write a program that prints the pattern below. The number of rows should depend on the user’s input. The trunk (the base) should always be centred and should consist of two rows.

        int trunk = r / 2;
        int trunkSpace = r - trunk;

        for(int i = 0; i < trunk; i++)
        {
            for(int j = 0; j < trunkSpace; j++)
            {
                System.out.print(" ");
            }
            for(int j = 0; j < 3; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            
        }
    }

}
