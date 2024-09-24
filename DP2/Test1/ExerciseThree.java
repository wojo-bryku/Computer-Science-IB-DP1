//package DP2.Test1;


import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[size];

        for(int i = 0; i < size; i++)
        {
            System.out.println("Enter a string: ");
            arr[i] = sc.nextLine();
        }

        int count = 0;
        for(int i = 0; i < size; i++)
        {
            if(arr[i].contains("s"))
            {
                count++;
            }
        }

        if(count == size)
        {
            System.out.println("All strings contain the letter 's'");
        }

        else
        {
            String[] newArr = new String[size - count];
            int j = 0;
            
            for(int i = 0; i < size; i++)
            {
                if(!arr[i].contains("s"))
                {
                    newArr[j] = arr[i];
                    j++;
                }
            }

            for(int i = 0; i < size - count; i++)
            {
                System.out.println(newArr[i]);
            }
        }
    }

    
}
