import java.util.Scanner;

public class Triangle
{
public static void main(String[] args) {
   
 
Scanner reader = new Scanner(System.in);
System.out.println("Write how many rows of triangle you want to have");
int nofrows = reader.nextInt();

int i,k,z;
int nofpossiblesums = 2 ^ (nofrows -1);
int[][] chart2 = new int[nofrows][nofpossiblesums];
int l = 0;

int[][] chart1 = new int[nofrows][nofrows];


for(i = 0; i<nofrows; i++){
   System.out.println("Podajesz liczby do rzedu " + (i+1));
   for( z = 0; z<i +1; z++){
       System.out.println("Input a number to a triangle");
       chart1[i][z] = reader.nextInt();}
 }
                                           
System.out.println("Twoj trojkat wyglada tak");
for(i = 0; i<nofrows; i++){
   for(z = l; z<nofrows; z++){
       System.out.print(" ");
   }
   for(k = 0; k<i+1; k++){
       System.out.print(chart1[i][k] + " ");
   }
   System.out.println();
   l = l+1;
}
for(int q =0; q<nofrows; q++){
    for(int w = 0; w<nofrows; w++){
         System.out.print(chart1[q][w] + " ");
    }
    System.out.println();

    
   
}
}
}
