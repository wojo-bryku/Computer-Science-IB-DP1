import java.util.Scanner;

public class Digisum {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);  // Setting up the scanner
        
        System.out.println("Enter number"); //prompt user
        int num = reader.nextInt(); //read input
        reader.close(); //closing scanner - saving memory


        int sum = 0;
        while(num != 0)
        {
            int lastDig = num % 10;
            sum += lastDig;
            num /= 10;
        }


        System.out.println("Sum is: " + sum);
    }

}
