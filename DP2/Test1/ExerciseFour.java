//package DP2.Test1;

public class ExerciseFour {
    public static void main(String[] args) {

        int n = 5;
        int num = 4;


        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(num + " ");
                num += 3;
            }
            
            System.out.println();
        }

        
        
        
    }
}
