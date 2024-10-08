package DP2.Test2;
import java.util.Scanner;


public class ExerciseFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        boolean result = areAnagrams(str1, str2);
        System.out.println(result);

        
        
    }
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) 
        {
            return false;
        }

        char[] arr1 = new char[str1.length()];
        char[] arr2 = new char[str2.length()];

        for (int i = 0; i < str1.length(); i++) 
        {
            String temp = str1.substring(i, i + 1);
            arr1[i] = temp.charAt(0);
        }

        for (int i = 0; i < str2.length(); i++) 
        {
            String temp = str2.substring(i, i + 1);
            arr2[i] = temp.charAt(0);
        }

        for (int i = 0; i < arr1.length; i++) 
        {
            for (int j = i + 1; j < arr1.length; j++) 
            {
                if (arr1[i] > arr1[j]) 
                {
                    char temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr2.length; i++) 
        {
            for (int j = i + 1; j < arr2.length; j++) 
            {
                if (arr2[i] > arr2[j]) 
                {
                    char temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr1.length; i++) 
        {
            if (arr1[i] != arr2[i]) 
            {
                return false;
            }
        }
        return true;
    }

    
}
