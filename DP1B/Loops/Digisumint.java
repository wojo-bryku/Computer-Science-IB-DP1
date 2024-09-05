import java.util.Scanner;


public class Digisumint {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Setting up the scanner

        System.out.println("Enter number"); //prompt user
        int num = reader.nextInt(); //read input
        reader.close(); //closing scanner - saving memory


        int amd = 0; // amd - ammout of all digits
        while(0 != num)
        {
            num /= 10; 
            amd++;
        }

        System.out.println("# of dig is: " + amd);

    }
}
