import java.util.Scanner;



public class Ex14a {
  public static void main(String[] args) 
  {
    Scanner reader = new Scanner(System.in);
    // int array[5] input 
    int[] array = new int[5];
    int i;
    for (i = 0; i < 5; i++) {
      System.out.print("Enter a number: ");
      array[i] = reader.nextInt();
    }   
  }
}
