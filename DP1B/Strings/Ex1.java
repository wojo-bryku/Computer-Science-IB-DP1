import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = reader.next();

        System.out.println("Enter an index: ");
        int index = reader.nextInt();

        String singleChar = word.substring(index, index + 1);
        if(index >= 0 && index < word.length())
            System.out.println("The character at index " + index + " is: " + singleChar);
        else
            System.out.println("Invalid index");
       
    }    
}
