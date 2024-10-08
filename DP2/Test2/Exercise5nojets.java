package DP2.Test2;
import java.util.Scanner;


public class Exercise5nojets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();

        boolean result = areAnagrams(str1, str2);
        System.out.println(result);

        sc.close();
        
    }
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) 
        {
            return false;
        }

        char[] arr1 = str1.toCharArray(); 
        char[] arr2 = str2.toCharArray();

        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        
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
