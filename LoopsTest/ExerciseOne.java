//Write a Java program that performs an alternating addition and subtraction on a sequence of numbers, starting from 1 up to a user-defined upper limit. The sequence should start with addition, followed by subtraction, and continue to alternate in this pattern.

import java.util.Scanner;

public class ExerciseOne{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int sum = 0;
        
        for(int i = 1; i <= num; i++){
            if(i % 2 == 0){
                sum -= i;
            }
            else{
                sum += i;
            }
        }
        System.out.println("The sum is " + sum);



    }

}