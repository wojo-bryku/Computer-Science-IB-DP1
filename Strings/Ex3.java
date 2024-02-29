import java.util.Scanner;


public class Ex3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String inputString = reader.next();

        System.out.println("Enter an innerword: ");
        String subString = reader.next();
        
        int index = inputString.indexOf(subString);
        if(index >= 0) // if the innerword is found
            System.out.println("The innerword is at index " + index);
        else
            System.out.println("The innerword is not in the word");

  
    }
    
}
