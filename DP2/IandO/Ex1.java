//Create a Java program that reads the content of the file names.txt and finds the shortest and longest names in the file. The program should display the shortest and longest names along with their lengths.
package DP2.IandO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.StandardOpenOption;

public class Ex1 {
    public static void main(String[] args) {

        try {
            Path filePath = Paths.get("names.txt");
            String content = Files.readString(filePath);

            String[] names = content.split("\n");

            String shortestName = names[0];
            String longestName = names[0];

            for (String name : names) 
            {
                if (name.length() < shortestName.length()) 
                {
                    shortestName = name;
                }
                if (name.length() > longestName.length()) 
                {
                    longestName = name;
                }
            }

            System.out.println("Shortest name: " + shortestName + " (" + shortestName.length() + " characters)");
            
            
            
            


            
            
            
        } catch (IOException e) {
            System.out.println("coś sie poszło nie ten teges");
            e.printStackTrace();
        }
        
    }
}
