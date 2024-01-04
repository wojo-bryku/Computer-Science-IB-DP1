import java.util.Scanner;

public class Ex10test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        scanner.close();

        long[] fib = new long[n];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(fib[i]);
            sum += fib[i];
        }

        System.out.println("Sum: " + sum);
    }
}
