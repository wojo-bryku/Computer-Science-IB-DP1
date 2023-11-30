import java.util.Scanner; // import scanner... duh

public class Dig {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: "); // collect input
        double num = reader.nextDouble(); // store input
        reader.close(); // close readder - saving resources

        if (99 < num && num < 1000 && num % 111 == 0 || num % 11 ==0 || num % 110 == 0) // check if num is 3 diggit number but not unique
        { 
            System.out.println("3 diggit number. Not unique");
        }
        else if(99 < num && num < 1000) // check if num is 3 diggit number and unique
        { 
            System.out.println("Thee unique");
        }
        else
        {
            System.out.println("Not 3 diggit number"); // if num is not 3 diggit number
        }
        



        }




        
    }

