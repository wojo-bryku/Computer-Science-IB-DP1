import java.util.Scanner;


public class Ex4extra {
    public static void main(String[] args) {

    Scanner rd = new Scanner(System.in);
    int[] number = new int[10];
    for (int i = 0; i < 10; i++) {
      System.out.println("Enter a " + i + "number: ");
      number[i] = rd.nextInt();
    }

    for (int i = 0; i < 10; i++) {
      System.out.println("The number " + i + " is: " + number[i]);
    }
    

  }





}
