package SetFour; // what is it mean? It means that the file is in the folder SetFour
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        
        String word = "Hello World!";
        for(int i = 0; i < word.length(); i++)
        {
            String singleChar = word.substring(i, i + 1); 
            System.out.print(singleChar);
            try { //
                Thread.sleep(205); // sleep for 25 milliseconds
            } catch (InterruptedException e) { // catch the error  
                e.printStackTrace(); // print the error message
            }
        }


        

        

    }
}
