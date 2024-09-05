import java.util.Scanner;


public class SmallestNuminInt {
    public static void main(String[] args){
    Scanner reader = new Scanner(System.in);  // Setting up the scanner

    System.out.println("Enter number"); //prompt user
    int num = reader.nextInt(); //read input
    reader.close(); //closing scanner - saving memory

    int smallest = 9;
    while(num != 0)
    {
        int lastDig = num % 10;
        if(lastDig < smallest)
        {
        smallest = lastDig;
        }

        num /= 10;
    }

    System.out.println(smallest);






    }


}
