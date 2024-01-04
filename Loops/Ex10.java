import java.util.Scanner;
import java.util.Random;

public class Ex10 {
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    Random random = new Random();

    int userNum = reader.nextInt();
    int num = random.nextInt(101);

    while(userNum != num)
    {
        if(userNum>num)
        {
            System.out.println("Too high");
            userNum = reader.nextInt();
        }
        if (userNum<num)
        {
            System.out.println("Too low");
            userNum = reader.nextInt();
        }
        if (userNum == num)
        {
            System.out.println("You guessed it!");
            break;
        }
    

    }
}
