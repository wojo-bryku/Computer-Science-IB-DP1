import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weight (in kg): ");
        double weight = scanner.nextDouble();

        System.out.println("Enter height (in meters): ");
        double height = scanner.nextDouble();

        double bmi = calculateBMI(weight, height);

        System.out.println("Your BMI is: " + bmi);
    }

    private static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
}
