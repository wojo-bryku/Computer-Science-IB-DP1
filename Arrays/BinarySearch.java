import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        // ****************************
        // DO NOT MODIFY THE CODE BELOW
        // ****************************
        int[] myArray = generateSortedArray(20);
        System.out.println("Generated Array:");
        printArray(myArray); // to print the content of the array use this line

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the target value: ");
        int target = reader.nextInt();
        System.out.println("Looking for value: " + target);
        // ****************************
        // DO NOT MODIFY THE CODE ABOVE
        // ****************************

        // WRITE YOUR CODE HERE <------
        int min = 0;
        int max = 0;
        int mid = 0;
        boolean found = false;
        
        // Binary search algorithm implementation
        max = myArray.length - 1; // max index of the array
        while (min <= max) { // while the min index is less than or equal to the max index
            mid = (min + max) / 2;
            if (myArray[mid] == target) { // if the value at the mid index is equal to the target value
                found = true;
                break;
            } else if (myArray[mid] < target) { // if the value at the mid index is less than the target value
                min = mid + 1; // if the value at the mid index is less than the target value, set the min index to mid + 1
            } else {
                max = mid - 1; // if the value at the mid index is greater than the target value, set the max index to mid - 1
            }
        }

        if (found) {
            System.out.println("Value " + target + " found at index " + mid);
        } else {
            System.out.println("Value " + target + " not found");
        }



    }

    // ****************************
    // DO NOT MODIFY THE CODE BELOW
    // ****************************

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] generateSortedArray(int size) {
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(101);
        }
        Arrays.sort(array);
        return array;
    }
}
