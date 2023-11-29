//Exercise 6: Write a program that checks whether a given year is a leap year.



import java.time.Year;
import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (Year.isLeap(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
