import java.util.Scanner;

public class GR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1;
        while (n > 0) {
            if (i % 3 == 0 && i % 5 != 0) {
                sum += i;
                n--;
            }
            i++;
        }
        System.out.println("The sum of the first " + n + " natural numbers divisible by 3 and not divisible by 5 is: " + sum);
    }
}
