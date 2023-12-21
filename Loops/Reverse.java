import java.Util.scanner

public class Reverse
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);  // Setting up the scanner

        System.out.println("Enter number"); //prompt user
        int num = reader.nextInt(); //read input

        reader.close(); //closing scanner - saving memory

        int reverse = 0;
        while(num != 0)
        {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        System.out.println(reverse);
    }
}