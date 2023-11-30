import java.util.Scanner;

public class Len{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Lenght");
    double len = scanner.nextDouble();

    System.out.println("Width");
    double wid = scanner.nextDouble();

    double area = len * wid;
    double peri = 2 * (len + wid);

    System.out.println("Area: " + area);
    System.out.println("Peri: " + peri);
    
    
  }





}
