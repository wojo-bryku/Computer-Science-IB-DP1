//Create a Java program that elegantly displays all elements of a two-dimensional integer array.

package DP2;

import java.util.Scanner;


public class Arr1 {
    public static void main(String[] args) {
        

        // use method below
        int[][] arr = read2DArray();
        display2DArray(arr);
        


    }

    public static int[][] read2DArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the elements of row " + (i + 1) + ": ");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        return arr;
    }

    public static void display2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
