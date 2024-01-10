import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome or not");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        while(temp != 0){
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }
        if(rev == num){
            System.out.println("The number is a palindrome");
        }
        else{
            System.out.println("The number is not penis");
        }

    }




}