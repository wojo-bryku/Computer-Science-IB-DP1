import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String word = reader.next();
        int index = reader.nextInt();

        System.out.println(word.substring(0, index));
    }    
}
