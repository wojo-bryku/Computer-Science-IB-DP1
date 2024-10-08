package DP2.Test2;
import java.util.Scanner;


public class ExerciseFour {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) 
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value to find: ");
        int value = sc.nextInt();
        
        int index = findValue(arr, value);
        
        System.out.println("The index of the value is: ");
        System.out.println(index);




    }
    
    public static int findValue(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == value) 
            {
                return i;
            }
        }
        return -1;
    }



    
}
