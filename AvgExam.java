import java.util.Scanner;

public class AvgExam{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first exam score: ");
        double score1 = scanner.nextDouble();

        System.out.println("Enter your second exam score: ");
        double score2 = scanner.nextDouble();

        System.out.println("Enter your third exam score: ");
        double score3 = scanner.nextDouble();

        double avg = calculateAvg(score1, score2, score3);

        System.out.println("Your average is: " + avg);
    }





}